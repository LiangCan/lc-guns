/**
 * 初始化用户的流水记录管理详情对话框
 */
var TUserHistoryStatisticsInfoDlg = {
    tUserHistoryStatisticsInfoData : {}
};

/**
 * 清除数据
 */
TUserHistoryStatisticsInfoDlg.clearData = function() {
    this.tUserHistoryStatisticsInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TUserHistoryStatisticsInfoDlg.set = function(key, val) {
    this.tUserHistoryStatisticsInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TUserHistoryStatisticsInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TUserHistoryStatisticsInfoDlg.close = function() {
    parent.layer.close(window.parent.TUserHistoryStatistics.layerIndex);
}

/**
 * 收集数据
 */
TUserHistoryStatisticsInfoDlg.collectData = function() {
    this
    .set('id')
    .set('gameId')
    .set('period')
    .set('sumCount')
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
    .set('userId')
    .set('countSub')
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
TUserHistoryStatisticsInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tUserHistoryStatistics/add", function(data){
        Feng.success("添加成功!");
        window.parent.TUserHistoryStatistics.table.refresh();
        TUserHistoryStatisticsInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tUserHistoryStatisticsInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TUserHistoryStatisticsInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tUserHistoryStatistics/update", function(data){
        Feng.success("修改成功!");
        window.parent.TUserHistoryStatistics.table.refresh();
        TUserHistoryStatisticsInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tUserHistoryStatisticsInfoData);
    ajax.start();
}

$(function() {

});
