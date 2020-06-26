package com.jbgz.dnfcomputer.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.model.Result;
import com.jbgz.dnfcomputer.model.ResultCode;
import com.jbgz.dnfcomputer.service.EquipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/equip")
public class EquipController {
    private static final Logger log = LoggerFactory.getLogger(EquipController.class);
    @Autowired
    private EquipService equipService;
    @GetMapping("/test")
    public Result test(){
        Equip equip =equipService.selectByPrimaryKey(1);
        log.info(equipService.toString());
        log.info(equip.toString());
        return new Result(ResultCode.Failed.getCode(),ResultCode.Failed.getDescribe());
    };
    @GetMapping("/getEquipsByIds")
    @ResponseBody
    public Result getEquipsByIds(){
        Equip equip =equipService.selectByPrimaryKey(1);
        List<Equip> list=new ArrayList<>();
        list.add(equip);
        List<Equip> equips =equipService.selectByList(list);
        String str=JSONObject.toJSONString(equips);
        log.info(str);
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDescribe(),equips);
    };
}
