/**
 * 每期赔率管理初始化
 */
var TPeriodOdds = {
    id: "TPeriodOddsTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
TPeriodOdds.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: 'ID', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '第多少期', field: 'period', visible: true, align: 'center', valign: 'middle'},
            {title: '游戏ID', field: 'gameId', visible: true, align: 'center', valign: 'middle'},
            {title: '参与人数', field: 'numOfPeople', visible: true, align: 'center', valign: 'middle'},
            {title: '大的赔率', field: 'bigOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '小的赔率', field: 'smallOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '单的统计', field: 'singleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '双的统计', field: 'doubleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '大单的统计', field: 'bigSingleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '大双的统计', field: 'bigDoubleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '小单的统计', field: 'smallSingleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '小双的统计', field: 'smallDoubleOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '对子的统计', field: 'coupletOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '顺子的统计', field: 'alongOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '豹子的统计', field: 'leopardOdds', visible: true, align: 'center', valign: 'middle'},
            {title: '0', field: 'odds0', visible: true, align: 'center', valign: 'middle'},
            {title: '1', field: 'odds1', visible: true, align: 'center', valign: 'middle'},
            {title: '2', field: 'odds2', visible: true, align: 'center', valign: 'middle'},
            {title: '3', field: 'odds3', visible: true, align: 'center', valign: 'middle'},
            {title: '4', field: 'odds4', visible: false, align: 'center', valign: 'middle'},
            {title: '5', field: 'odds5', visible: false, align: 'center', valign: 'middle'},
            {title: '6', field: 'odds6', visible: false, align: 'center', valign: 'middle'},
            {title: '7', field: 'odds7', visible: false, align: 'center', valign: 'middle'},
            {title: '8', field: 'odds8', visible: false, align: 'center', valign: 'middle'},
            {title: '9', field: 'odds9', visible: false, align: 'center', valign: 'middle'},
            {title: '10', field: 'odds10', visible: false, align: 'center', valign: 'middle'},
            {title: '11', field: 'odds11', visible: false, align: 'center', valign: 'middle'},
            {title: '12', field: 'odds12', visible: false, align: 'center', valign: 'middle'},
            {title: '13', field: 'odds13', visible: false, align: 'center', valign: 'middle'},
            {title: '14', field: 'odds14', visible: false, align: 'center', valign: 'middle'},
            {title: '15', field: 'odds15', visible: false, align: 'center', valign: 'middle'},
            {title: '16', field: 'odds16', visible: false, align: 'center', valign: 'middle'},
            {title: '17', field: 'odds17', visible: false, align: 'center', valign: 'middle'},
            {title: '18', field: 'odds18', visible: false, align: 'center', valign: 'middle'},
            {title: '19', field: 'odds19', visible: false, align: 'center', valign: 'middle'},
            {title: '20', field: 'odds20', visible: false, align: 'center', valign: 'middle'},
            {title: '21', field: 'odds21', visible: false, align: 'center', valign: 'middle'},
            {title: '22', field: 'odds22', visible: false, align: 'center', valign: 'middle'},
            {title: '23', field: 'odds23', visible: false, align: 'center', valign: 'middle'},
            {title: '24', field: 'odds24', visible: false, align: 'center', valign: 'middle'},
            {title: '25', field: 'odds25', visible: false, align: 'center', valign: 'middle'},
            {title: '26', field: 'odds26', visible: false, align: 'center', valign: 'middle'},
            {title: '27', field: 'odds27', visible: false, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
TPeriodOdds.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        TPeriodOdds.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加每期赔率
 */
TPeriodOdds.openAddTPeriodOdds = function () {
    var index = layer.open({
        type: 2,
        title: '添加每期赔率',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/tPeriodOdds/tPeriodOdds_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看每期赔率详情
 */
TPeriodOdds.openTPeriodOddsDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '每期赔率详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/tPeriodOdds/tPeriodOdds_update/' + TPeriodOdds.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除每期赔率
 */
TPeriodOdds.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/tPeriodOdds/delete", function (data) {
            Feng.success("删除成功!");
            TPeriodOdds.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("tPeriodOddsId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询每期赔率列表
 */
TPeriodOdds.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    TPeriodOdds.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = TPeriodOdds.initColumn();
    var table = new BSTable(TPeriodOdds.id, "/tPeriodOdds/list", defaultColunms);
    table.setPaginationType("client");
    TPeriodOdds.table = table.init();
});
