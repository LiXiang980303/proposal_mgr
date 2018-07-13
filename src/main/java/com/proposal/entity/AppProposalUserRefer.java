package com.proposal.entity;

import java.util.Date;

public class AppProposalUserRefer {
    private long referId;

    private String referName;

    private String referDepartment;

    private String referPhone;

    private String referJobTitle;

    private String referJobPosition;

    private String referPostCode;

    private String referUser;

    private String referReason;

    private Date createTime;

    private Date updateTime;

    private String status;

    private int priority;


    public long getReferId() {
        return referId;
    }

    public void setReferId(long referId) {
        this.referId = referId;
    }

    public String getReferName() {
        return referName;
    }

    public void setReferName(String referName) {
        this.referName = referName;
    }

    public String getReferDepartment() {
        return referDepartment;
    }

    public void setReferDepartment(String referDepartment) {
        this.referDepartment = referDepartment;
    }

    public String getReferPhone() {
        return referPhone;
    }

    public void setReferPhone(String referPhone) {
        this.referPhone = referPhone;
    }

    public String getReferJobTitle() {
        return referJobTitle;
    }

    public void setReferJobTitle(String referJobTitle) {
        this.referJobTitle = referJobTitle;
    }

    public String getReferJobPosition() {
        return referJobPosition;
    }

    public void setReferJobPosition(String referJobPosition) {
        this.referJobPosition = referJobPosition;
    }

    public String getReferPostCode() {
        return referPostCode;
    }

    public void setReferPostCode(String referPostCode) {
        this.referPostCode = referPostCode;
    }

    public String getReferUser() {
        return referUser;
    }

    public void setReferUser(String referUser) {
        this.referUser = referUser;
    }

    public String getReferReason() {
        return referReason;
    }

    public void setReferReason(String referReason) {
        this.referReason = referReason;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
