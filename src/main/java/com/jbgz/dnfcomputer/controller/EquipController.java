package com.jbgz.dnfcomputer.controller;

import com.alibaba.fastjson.JSONObject;
import com.jbgz.dnfcomputer.aop.SysLog;
import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.model.Result;
import com.jbgz.dnfcomputer.model.ResultCode;
import com.jbgz.dnfcomputer.model.Suit;
import com.jbgz.dnfcomputer.service.EquipService;
import com.jbgz.dnfcomputer.service.SuitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/equip")
public class EquipController {
    private static final Logger log = LoggerFactory.getLogger(EquipController.class);
    @Autowired
    private EquipService equipService;


    @PostMapping("/test")
    @SysLog("ceshivalue111")
    public Result test(String param1, Integer param2) {
        Equip equip = equipService.selectByPrimaryKey(1);
        log.info(equipService.toString());
        log.info(equip.toString());
        return new Result(ResultCode.Failed.getCode(), ResultCode.Failed.getDescribe());
    }

    ;

    @SysLog("ceshivalue222")
    @PostMapping("/getEquipsByIds")
    @ResponseBody
    public Result getEquipsByIds(@RequestBody JSONObject map) {

        List<Equip> equips = equipService.selectByList(null);


        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDescribe(), equips);
    }

    @SysLog("添加装备")
    @PostMapping("/addEquip")
    @ResponseBody
    public Result addEquip(@RequestBody Equip equip) {
        try {
            equipService.insertSelective(equip);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.Failed.getCode(), ResultCode.Failed.getDescribe());
        }
        return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDescribe(), equip);

    }

    @SysLog("添加装备")
    @PostMapping("/findEquipsByName")
    @ResponseBody
    public Result findEquipsByName(String name ) {
        List<Equip> equips= null;
        try {
            equips = equipService.selectByName(name);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.Failed.getCode(),ResultCode.Failed.getDescribe());
        }
        return new Result(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getDescribe(),equips);

    }
}
