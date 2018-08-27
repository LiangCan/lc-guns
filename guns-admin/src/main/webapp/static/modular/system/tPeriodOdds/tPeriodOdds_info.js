/**
 * 初始化每期赔率详情对话框
 */
var TPeriodOddsInfoDlg = {
    tPeriodOddsInfoData : {}
};

/**
 * 清除数据
 */
TPeriodOddsInfoDlg.clearData = function() {
    this.tPeriodOddsInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TPeriodOddsInfoDlg.set = function(key, val) {
    this.tPeriodOddsInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TPeriodOddsInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TPeriodOddsInfoDlg.close = function() {
    parent.layer.close(window.parent.TPeriodOdds.layerIndex);
}

/**
 * 收集数据
 */
TPeriodOddsInfoDlg.collectData = function() {
    this
    .set('id')
    .set('period')
    .set('numOfPeople')
    .set('bigOdds')
    .set('smallOdds')
    .set('singleOdds')
    .set('doubleOdds')
    .set('bigSingleOdds')
    .set('bigDoubleOdds')
    .set('smallSingleOdds')
    .set('smallDoubleOdds')
    .set('coupletOdds')
    .set('alongOdds')
    .set('leopardOdds')
    .set('odds0')
    .set('odds1')
    .set('odds2')
    .set('odds3')
    .set('odds4')
    .set('odds5')
    .set('odds6')
    .set('odds7')
    .set('odds8')
    .set('odds9')
    .set('odds10')
    .set('odds11')
    .set('odds12')
    .set('odds13')
    .set('odds14')
    .set('odds15')
    .set('odds16')
    .set('odds17')
    .set('odds18')
    .set('odds19')
    .set('odds20')
    .set('odds21')
    .set('odds22')
    .set('odds23')
    .set('odds24')
    .set('odds25')
    .set('odds26')
    .set('odds27');
}

/**
 * 提交添加
 */
TPeriodOddsInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tPeriodOdds/add", function(data){
        Feng.success("添加成功!");
        window.parent.TPeriodOdds.table.refresh();
        TPeriodOddsInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tPeriodOddsInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TPeriodOddsInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tPeriodOdds/update", function(data){
        Feng.success("修改成功!");
        window.parent.TPeriodOdds.table.refresh();
        TPeriodOddsInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tPeriodOddsInfoData);
    ajax.start();
}

$(function() {

});
