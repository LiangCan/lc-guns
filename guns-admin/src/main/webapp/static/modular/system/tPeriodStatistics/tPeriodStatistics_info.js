/**
 * 初始化每期统计详情对话框
 */
var TPeriodStatisticsInfoDlg = {
    tPeriodStatisticsInfoData : {}
};

/**
 * 清除数据
 */
TPeriodStatisticsInfoDlg.clearData = function() {
    this.tPeriodStatisticsInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TPeriodStatisticsInfoDlg.set = function(key, val) {
    this.tPeriodStatisticsInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TPeriodStatisticsInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TPeriodStatisticsInfoDlg.close = function() {
    parent.layer.close(window.parent.TPeriodStatistics.layerIndex);
}

/**
 * 收集数据
 */
TPeriodStatisticsInfoDlg.collectData = function() {
    this
    .set('id')
    .set('period')
    .set('numOfPeople')
    .set('bigCount')
    .set('smallCount')
    .set('singleCount')
    .set('doubleCount')
    .set('bigSingleCount')
    .set('bigDoubleCount')
    .set('smallSingleCount')
    .set('smallDoubleCount')
    .set('coupletCount')
    .set('alongCount')
    .set('leopardCount')
    .set('count0')
    .set('count1')
    .set('count2')
    .set('count3')
    .set('count4')
    .set('count5')
    .set('count6')
    .set('count7')
    .set('count8')
    .set('count9')
    .set('count10')
    .set('count11')
    .set('count12')
    .set('count13')
    .set('count14')
    .set('count15')
    .set('count16')
    .set('count17')
    .set('count18')
    .set('count19')
    .set('count20')
    .set('count21')
    .set('count22')
    .set('count23')
    .set('count24')
    .set('count25')
    .set('count26')
    .set('count27');
}

/**
 * 提交添加
 */
TPeriodStatisticsInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tPeriodStatistics/add", function(data){
        Feng.success("添加成功!");
        window.parent.TPeriodStatistics.table.refresh();
        TPeriodStatisticsInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tPeriodStatisticsInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TPeriodStatisticsInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tPeriodStatistics/update", function(data){
        Feng.success("修改成功!");
        window.parent.TPeriodStatistics.table.refresh();
        TPeriodStatisticsInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tPeriodStatisticsInfoData);
    ajax.start();
}

$(function() {

});
