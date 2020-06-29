package com.jbgz.dnfcomputer.service;

import com.jbgz.dnfcomputer.model.EquipType;
    /**
 * @Location:com.jbgz.dnfcomputer.service
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
public interface EquipTypeService{


    int deleteByPrimaryKey(Integer id);

    int insert(EquipType record);

    int insertSelective(EquipType record);

    EquipType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EquipType record);

    int updateByPrimaryKey(EquipType record);

}
