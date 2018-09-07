package com.stylefeng.guns.modular.domain.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.TDomainName;
import com.stylefeng.guns.modular.domain.service.ITDomainNameService;

/**
 * 域名管理控制器
 *
 * @author fengshuonan
 * @Date 2018-09-06 13:55:47
 */
@Controller
@RequestMapping("/tDomainName")
public class TDomainNameController extends BaseController {

    private String PREFIX = "/domain/tDomainName/";

    @Autowired
    private ITDomainNameService tDomainNameService;

    /**
     * 跳转到域名管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tDomainName.html";
    }

    /**
     * 跳转到添加域名管理
     */
    @RequestMapping("/tDomainName_add")
    public String tDomainNameAdd() {
        return PREFIX + "tDomainName_add.html";
    }

    /**
     * 跳转到修改域名管理
     */
    @RequestMapping("/tDomainName_update/{tDomainNameId}")
    public String tDomainNameUpdate(@PathVariable Integer tDomainNameId, Model model) {
        TDomainName tDomainName = tDomainNameService.selectById(tDomainNameId);
        model.addAttribute("item",tDomainName);
        LogObjectHolder.me().set(tDomainName);
        return PREFIX + "tDomainName_edit.html";
    }

    /**
     * 获取域名管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tDomainNameService.selectList(null);
    }

    /**
     * 新增域名管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TDomainName tDomainName) {
        tDomainNameService.insert(tDomainName);
        return SUCCESS_TIP;
    }

    /**
     * 删除域名管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer tDomainNameId) {
        tDomainNameService.deleteById(tDomainNameId);
        return SUCCESS_TIP;
    }

    /**
     * 修改域名管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TDomainName tDomainName) {
        tDomainNameService.updateById(tDomainName);
        return SUCCESS_TIP;
    }

    /**
     * 域名管理详情
     */
    @RequestMapping(value = "/detail/{tDomainNameId}")
    @ResponseBody
    public Object detail(@PathVariable("tDomainNameId") Integer tDomainNameId) {
        return tDomainNameService.selectById(tDomainNameId);
    }
}
