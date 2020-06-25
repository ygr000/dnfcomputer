package com.jbgz.dnfcomputer.controller;

import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.service.EquipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/equip")
public class EquipController {
    private static final Logger log = LoggerFactory.getLogger(EquipController.class);
    @Autowired
    private EquipService equipService;
    @GetMapping("/test")
    public void test(){
        Equip equip =equipService.selectByPrimaryKey(1);
        log.info(equipService.toString());
        log.info(equip.toString());
       // return equip.toString();
    };
}
