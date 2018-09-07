package com.stylefeng.guns.modular.system.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.TGameOdds;
import com.stylefeng.guns.modular.system.service.ITGameOddsService;

/**
 * 项目管理控制器
 *
 * @author fengshuonan
 * @Date 2018-08-16 11:56:57
 */
@Controller
@RequestMapping("/tGameOdds")
public class TGameOddsController extends BaseController {

    private String PREFIX = "/system/tGameOdds/";
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ITGameOddsService tGameOddsService;

    /**
     * 跳转到项目管理首页
     */
    @RequestMapping("/cp")
    public String cpIndex() {
        return PREFIX + "cpGame.html";
    }

    /**
     * 跳转到项目管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tGameOdds.html";
    }

    /**
     * 跳转到添加项目管理
     */
    @RequestMapping("/tGameOdds_add")
    public String tGameOddsAdd() {
        return PREFIX + "tGameOdds_add.html";
    }

    /**
     * 跳转到修改项目管理
     */
    @RequestMapping("/tGameOdds_update/{tGameOddsId}")
    public String tGameOddsUpdate(@PathVariable Integer tGameOddsId, Model model) {
        TGameOdds tGameOdds = tGameOddsService.selectById(tGameOddsId);
        model.addAttribute("item",tGameOdds);
        LogObjectHolder.me().set(tGameOdds);
        return PREFIX + "tGameOdds_edit.html";
    }

    /**
     * 获取项目管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tGameOddsService.selectList(null);
    }

    /**
     * 新增项目管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TGameOdds tGameOdds) {
        tGameOddsService.insert(tGameOdds);
        return SUCCESS_TIP;
    }

    @RequestMapping(value = "/cpSubmit")
    @ResponseBody
    public Object cpSubmit(Integer number1,Integer number2,Integer number3) {
        log.info("1" + number1 + "2"+ number2 + "3" + number3);
        return SUCCESS_TIP;
    }


    /**
     * 删除项目管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Long tGameOddsId) {
        tGameOddsService.deleteById(tGameOddsId);
        return SUCCESS_TIP;
    }

    /**
     * 修改项目管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TGameOdds tGameOdds) {
        tGameOddsService.updateById(tGameOdds);
        return SUCCESS_TIP;
    }

    /**
     * 项目管理详情
     */
    @RequestMapping(value = "/detail/{tGameOddsId}")
    @ResponseBody
    public Object detail(@PathVariable("tGameOddsId") Integer tGameOddsId) {
        return tGameOddsService.selectById(tGameOddsId);
    }
}
