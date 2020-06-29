package com.jbgz.dnfcomputer.service;

import com.jbgz.dnfcomputer.model.Equip;

import java.util.List;

public interface EquipService {


    int deleteByPrimaryKey(Integer id);

    int insert(Equip record);

    int insertSelective(Equip record);

    Equip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);

    List<Equip> selectByList(List<Equip> list);

}


