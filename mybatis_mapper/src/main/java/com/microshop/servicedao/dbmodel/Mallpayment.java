package com.microshop.servicedao.dbmodel;

import java.util.Date;

public class Mallpayment {
    private String id;

    private Integer platformid;

    private String applyflow;

    private Integer paytype;

    private Integer paymoney;

    private Integer payfee;

    private Integer paystatus;

    private String payflow;

    private Date updatetim;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public String getApplyflow() {
        return applyflow;
    }

    public void setApplyflow(String applyflow) {
        this.applyflow = applyflow == null ? null : applyflow.trim();
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

    public Date getUpdatetim() {
        return updatetim;
    }

    public void setUpdatetim(Date updatetim) {
        this.updatetim = updatetim;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}