/**
 * 域名管理管理初始化
 */
var TDomainName = {
    id: "TDomainNameTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TDomainName.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: 'ID', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '域名', field: 'domainName', visible: true, align: 'center', valign: 'middle'},
            {title: '联系人', field: 'name', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
TDomainName.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TDomainName.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加域名管理
 */
TDomainName.openAddTDomainName = function () {
    var index = layer.open({
        type: 2,
        title: '添加域名管理',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tDomainName/tDomainName_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看域名管理详情
 */
TDomainName.openTDomainNameDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '域名管理详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tDomainName/tDomainName_update/' + TDomainName.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除域名管理
 */
TDomainName.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tDomainName/delete", function (data) {
            Feng.success("删除成功!");
            TDomainName.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tDomainNameId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询域名管理列表
 */
TDomainName.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TDomainName.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TDomainName.initColumn();
    var table = new BSTable(TDomainName.id, "/tDomainName/list", defaultColunms);
    table.setPaginationType("client");
    TDomainName.table = table.init();
});
