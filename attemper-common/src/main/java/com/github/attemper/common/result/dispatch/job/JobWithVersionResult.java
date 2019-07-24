package com.github.attemper.common.result.dispatch.job;

import lombok.ToString;

import java.util.Date;

@ToString
public class JobWithVersionResult {

    protected String jobName;

    protected String displayName;

    protected int status;

    protected boolean concurrent;

    protected Date updateTime;

    protected String remark;

    protected Integer version;

    protected int reversion;

    public String getJobName() {
        return jobName;
    }

    public JobWithVersionResult setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public JobWithVersionResult setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public int getReversion() {
        return reversion;
    }

    public JobWithVersionResult setReversion(int reversion) {
        this.reversion = reversion;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public JobWithVersionResult setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public JobWithVersionResult setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public JobWithVersionResult setStatus(int status) {
        this.status = status;
        return this;
    }

    public boolean isConcurrent() {
        return concurrent;
    }

    public JobWithVersionResult setConcurrent(boolean concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public JobWithVersionResult setRemark(String remark) {
        this.remark = remark;
        return this;
    }
}