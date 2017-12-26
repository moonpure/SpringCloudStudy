package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallaccountpay {
    private Integer id;

    private String ip;

    private String devid;

    private String devtype;

    private String outtradeno;

    private String outtradeappid;

    private String outtradeplatform;

    private Integer paymoney;

    private Integer fee;

    private Integer paychannel;

    private Integer paystatus;

    private String payerrdesc;

    private String payerrcode;

    private Date createtime;

    private Date updatetime;

    private Integer searchnum;

    private String thirdtradeno;

    private String userid;

    private Date nextfiretime;

    private Date finishtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid == null ? null : devid.trim();
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype == null ? null : devtype.trim();
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno == null ? null : outtradeno.trim();
    }

    public String getOuttradeappid() {
        return outtradeappid;
    }

    public void setOuttradeappid(String outtradeappid) {
        this.outtradeappid = outtradeappid == null ? null : outtradeappid.trim();
    }

    public String getOuttradeplatform() {
        return outtradeplatform;
    }

    public void setOuttradeplatform(String outtradeplatform) {
        this.outtradeplatform = outtradeplatform == null ? null : outtradeplatform.trim();
    }

    public Integer getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public Integer getPaychannel() {
        return paychannel;
    }

    public void setPaychannel(Integer paychannel) {
        this.paychannel = paychannel;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getPayerrdesc() {
        return payerrdesc;
    }

    public void setPayerrdesc(String payerrdesc) {
        this.payerrdesc = payerrdesc == null ? null : payerrdesc.trim();
    }

    public String getPayerrcode() {
        return payerrcode;
    }

    public void setPayerrcode(String payerrcode) {
        this.payerrcode = payerrcode == null ? null : payerrcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSearchnum() {
        return searchnum;
    }

    public void setSearchnum(Integer searchnum) {
        this.searchnum = searchnum;
    }

    public String getThirdtradeno() {
        return thirdtradeno;
    }

    public void setThirdtradeno(String thirdtradeno) {
        this.thirdtradeno = thirdtradeno == null ? null : thirdtradeno.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getNextfiretime() {
        return nextfiretime;
    }

    public void setNextfiretime(Date nextfiretime) {
        this.nextfiretime = nextfiretime;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }
}