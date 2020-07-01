package com.jbgz.dnfcomputer.controller;

import com.alibaba.fastjson.JSONObject;
import com.jbgz.dnfcomputer.aop.SysLog;
import com.jbgz.dnfcomputer.model.*;
import com.jbgz.dnfcomputer.service.EquipService;
import com.jbgz.dnfcomputer.service.SuitService;
import com.jbgz.dnfcomputer.utils.PictureRecognition2Words;
import com.jbgz.dnfcomputer.utils.Words2Equip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/suit")
public class SuitController {
    private static final Logger log = LoggerFactory.getLogger(SuitController.class);

    @Autowired
    private SuitService suitService;
    @Autowired
    private PictureRecognition2Words pictureRecognition2Words;
    @PostMapping("/findSuitsByName")
    @SysLog("通过名字查询装备")
    public Result findSuitsByName(String name){


        List<Suit> suits;
        try {
            suits = suitService.selectByName(name);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.Failed.getCode(),ResultCode.Failed.getDescribe());
        }
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDescribe(),suits);
    }

    @SysLog("添加套装")
    @PostMapping("/addSuit")
    @ResponseBody
    public Result addSuit(@RequestBody Suit suit){
        try {
            suitService.insertSelective(suit);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.Failed.getCode(),ResultCode.Failed.getDescribe());
        }
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDescribe(),suit);
    }

    @SysLog("图象识别套装")
    @PostMapping("/recognitionSuit")
    @ResponseBody
    public Result recognitionSuit(String url) {
        com.alibaba.fastjson.JSONObject res=null;
        Suit suit;
        try {
            String jsonStr = pictureRecognition2Words.getPictureWords(url);
            res=JSONObject.parseObject(jsonStr);
            log.info(jsonStr);
            suit= Words2Equip.words2Suit(res);
            suitService.insertSelective(suit);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.Failed.getCode(), ResultCode.Failed.getDescribe(),res);
        }
        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDescribe(), suit);

    }
}
