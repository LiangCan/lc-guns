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
import com.stylefeng.guns.modular.system.model.TUserHistoryStatistics;
import com.stylefeng.guns.modular.system.service.ITUserHistoryStatisticsService;

/**
 * 用户的流水记录管理控制器
 *
 * @author fengshuonan
 * @Date 2018-08-16 17:43:58
 */
@Controller
@RequestMapping("/tUserHistoryStatistics")
public class TUserHistoryStatisticsController extends BaseController {

    private String PREFIX = "/system/tUserHistoryStatistics/";

    @Autowired
    private ITUserHistoryStatisticsService tUserHistoryStatisticsService;

    /**
     * 跳转到用户的流水记录管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tUserHistoryStatistics.html";
    }

    /**
     * 跳转到添加用户的流水记录管理
     */
    @RequestMapping("/tUserHistoryStatistics_add")
    public String tUserHistoryStatisticsAdd() {
        return PREFIX + "tUserHistoryStatistics_add.html";
    }

    /**
     * 跳转到修改用户的流水记录管理
     */
    @RequestMapping("/tUserHistoryStatistics_update/{tUserHistoryStatisticsId}")
    public String tUserHistoryStatisticsUpdate(@PathVariable Integer tUserHistoryStatisticsId, Model model) {
        TUserHistoryStatistics tUserHistoryStatistics = tUserHistoryStatisticsService.selectById(tUserHistoryStatisticsId);
        model.addAttribute("item",tUserHistoryStatistics);
        LogObjectHolder.me().set(tUserHistoryStatistics);
        return PREFIX + "tUserHistoryStatistics_edit.html";
    }

    /**
     * 获取用户的流水记录管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tUserHistoryStatisticsService.selectList(null);
    }

    /**
     * 新增用户的流水记录管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TUserHistoryStatistics tUserHistoryStatistics) {
        tUserHistoryStatisticsService.insert(tUserHistoryStatistics);
        return SUCCESS_TIP;
    }

    /**
     * 删除用户的流水记录管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Long tUserHistoryStatisticsId) {
        tUserHistoryStatisticsService.deleteById(tUserHistoryStatisticsId);
        return SUCCESS_TIP;
    }

    /**
     * 修改用户的流水记录管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TUserHistoryStatistics tUserHistoryStatistics) {
        tUserHistoryStatisticsService.updateById(tUserHistoryStatistics);
        return SUCCESS_TIP;
    }

    /**
     * 用户的流水记录管理详情
     */
    @RequestMapping(value = "/detail/{tUserHistoryStatisticsId}")
    @ResponseBody
    public Object detail(@PathVariable("tUserHistoryStatisticsId") Integer tUserHistoryStatisticsId) {
        return tUserHistoryStatisticsService.selectById(tUserHistoryStatisticsId);
    }
}
