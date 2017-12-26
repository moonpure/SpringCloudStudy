package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallpaymentlog {
    private String id;

    private String payid;

    private Integer paytype;

    private Integer paymoney;

    private Integer payfee;

    private Integer paystatus;

    private String payflow;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Integer paymoney) {
        this.paymoney = paymoney;
    }

    public Integer getPayfee() {
        return payfee;
    }

    public void setPayfee(Integer payfee) {
        this.payfee = payfee;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getPayflow() {
        return payflow;
    }

    public void setPayflow(String payflow) {
        this.payflow = payflow == null ? null : payflow.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}