package com.jbgz.dnfcomputer.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Location:com.jbgz.dnfcomputer.model
 * @Auth:ygr
 * @DATE:2020/6/29 19:24
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
public class Equip {
    private Integer id;

    private Integer suitId;

    private String name;

    private BigDecimal huang;

    private BigDecimal huangzhui;

    private BigDecimal bao;

    private BigDecimal baozhui;

    private BigDecimal bai;

    private BigDecimal shubai;

    private BigDecimal percentageLizhi;

    private BigDecimal zuizhong;

    private BigDecimal percentageSangong;

    private BigDecimal shuqiang;

    private BigDecimal jineng;

    private BigDecimal fixedIntelligence;

    private BigDecimal lengque;

    private BigDecimal fixedPower;

    private String dengji;

    private Date modifyTime;

    /**
     * 1：头肩
     * 2：上衣
     * 3：腰带
     * 4：下装
     * 5：鞋
     * 6：武器
     * 7：称号
     * 8：手镯
     * 9：项链
     * 10：戒指
     * 11：辅助装备
     * 12：魔法师
     * 13：耳环
     * 14：宠物
     * 15：宠物装备
     * ...
     */
    private String equipType;

    /**
     * 史诗，神器
     */
    private String equipLevel;

    /**
     * 固定 物理攻击
     */
    private BigDecimal fixedPhysics;

    /**
     * guding mofa
     */
    private BigDecimal fixedMagic;

    private BigDecimal fixedGushang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSuitId() {
        return suitId;
    }

    public void setSuitId(Integer suitId) {
        this.suitId = suitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHuang() {
        return huang;
    }

    public void setHuang(BigDecimal huang) {
        this.huang = huang;
    }

    public BigDecimal getHuangzhui() {
        return huangzhui;
    }

    public void setHuangzhui(BigDecimal huangzhui) {
        this.huangzhui = huangzhui;
    }

    public BigDecimal getBao() {
        return bao;
    }

    public void setBao(BigDecimal bao) {
        this.bao = bao;
    }

    public BigDecimal getBaozhui() {
        return baozhui;
    }

    public void setBaozhui(BigDecimal baozhui) {
        this.baozhui = baozhui;
    }

    public BigDecimal getBai() {
        return bai;
    }

    public void setBai(BigDecimal bai) {
        this.bai = bai;
    }

    public BigDecimal getShubai() {
        return shubai;
    }

    public void setShubai(BigDecimal shubai) {
        this.shubai = shubai;
    }

    public BigDecimal getPercentageLizhi() {
        return percentageLizhi;
    }

    public void setPercentageLizhi(BigDecimal percentageLizhi) {
        this.percentageLizhi = percentageLizhi;
    }

    public BigDecimal getZuizhong() {
        return zuizhong;
    }

    public void setZuizhong(BigDecimal zuizhong) {
        this.zuizhong = zuizhong;
    }

    public BigDecimal getPercentageSangong() {
        return percentageSangong;
    }

    public void setPercentageSangong(BigDecimal percentageSangong) {
        this.percentageSangong = percentageSangong;
    }

    public BigDecimal getShuqiang() {
        return shuqiang;
    }

    public void setShuqiang(BigDecimal shuqiang) {
        this.shuqiang = shuqiang;
    }

    public BigDecimal getJineng() {
        return jineng;
    }

    public void setJineng(BigDecimal jineng) {
        this.jineng = jineng;
    }

    public BigDecimal getFixedIntelligence() {
        return fixedIntelligence;
    }

    public void setFixedIntelligence(BigDecimal fixedIntelligence) {
        this.fixedIntelligence = fixedIntelligence;
    }

    public BigDecimal getLengque() {
        return lengque;
    }

    public void setLengque(BigDecimal lengque) {
        this.lengque = lengque;
    }

    public BigDecimal getFixedPower() {
        return fixedPower;
    }

    public void setFixedPower(BigDecimal fixedPower) {
        this.fixedPower = fixedPower;
    }

    public String getDengji() {
        return dengji;
    }

    public void setDengji(String dengji) {
        this.dengji = dengji;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public String getEquipLevel() {
        return equipLevel;
    }

    public void setEquipLevel(String equipLevel) {
        this.equipLevel = equipLevel;
    }

    public BigDecimal getFixedPhysics() {
        return fixedPhysics;
    }

    public void setFixedPhysics(BigDecimal fixedPhysics) {
        this.fixedPhysics = fixedPhysics;
    }

    public BigDecimal getFixedMagic() {
        return fixedMagic;
    }

    public void setFixedMagic(BigDecimal fixedMagic) {
        this.fixedMagic = fixedMagic;
    }

    public BigDecimal getFixedGushang() {
        return fixedGushang;
    }

    public void setFixedGushang(BigDecimal fixedGushang) {
        this.fixedGushang = fixedGushang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", suitId=").append(suitId);
        sb.append(", name=").append(name);
        sb.append(", huang=").append(huang);
        sb.append(", huangzhui=").append(huangzhui);
        sb.append(", bao=").append(bao);
        sb.append(", baozhui=").append(baozhui);
        sb.append(", bai=").append(bai);
        sb.append(", shubai=").append(shubai);
        sb.append(", percentageLizhi=").append(percentageLizhi);
        sb.append(", zuizhong=").append(zuizhong);
        sb.append(", percentageSangong=").append(percentageSangong);
        sb.append(", shuqiang=").append(shuqiang);
        sb.append(", jineng=").append(jineng);
        sb.append(", fixedIntelligence=").append(fixedIntelligence);
        sb.append(", lengque=").append(lengque);
        sb.append(", fixedPower=").append(fixedPower);
        sb.append(", dengji=").append(dengji);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", equipType=").append(equipType);
        sb.append(", equipLevel=").append(equipLevel);
        sb.append(", fixedPhysics=").append(fixedPhysics);
        sb.append(", fixedMagic=").append(fixedMagic);
        sb.append(", fixedGushang=").append(fixedGushang);
        sb.append("]");
        return sb.toString();
    }
}