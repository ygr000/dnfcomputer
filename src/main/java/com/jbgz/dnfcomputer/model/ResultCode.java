package com.jbgz.dnfcomputer.model;

public enum ResultCode {
    SUCCESS("200","成功"),Failed("500","失败");
    private String code;
    private String describe;

    ResultCode(String code, String describe) {
        this.code=code;
        this.describe=describe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", describe='" + describe + '\'' +
                '}';
    }
}
