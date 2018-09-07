/**
 * 初始化域名管理详情对话框
 */
var TDomainNameInfoDlg = {
    tDomainNameInfoData : {}
};

/**
 * 清除数据
 */
TDomainNameInfoDlg.clearData = function() {
    this.tDomainNameInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TDomainNameInfoDlg.set = function(key, val) {
    this.tDomainNameInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TDomainNameInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TDomainNameInfoDlg.close = function() {
    parent.layer.close(window.parent.TDomainName.layerIndex);
}

/**
 * 收集数据
 */
TDomainNameInfoDlg.collectData = function() {
    this
    .set('id')
    .set('domainName')
    .set('name');
}

/**
 * 提交添加
 */
TDomainNameInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tDomainName/add", function(data){
        Feng.success("添加成功!");
        window.parent.TDomainName.table.refresh();
        TDomainNameInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tDomainNameInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TDomainNameInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tDomainName/update", function(data){
        Feng.success("修改成功!");
        window.parent.TDomainName.table.refresh();
        TDomainNameInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tDomainNameInfoData);
    ajax.start();
}

$(function() {

});
