package com.jbgz.dnfcomputer.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jbgz.dnfcomputer.model.Equip;
import com.jbgz.dnfcomputer.model.EquipType;
import com.jbgz.dnfcomputer.model.Suit;

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
    public static Suit words2Suit(JSONObject jsonObject){
        Suit suit = new Suit();
        JSONArray jsonArray=(JSONArray)( jsonObject.get("words_result"));
        int flag=2;
        for(int i=0;i<jsonArray.size();i++) {
            String words = ((JSONObject) jsonArray.get(i)).getString("words");
            //设置套装名称
            if(i==0){
                suit.setName(words);
            }
            if(words.indexOf("2")>=0&&words.indexOf("套装效果")>=0){
                flag=2;
            }else if(words.indexOf("3")>=0&&words.indexOf("套装效果")>=0){
                flag=3;
            }else if (words.indexOf("5")>=0&&words.indexOf("套装效果")>=0){
                flag=5;
            }
            if(flag==2){
                //设置装备固定属性
                if(words.indexOf("力量")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPower2(add(getNum(words),suit.getFixedPower2()));

                }
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedIntelligence2(add(getNum(words),suit.getFixedIntelligence2()));
                }
                if(words.indexOf("物理攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPhysics2(add(getNum(words),suit.getFixedPhysics2()));
                }
                if(words.indexOf("魔法攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedMagic2(add(getNum(words),suit.getFixedMagic2()));

                }
                if(words.indexOf("独立攻击力+")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedGushang2(add(getNum(words),suit.getFixedGushang2()));
                }
                //设置百分比力智
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageLizhi2(add(getNum(words),suit.getPercentageLizhi2()));
                }
                //设置百分比三攻
                if(words.indexOf("独立攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageSangong2(add(getNum(words),suit.getPercentageSangong2()));
                }
                //设置最终
                if(words.indexOf("最终伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setZuizhong2(add(getNum(words),suit.getZuizhong2()));
                }
                //设置黄
                if(words.indexOf("攻击时")>=0&&words.indexOf("增加")>=0&&words.indexOf("额外")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuang2(new BigDecimal(getNum(words)));
                }
                //设置黄追
                if(words.indexOf("攻击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuangzhui2(add(getNum(words),suit.getHuangzhui2()));
                }
                //设置白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBai2(add(getNum(words),suit.getBai2()));
                }
                //设置属白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setShubai2(new BigDecimal(getNum(words)));
                }
                //设置爆
                if(words.indexOf("暴击伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("额外")<0&&words.indexOf("]")<0){
                    suit.setBao2(new BigDecimal(getNum(words)));
                }
                //设置爆追
                if(words.indexOf("暴击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBaozhui2(add(getNum(words),suit.getBaozhui2()));
                }
                //技能攻击力
                if(words.indexOf("技能攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setJineng2(add(getNum(words),suit.getJineng2()));
                }
                //属性强化
                if(words.indexOf("属性强化")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setShuqiang2(add(getNum(words),suit.getShuqiang2()));
                }
                //技能等级
                if(words.indexOf("技能Lv")>=0&&words.indexOf("]")<0){
                    suit.setDengji2(words+"&&"+suit.getDengji2());
                }
            }
            if(flag==3){
                //设置装备固定属性
                if(words.indexOf("力量")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPower3(add(getNum(words),suit.getFixedPower3()));

                }
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedIntelligence3(add(getNum(words),suit.getFixedIntelligence3()));
                }
                if(words.indexOf("物理攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPhysics3(add(getNum(words),suit.getFixedPhysics3()));
                }
                if(words.indexOf("魔法攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedMagic3(add(getNum(words),suit.getFixedMagic3()));

                }
                if(words.indexOf("独立攻击力+")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedGushang3(add(getNum(words),suit.getFixedGushang3()));
                }
                //设置百分比力智
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageLizhi3(add(getNum(words),suit.getPercentageLizhi3()));
                }
                //设置百分比三攻
                if(words.indexOf("独立攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageSangong3(add(getNum(words),suit.getPercentageSangong3()));
                }
                //设置最终
                if(words.indexOf("最终伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setZuizhong3(add(getNum(words),suit.getZuizhong3()));
                }
                //设置黄
                if(words.indexOf("攻击时")>=0&&words.indexOf("增加")>=0&&words.indexOf("额外")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuang3(new BigDecimal(getNum(words)));
                }
                //设置黄追
                if(words.indexOf("攻击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuangzhui3(add(getNum(words),suit.getHuangzhui3()));
                }
                //设置白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBai3(add(getNum(words),suit.getBai3()));
                }
                //设置属白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setShubai3(new BigDecimal(getNum(words)));
                }
                //设置爆
                if(words.indexOf("暴击伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("额外")<0&&words.indexOf("]")<0){
                    suit.setBao3(new BigDecimal(getNum(words)));
                }
                //设置爆追
                if(words.indexOf("暴击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBaozhui3(add(getNum(words),suit.getBaozhui3()));
                }
                //技能攻击力
                if(words.indexOf("技能攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setJineng3(add(getNum(words),suit.getJineng3()));
                }
                //属性强化
                if(words.indexOf("属性强化")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setShuqiang3(add(getNum(words),suit.getShuqiang3()));
                }
                //技能等级
                if(words.indexOf("技能Lv")>=0&&words.indexOf("]")<0){
                    suit.setDengji3(words+"&&"+suit.getDengji3());
                }
            }
            if(flag==5){
                //设置装备固定属性
                if(words.indexOf("力量")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPower5(add(getNum(words),suit.getFixedPower5()));

                }
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedIntelligence5(add(getNum(words),suit.getFixedIntelligence5()));
                }
                if(words.indexOf("物理攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedPhysics5(add(getNum(words),suit.getFixedPhysics5()));
                }
                if(words.indexOf("魔法攻击力")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedMagic5(add(getNum(words),suit.getFixedMagic5()));

                }
                if(words.indexOf("独立攻击力+")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setFixedGushang5(add(getNum(words),suit.getFixedGushang5()));
                }
                //设置百分比力智
                if(words.indexOf("智力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageLizhi5(add(getNum(words),suit.getPercentageLizhi5()));
                }
                //设置百分比三攻
                if(words.indexOf("独立攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setPercentageSangong5(add(getNum(words),suit.getPercentageSangong5()));
                }
                //设置最终
                if(words.indexOf("最终伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setZuizhong5(add(getNum(words),suit.getZuizhong5()));
                }
                //设置黄
                if(words.indexOf("攻击时")>=0&&words.indexOf("增加")>=0&&words.indexOf("额外")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuang5(new BigDecimal(getNum(words)));
                }
                //设置黄追
                if(words.indexOf("攻击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setHuangzhui5(add(getNum(words),suit.getHuangzhui5()));
                }
                //设置白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")<0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBai5(add(getNum(words),suit.getBai5()));
                }
                //设置属白
                if(words.indexOf("攻击时")>=0&&words.indexOf("附加")>=0&&words.indexOf("属性伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setShubai5(new BigDecimal(getNum(words)));
                }
                //设置爆
                if(words.indexOf("暴击伤害")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("额外")<0&&words.indexOf("]")<0){
                    suit.setBao5(new BigDecimal(getNum(words)));
                }
                //设置爆追
                if(words.indexOf("暴击时")>=0&&words.indexOf("额外增加")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setBaozhui5(add(getNum(words),suit.getBaozhui5()));
                }
                //技能攻击力
                if(words.indexOf("技能攻击力")>=0&&words.lastIndexOf("%")>=0&&words.indexOf("]")<0){
                    suit.setJineng5(add(getNum(words),suit.getJineng5()));
                }
                //属性强化
                if(words.indexOf("属性强化")>=0&&words.lastIndexOf("%")<0&&words.indexOf("]")<0){
                    suit.setShuqiang5(add(getNum(words),suit.getShuqiang5()));
                }
                //技能等级
                if(words.indexOf("技能Lv")>=0&&words.indexOf("]")<0){
                    suit.setDengji5(words+"&&"+suit.getDengji5());
                }
            }
        }
        return suit;
    }
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
