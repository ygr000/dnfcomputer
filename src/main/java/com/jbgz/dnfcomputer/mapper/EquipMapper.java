package com.jbgz.dnfcomputer.mapper;

import com.jbgz.dnfcomputer.model.Equip;import org.apache.ibatis.annotations.Param;import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.mapper
 * @Auth:ygr
 * @DATE:2020/6/29 16:27
 * <p>
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
public interface EquipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Equip record);

    int insertSelective(Equip record);

    Equip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);

    List<Equip> selectByList(@Param("list") List<Equip> list);
}