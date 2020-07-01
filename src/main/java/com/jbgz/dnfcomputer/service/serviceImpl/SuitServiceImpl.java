package com.jbgz.dnfcomputer.service.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.jbgz.dnfcomputer.model.Suit;
import com.jbgz.dnfcomputer.mapper.SuitMapper;
import com.jbgz.dnfcomputer.service.SuitService;

import java.util.List;

/**
 * @Location:com.jbgz.dnfcomputer.service.serviceImpl
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
@Service
public class SuitServiceImpl implements SuitService {

    @Resource
    private SuitMapper suitMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return suitMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Suit record) {
        return suitMapper.insert(record);
    }

    @Override
    public int insertSelective(Suit record) {
        return suitMapper.insertSelective(record);
    }

    @Override
    public Suit selectByPrimaryKey(Integer id) {
        return suitMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Suit record) {
        return suitMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Suit record) {
        return suitMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Suit> selectByName(String name) {
        return suitMapper.selectByName(name);
    }

}

