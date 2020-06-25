package com.jbgz.dnfcomputer.mapper;

import com.jbgz.dnfcomputer.model.Equip;


public interface EquipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equip record);

    int insertSelective(Equip record);

    Equip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
}