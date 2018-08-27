/**
 * 用户管理管理初始化
 */
var TUserInfo = {
    id: "TUserInfoTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TUserInfo.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '用户ID', field: 'uid', visible: true, align: 'center', valign: 'middle'},
            {title: '用户名', field: 'userName', visible: true, align: 'center', valign: 'middle'},
            {title: '用户的qq （账号）', field: 'userQq', visible: true, align: 'center', valign: 'middle'},
            {title: '用户的密码', field: 'userPassword', visible: true, align: 'center', valign: 'middle'},
            {title: '用户的积分', field: 'integral', visible: true, align: 'center', valign: 'middle'},
            {title: '推荐的用户', field: 'recommendUser', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
TUserInfo.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TUserInfo.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加用户管理
 */
TUserInfo.openAddTUserInfo = function () {
    var index = layer.open({
        type: 2,
        title: '添加用户管理',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tUserInfo/tUserInfo_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看用户管理详情
 */
TUserInfo.openTUserInfoDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '用户管理详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tUserInfo/tUserInfo_update/' + TUserInfo.seItem.uid
        });
        this.layerIndex = index;
    }
};

/**
 * 删除用户管理
 */
TUserInfo.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tUserInfo/delete", function (data) {
            Feng.success("删除成功!");
            TUserInfo.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tUserInfoId",this.seItem.uid);
        ajax.start();
    }
};

/**
 * 查询用户管理列表
 */
TUserInfo.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TUserInfo.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TUserInfo.initColumn();
    var table = new BSTable(TUserInfo.id, "/tUserInfo/list", defaultColunms);
    table.setPaginationType("client");
    TUserInfo.table = table.init();
});
