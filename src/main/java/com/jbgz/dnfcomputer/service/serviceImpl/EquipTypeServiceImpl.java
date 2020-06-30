package com.jbgz.dnfcomputer.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jbgz.dnfcomputer.model.EquipType;
import com.jbgz.dnfcomputer.mapper.EquipTypeMapper;
import com.jbgz.dnfcomputer.service.EquipTypeService;

import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.service.serviceImpl
 * @Auth:ygr
 * @DATE:2020/6/29 19:29
 * 
 * .                ,]++++++++]`                
 * .              ]++o**=++++++++\`             
 * .          ,+++++++o\]**[*=++++\             
 * .         ++++++++++++++++oo++++^            
 * .        =+++++++++++++++++++++++            
 * .       =+/`,++o++oo++++++++++++++\          
 * .        + +\++\****\++=+++++++\++++         
 * .           \\ \\//`*]o+++++oo/ /+++`        
 * .           ,+`   [\++++++[`,[+\=+++^        
 * .           +`        ++]]++    ,++^         
 * .          =+         \`         +[          
 * .           +`         ,+`                   
 * .            +`  ]/+++++\/+                  
 * .             =+]=^                          
 * .            *,[[ 
 */
@Service
public class EquipTypeServiceImpl implements EquipTypeService{

    @Resource
    private EquipTypeMapper equipTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return equipTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EquipType record) {
        return equipTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(EquipType record) {
        return equipTypeMapper.insertSelective(record);
    }

    @Override
    public EquipType selectByPrimaryKey(Integer id) {
        return equipTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EquipType record) {
        return equipTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EquipType record) {
        return equipTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<EquipType> getAll() {
        return equipTypeMapper.getAll();
    }

}
