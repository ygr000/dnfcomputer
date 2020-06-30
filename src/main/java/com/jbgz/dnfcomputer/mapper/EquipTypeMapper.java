package com.jbgz.dnfcomputer.mapper;

import com.jbgz.dnfcomputer.model.EquipType;

import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.mapper
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
public interface EquipTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EquipType record);

    int insertSelective(EquipType record);

    EquipType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquipType record);

    int updateByPrimaryKey(EquipType record);

    List<EquipType> getAll();
}