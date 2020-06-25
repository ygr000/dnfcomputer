package com.jbgz.dnfcomputer.model;

import java.math.BigDecimal;
import java.util.Date;

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

    private BigDecimal dengji;

    private BigDecimal lengque;

    private BigDecimal fixedPower;

    private BigDecimal fixedIntelligence;

    private Date modifyTime;

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

    public BigDecimal getDengji() {
        return dengji;
    }

    public void setDengji(BigDecimal dengji) {
        this.dengji = dengji;
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

    public BigDecimal getFixedIntelligence() {
        return fixedIntelligence;
    }

    public void setFixedIntelligence(BigDecimal fixedIntelligence) {
        this.fixedIntelligence = fixedIntelligence;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
        sb.append(", dengji=").append(dengji);
        sb.append(", lengque=").append(lengque);
        sb.append(", fixedPower=").append(fixedPower);
        sb.append(", fixedIntelligence=").append(fixedIntelligence);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append("]");
        return sb.toString();
    }
}