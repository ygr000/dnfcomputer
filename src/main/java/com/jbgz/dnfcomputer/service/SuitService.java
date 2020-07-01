package com.jbgz.dnfcomputer.service;

import com.jbgz.dnfcomputer.model.Suit;

import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.service
 * @Auth:ygr
 * @DATE:2020/6/29 16:03
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
public interface SuitService {


    int deleteByPrimaryKey(Integer id);

    int insert(Suit record);

    int insertSelective(Suit record);

    Suit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suit record);

    int updateByPrimaryKey(Suit record);

    List<Suit> selectByName(String name);

}

