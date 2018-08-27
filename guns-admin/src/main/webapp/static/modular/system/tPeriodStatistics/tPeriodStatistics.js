/**
 * 每期统计管理初始化
 */
var TPeriodStatistics = {
    id: "TPeriodStatisticsTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TPeriodStatistics.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: 'ID', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '第多少期', field: 'period', visible: true, align: 'center', valign: 'middle'},
            {title: '参与人数', field: 'numOfPeople', visible: true, align: 'center', valign: 'middle'},
            {title: '大的统计', field: 'bigCount', visible: true, align: 'center', valign: 'middle'},
            {title: '小的统计', field: 'smallCount', visible: true, align: 'center', valign: 'middle'},
            {title: '单的统计', field: 'singleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '双的统计', field: 'doubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '大单的统计', field: 'bigSingleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '大双的统计', field: 'bigDoubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '小单的统计', field: 'smallSingleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '小双的统计', field: 'smallDoubleCount', visible: true, align: 'center', valign: 'middle'},
            {title: '对子的统计', field: 'coupletCount', visible: true, align: 'center', valign: 'middle'},
            {title: '顺子的统计', field: 'alongCount', visible: true, align: 'center', valign: 'middle'},
            {title: '豹子的统计', field: 'leopardCount', visible: true, align: 'center', valign: 'middle'},
            {title: '0', field: 'count0', visible: true, align: 'center', valign: 'middle'},
            {title: '1', field: 'count1', visible: true, align: 'center', valign: 'middle'},
            {title: '2', field: 'count2', visible: true, align: 'center', valign: 'middle'},
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
TPeriodStatistics.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TPeriodStatistics.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加每期统计
 */
TPeriodStatistics.openAddTPeriodStatistics = function () {
    var index = layer.open({
        type: 2,
        title: '添加每期统计',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tPeriodStatistics/tPeriodStatistics_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看每期统计详情
 */
TPeriodStatistics.openTPeriodStatisticsDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '每期统计详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tPeriodStatistics/tPeriodStatistics_update/' + TPeriodStatistics.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除每期统计
 */
TPeriodStatistics.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tPeriodStatistics/delete", function (data) {
            Feng.success("删除成功!");
            TPeriodStatistics.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tPeriodStatisticsId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询每期统计列表
 */
TPeriodStatistics.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TPeriodStatistics.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TPeriodStatistics.initColumn();
    var table = new BSTable(TPeriodStatistics.id, "/tPeriodStatistics/list", defaultColunms);
    table.setPaginationType("client");
    TPeriodStatistics.table = table.init();
});
