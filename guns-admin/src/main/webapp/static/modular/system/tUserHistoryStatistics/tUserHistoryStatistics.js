/**
 * 用户的流水记录管理管理初始化
 */
var TUserHistoryStatistics = {
    id: "TUserHistoryStatisticsTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TUserHistoryStatistics.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: 'ID', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '游戏ID', field: 'gameId', visible: true, align: 'center', valign: 'middle'},
            {title: '第多少期', field: 'period', visible: true, align: 'center', valign: 'middle'},
            {title: '总压', field: 'sumCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压大', field: 'bigCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压小', field: 'smallCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压单', field: 'singleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压双', field: 'doubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压大单', field: 'bigSingleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压大双', field: 'bigDoubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压小单', field: 'smallSingleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压小双', field: 'smallDoubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压对子', field: 'coupletCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压顺子', field: 'alongCount', visible: true, align: 'center', valign: 'middle'},
            {title: '压豹子', field: 'leopardCount', visible: true, align: 'center', valign: 'middle'},
            {title: '用户ID', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '最终统计', field: 'countSub', visible: true, align: 'center', valign: 'middle'},
            {title: '0', field: 'count0', visible: true, align: 'center', valign: 'middle'},
            {title: '1', field: 'count1', visible: false, align: 'center', valign: 'middle'},
            {title: '2', field: 'count2', visible: false, align: 'center', valign: 'middle'},
            {title: '3', field: 'count3', visible: false, align: 'center', valign: 'middle'},
            {title: '4', field: 'count4', visible: false, align: 'center', valign: 'middle'},
            {title: '5', field: 'count5', visible: false, align: 'center', valign: 'middle'},
            {title: '6', field: 'count6', visible: false, align: 'center', valign: 'middle'},
            {title: '7', field: 'count7', visible: false, align: 'center', valign: 'middle'},
            {title: '8', field: 'count8', visible: false, align: 'center', valign: 'middle'},
            {title: '9', field: 'count9', visible: false, align: 'center', valign: 'middle'},
            {title: '10', field: 'count10', visible: false, align: 'center', valign: 'middle'},
            {title: '11', field: 'count11', visible: false, align: 'center', valign: 'middle'},
            {title: '12', field: 'count12', visible: false, align: 'center', valign: 'middle'},
            {title: '13', field: 'count13', visible: false, align: 'center', valign: 'middle'},
            {title: '14', field: 'count14', visible: false, align: 'center', valign: 'middle'},
            {title: '15', field: 'count15', visible: false, align: 'center', valign: 'middle'},
            {title: '16', field: 'count16', visible: false, align: 'center', valign: 'middle'},
            {title: '17', field: 'count17', visible: false, align: 'center', valign: 'middle'},
            {title: '18', field: 'count18', visible: false, align: 'center', valign: 'middle'},
            {title: '19', field: 'count19', visible: false, align: 'center', valign: 'middle'},
            {title: '20', field: 'count20', visible: false, align: 'center', valign: 'middle'},
            {title: '21', field: 'count21', visible: false, align: 'center', valign: 'middle'},
            {title: '22', field: 'count22', visible: false, align: 'center', valign: 'middle'},
            {title: '23', field: 'count23', visible: false, align: 'center', valign: 'middle'},
            {title: '24', field: 'count24', visible: false, align: 'center', valign: 'middle'},
            {title: '25', field: 'count25', visible: false, align: 'center', valign: 'middle'},
            {title: '26', field: 'count26', visible: false, align: 'center', valign: 'middle'},
            {title: '27', field: 'count27', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
TUserHistoryStatistics.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TUserHistoryStatistics.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加用户的流水记录管理
 */
TUserHistoryStatistics.openAddTUserHistoryStatistics = function () {
    var index = layer.open({
        type: 2,
        title: '添加用户的流水记录管理',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tUserHistoryStatistics/tUserHistoryStatistics_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看用户的流水记录管理详情
 */
TUserHistoryStatistics.openTUserHistoryStatisticsDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '用户的流水记录管理详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tUserHistoryStatistics/tUserHistoryStatistics_update/' + TUserHistoryStatistics.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除用户的流水记录管理
 */
TUserHistoryStatistics.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tUserHistoryStatistics/delete", function (data) {
            Feng.success("删除成功!");
            TUserHistoryStatistics.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tUserHistoryStatisticsId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询用户的流水记录管理列表
 */
TUserHistoryStatistics.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TUserHistoryStatistics.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TUserHistoryStatistics.initColumn();
    var table = new BSTable(TUserHistoryStatistics.id, "/tUserHistoryStatistics/list", defaultColunms);
    table.setPaginationType("client");
    TUserHistoryStatistics.table = table.init();
});
