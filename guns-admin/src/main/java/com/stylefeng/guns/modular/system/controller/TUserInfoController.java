package com.stylefeng.guns.modular.system.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.TUserInfo;
import com.stylefeng.guns.modular.system.service.ITUserInfoService;

/**
 * 用户管理控制器
 *
 * @author fengshuonan
 * @Date 2018-08-15 14:08:14
 */
@Controller
@RequestMapping("/tUserInfo")
public class TUserInfoController extends BaseController {

    private String PREFIX = "/system/tUserInfo/";

    @Autowired
    private ITUserInfoService tUserInfoService;

    /**
     * 跳转到用户管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tUserInfo.html";
    }

    /**
     * 跳转到添加用户管理
     */
    @RequestMapping("/tUserInfo_add")
    public String tUserInfoAdd() {
        return PREFIX + "tUserInfo_add.html";
    }

    /**
     * 跳转到修改用户管理
     */
    @RequestMapping("/tUserInfo_update/{tUserInfoId}")
    public String tUserInfoUpdate(@PathVariable Integer tUserInfoId, Model model) {
        TUserInfo tUserInfo = tUserInfoService.selectById(tUserInfoId);
        model.addAttribute("item",tUserInfo);
        LogObjectHolder.me().set(tUserInfo);
        return PREFIX + "tUserInfo_edit.html";
    }

    /**
     * 获取用户管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tUserInfoService.selectList(null);
    }

    /**
     * 新增用户管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TUserInfo tUserInfo) {
        tUserInfoService.insert(tUserInfo);
        return SUCCESS_TIP;
    }

    /**
     * 删除用户管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Long tUserInfoId) {
        tUserInfoService.deleteById(tUserInfoId);
        return SUCCESS_TIP;
    }

    /**
     * 修改用户管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TUserInfo tUserInfo) {
        tUserInfoService.updateById(tUserInfo);
        return SUCCESS_TIP;
    }

    /**
     * 用户管理详情
     */
    @RequestMapping(value = "/detail/{tUserInfoId}")
    @ResponseBody
    public Object detail(@PathVariable("tUserInfoId") Integer tUserInfoId) {
        return tUserInfoService.selectById(tUserInfoId);
    }
}
