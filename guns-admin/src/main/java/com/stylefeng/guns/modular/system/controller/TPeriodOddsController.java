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
import com.stylefeng.guns.modular.system.model.TPeriodOdds;
import com.stylefeng.guns.modular.system.service.ITPeriodOddsService;

/**
 * 每期赔率控制器
 *
 * @author fengshuonan
 * @Date 2018-08-16 14:30:05
 */
@Controller
@RequestMapping("/tPeriodOdds")
public class TPeriodOddsController extends BaseController {

    private String PREFIX = "/system/tPeriodOdds/";

    @Autowired
    private ITPeriodOddsService tPeriodOddsService;

    /**
     * 跳转到每期赔率首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tPeriodOdds.html";
    }

    /**
     * 跳转到添加每期赔率
     */
    @RequestMapping("/tPeriodOdds_add")
    public String tPeriodOddsAdd() {
        return PREFIX + "tPeriodOdds_add.html";
    }

    /**
     * 跳转到修改每期赔率
     */
    @RequestMapping("/tPeriodOdds_update/{tPeriodOddsId}")
    public String tPeriodOddsUpdate(@PathVariable Long tPeriodOddsId, Model model) {
        TPeriodOdds tPeriodOdds = tPeriodOddsService.selectById(tPeriodOddsId);
        model.addAttribute("item",tPeriodOdds);
        LogObjectHolder.me().set(tPeriodOdds);
        return PREFIX + "tPeriodOdds_edit.html";
    }

    /**
     * 获取每期赔率列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tPeriodOddsService.selectList(null);
    }

    /**
     * 新增每期赔率
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TPeriodOdds tPeriodOdds) {
        tPeriodOddsService.insert(tPeriodOdds);
        return SUCCESS_TIP;
    }

    /**
     * 删除每期赔率
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Long tPeriodOddsId) {
        tPeriodOddsService.deleteById(tPeriodOddsId);
        return SUCCESS_TIP;
    }

    /**
     * 修改每期赔率
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TPeriodOdds tPeriodOdds) {
        tPeriodOddsService.updateById(tPeriodOdds);
        return SUCCESS_TIP;
    }

    /**
     * 每期赔率详情
     */
    @RequestMapping(value = "/detail/{tPeriodOddsId}")
    @ResponseBody
    public Object detail(@PathVariable("tPeriodOddsId") Integer tPeriodOddsId) {
        return tPeriodOddsService.selectById(tPeriodOddsId);
    }
}
