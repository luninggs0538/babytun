package com.itlaoqi.babytun.controller;

import com.itlaoqi.babytun.entity.Goods;
import com.itlaoqi.babytun.service.GoodsService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import org.slf4j.*;
/**
 在学习过程中遇到任何问题可以加我的QQ群722570599(老齐的IT指导群)
 在这里老齐将给你直接提供帮助与解答，只为你可以学的更轻松。
 */
@Controller
public class GoodsController {
    Logger logger = LoggerFactory.getLogger(GoodsController.class);
    @Resource
    private GoodsService goodsService;
    @GetMapping("/goods") //http://localhost/goods?gid=xxx
    public ModelAndView showGoods(Long gid){
        logger.info("gid:" + gid);
        ModelAndView mav = new ModelAndView("/goods");
        Goods goods = goodsService.getGoods(gid);
        mav.addObject("goods", goods);
        mav.addObject("covers", goodsService.findCovers(gid));
        mav.addObject("details", goodsService.findDetails(gid));
        mav.addObject("params", goodsService.findParams(gid));
        return mav;
    }
}
