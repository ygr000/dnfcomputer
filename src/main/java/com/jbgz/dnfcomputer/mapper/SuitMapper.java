package com.jbgz.dnfcomputer.mapper;

import com.jbgz.dnfcomputer.model.Suit;import org.apache.ibatis.annotations.Param;import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.mapper
 * @Auth:ygr
 * @DATE:2020/7/1 12:07
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
public interface SuitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Suit record);

    int insertSelective(Suit record);

    Suit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suit record);

    int updateByPrimaryKey(Suit record);

    List<Suit> selectByName(@Param("name") String name);
}