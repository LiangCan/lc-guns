/**
 * 初始化用户管理详情对话框
 */
var TUserInfoInfoDlg = {
    tUserInfoInfoData : {}
};

/**
 * 清除数据
 */
TUserInfoInfoDlg.clearData = function() {
    this.tUserInfoInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TUserInfoInfoDlg.set = function(key, val) {
    this.tUserInfoInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
TUserInfoInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
TUserInfoInfoDlg.close = function() {
    parent.layer.close(window.parent.TUserInfo.layerIndex);
}

/**
 * 收集数据
 */
TUserInfoInfoDlg.collectData = function() {
    this
    .set('uid')
    .set('userName')
    .set('userQq')
    .set('userPassword')
    .set('integral')
        .set('recommendUser');
}

/**
 * 提交添加
 */
TUserInfoInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tUserInfo/add", function(data){
        Feng.success("添加成功!");
        window.parent.TUserInfo.table.refresh();
        TUserInfoInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tUserInfoInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
TUserInfoInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/tUserInfo/update", function(data){
        Feng.success("修改成功!");
        window.parent.TUserInfo.table.refresh();
        TUserInfoInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.tUserInfoInfoData);
    ajax.start();
}

$(function() {

});
