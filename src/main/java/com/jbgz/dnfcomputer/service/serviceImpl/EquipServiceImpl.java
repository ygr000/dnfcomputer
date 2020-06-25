package com.jbgz.dnfcomputer.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.mapper.EquipMapper;
import com.jbgz.dnfcomputer.service.EquipService;

@Service
public class EquipServiceImpl implements EquipService {

    @Resource
    private EquipMapper equipMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return equipMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Equip record) {
        return equipMapper.insert(record);
    }

    @Override
    public int insertSelective(Equip record) {
        return equipMapper.insertSelective(record);
    }

    @Override
    public Equip selectByPrimaryKey(Integer id) {
        return equipMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Equip record) {
        return equipMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Equip record) {
        return equipMapper.updateByPrimaryKey(record);
    }

}


