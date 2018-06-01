package com.junc.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class Copy implements Serializable {
    private String id;

    private Integer status;

    private Date createTime;

    private String createUuid;

    private Date lastUpdateTime;

    private String lastUpdateUuid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUuid() {
        return createUuid;
    }

    public void setCreateUuid(String createUuid) {
        this.createUuid = createUuid == null ? null : createUuid.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUuid() {
        return lastUpdateUuid;
    }

    public void setLastUpdateUuid(String lastUpdateUuid) {
        this.lastUpdateUuid = lastUpdateUuid == null ? null : lastUpdateUuid.trim();
    }
}