package com.jbgz.dnfcomputer.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.model.EquipType;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Location:com.jbgz.dnfcomputer.utils
 * @Auth:ygr
 * @DATE:2020/6/30 12:44
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
public class Words2Equip {
    public static Equip words2Equip(JSONObject jsonObject, List<EquipType> equipTypeList){
        Equip equip=new Equip();
        JSONArray jsonArray=(JSONArray)( jsonObject.get("words_result"));
        for(int i=0;i<jsonArray.size();i++){
            String words=((JSONObject)jsonArray.get(i)).getString("words");
           //设置装备名称
            if(i==0){
                equip.setName(words);
            }

            //设置装备级别
            if(words.indexOf("神话")>=0&&words.indexOf("]")<0){
                equip.setEquipLevel("神话");
            }else if(words.indexOf("史诗")>=0&&words.indexOf("]")<0){
                equip.setEquipLevel("史诗");
            }
            //设置装备类型
            for(EquipType equipType:equipTypeList){
                if(words.startsWith(equipType.getTypename())) {
                    equip.setEquipType(equipType.getId().toString());
                    break;
                }
            }
            //设置装备固定属性
            if(words.indexOf("力量")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setFixedPower(add(getNum(words),equip.getFixedPower()));

            }
            if(words.indexOf("智力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setFixedIntelligence(add(getNum(words),equip.getFixedIntelligence()));
            }
            if(words.indexOf("物理攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setFixedPhysics(add(getNum(words),equip.getFixedPhysics()));
            }
            if(words.indexOf("魔法攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setFixedMagic(add(getNum(words),equip.getFixedMagic()));

            }
            if(words.indexOf("独立攻击力+")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setFixedGushang(add(getNum(words),equip.getFixedGushang()));
            }
            //设置百分比力智
            if(words.indexOf("智力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setPercentageLizhi(add(getNum(words),equip.getPercentageLizhi()));
            }
            //设置百分比三攻
            if(words.indexOf("独立攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setPercentageSangong(add(getNum(words),equip.getPercentageSangong()));
            }
            //设置最终
            if(words.indexOf("最终伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setZuizhong(add(getNum(words),equip.getZuizhong()));
            }
            //设置黄
            if(words.indexOf("攻击时")>=0&&words.indexOf("增加")>=0&&words.indexOf("额外")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setHuang(new BigDecimal(getNum(words)));
            }
            //设置黄追
            if(words.indexOf("攻击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setHuangzhui(add(getNum(words),equip.getHuangzhui()));
            }
            //设置白
            if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setBai(add(getNum(words),equip.getBai()));
            }
            //设置属白
            if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setShubai(new BigDecimal(getNum(words)));
            }
            //设置爆
            if(words.indexOf("暴击伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("额外")<0&&words.indexOf("]")<0){
                equip.setBao(new BigDecimal(getNum(words)));
            }
            //设置爆追
            if(words.indexOf("暴击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setBaozhui(add(getNum(words),equip.getBaozhui()));
            }
            //技能攻击力
            if(words.indexOf("技能攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                equip.setJineng(add(getNum(words),equip.getJineng()));
            }
            //属性强化
            if(words.indexOf("属性强化")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                equip.setShuqiang(add(getNum(words),equip.getShuqiang()));
            }
            //技能等级
            if(words.indexOf("技能Lv")>=0&&words.indexOf("]")<0){
                equip.setDengji(words+"&&"+equip.getDengji());
            }
        }
        return equip;
    }
    public static String getNum(String words){
        if(words.indexOf("(")>=0||words.indexOf(")")>=0){
            if(words.indexOf(",")>=0&&words.indexOf("%")>=0){
                words=words.substring(words.indexOf(","),words.indexOf("%"));
            }else {
                if(words.indexOf("%")>=0) {
                    words = words.substring(0, words.indexOf("%"));
                }
            }
        }
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(words);
        return m.replaceAll("").trim();
    };

    public static BigDecimal add(String words,BigDecimal bigDecimal){
            return new BigDecimal(words).add(bigDecimal!=null?bigDecimal:new BigDecimal("0"));
    }

}
