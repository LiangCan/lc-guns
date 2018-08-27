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
import com.stylefeng.guns.modular.system.model.TPeriodStatistics;
import com.stylefeng.guns.modular.system.service.ITPeriodStatisticsService;

/**
 * 每期统计控制器
 *
 * @author fengshuonan
 * @Date 2018-08-16 15:44:46
 */
@Controller
@RequestMapping("/tPeriodStatistics")
public class TPeriodStatisticsController extends BaseController {

    private String PREFIX = "/system/tPeriodStatistics/";

    @Autowired
    private ITPeriodStatisticsService tPeriodStatisticsService;

    /**
     * 跳转到每期统计首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tPeriodStatistics.html";
    }

    /**
     * 跳转到添加每期统计
     */
    @RequestMapping("/tPeriodStatistics_add")
    public String tPeriodStatisticsAdd() {
        return PREFIX + "tPeriodStatistics_add.html";
    }

    /**
     * 跳转到修改每期统计
     */
    @RequestMapping("/tPeriodStatistics_update/{tPeriodStatisticsId}")
    public String tPeriodStatisticsUpdate(@PathVariable Integer tPeriodStatisticsId, Model model) {
        TPeriodStatistics tPeriodStatistics = tPeriodStatisticsService.selectById(tPeriodStatisticsId);
        model.addAttribute("item",tPeriodStatistics);
        LogObjectHolder.me().set(tPeriodStatistics);
        return PREFIX + "tPeriodStatistics_edit.html";
    }

    /**
     * 获取每期统计列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tPeriodStatisticsService.selectList(null);
    }

    /**
     * 新增每期统计
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TPeriodStatistics tPeriodStatistics) {
        tPeriodStatisticsService.insert(tPeriodStatistics);
        return SUCCESS_TIP;
    }

    /**
     * 删除每期统计
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer tPeriodStatisticsId) {
        tPeriodStatisticsService.deleteById(tPeriodStatisticsId);
        return SUCCESS_TIP;
    }

    /**
     * 修改每期统计
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TPeriodStatistics tPeriodStatistics) {
        tPeriodStatisticsService.updateById(tPeriodStatistics);
        return SUCCESS_TIP;
    }

    /**
     * 每期统计详情
     */
    @RequestMapping(value = "/detail/{tPeriodStatisticsId}")
    @ResponseBody
    public Object detail(@PathVariable("tPeriodStatisticsId") Integer tPeriodStatisticsId) {
        return tPeriodStatisticsService.selectById(tPeriodStatisticsId);
    }
}
