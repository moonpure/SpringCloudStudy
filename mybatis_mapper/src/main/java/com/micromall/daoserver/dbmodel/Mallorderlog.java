package com.micromall.daoserver.dbmodel;

import java.util.Date;

public class Mallorderlog {
    private Long id;

    private String orderid;

    private Integer flowstatus;

    private Date createtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getFlowstatus() {
        return flowstatus;
    }

    public void setFlowstatus(Integer flowstatus) {
        this.flowstatus = flowstatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}