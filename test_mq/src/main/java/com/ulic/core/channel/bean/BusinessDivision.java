package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class BusinessDivision implements Serializable {
	@Id
    private String divisionId;

    private String divisionName;

    private String divisionManager;

    private String divisionManagerPhone;

    private String divisionManagerEmail;

    private String branchId;

    private String wechatOpenid;

    private String remark;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId == null ? null : divisionId.trim();
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName == null ? null : divisionName.trim();
    }

    public String getDivisionManager() {
        return divisionManager;
    }

    public void setDivisionManager(String divisionManager) {
        this.divisionManager = divisionManager == null ? null : divisionManager.trim();
    }

    public String getDivisionManagerPhone() {
        return divisionManagerPhone;
    }

    public void setDivisionManagerPhone(String divisionManagerPhone) {
        this.divisionManagerPhone = divisionManagerPhone == null ? null : divisionManagerPhone.trim();
    }

    public String getDivisionManagerEmail() {
        return divisionManagerEmail;
    }

    public void setDivisionManagerEmail(String divisionManagerEmail) {
        this.divisionManagerEmail = divisionManagerEmail == null ? null : divisionManagerEmail.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BusinessDivision other = (BusinessDivision) that;
        return (this.getDivisionId() == null ? other.getDivisionId() == null : this.getDivisionId().equals(other.getDivisionId()))
            && (this.getDivisionName() == null ? other.getDivisionName() == null : this.getDivisionName().equals(other.getDivisionName()))
            && (this.getDivisionManager() == null ? other.getDivisionManager() == null : this.getDivisionManager().equals(other.getDivisionManager()))
            && (this.getDivisionManagerPhone() == null ? other.getDivisionManagerPhone() == null : this.getDivisionManagerPhone().equals(other.getDivisionManagerPhone()))
            && (this.getDivisionManagerEmail() == null ? other.getDivisionManagerEmail() == null : this.getDivisionManagerEmail().equals(other.getDivisionManagerEmail()))
            && (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()))
            && (this.getWechatOpenid() == null ? other.getWechatOpenid() == null : this.getWechatOpenid().equals(other.getWechatOpenid()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDivisionId() == null) ? 0 : getDivisionId().hashCode());
        result = prime * result + ((getDivisionName() == null) ? 0 : getDivisionName().hashCode());
        result = prime * result + ((getDivisionManager() == null) ? 0 : getDivisionManager().hashCode());
        result = prime * result + ((getDivisionManagerPhone() == null) ? 0 : getDivisionManagerPhone().hashCode());
        result = prime * result + ((getDivisionManagerEmail() == null) ? 0 : getDivisionManagerEmail().hashCode());
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        result = prime * result + ((getWechatOpenid() == null) ? 0 : getWechatOpenid().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", divisionId=").append(divisionId);
        sb.append(", divisionName=").append(divisionName);
        sb.append(", divisionManager=").append(divisionManager);
        sb.append(", divisionManagerPhone=").append(divisionManagerPhone);
        sb.append(", divisionManagerEmail=").append(divisionManagerEmail);
        sb.append(", branchId=").append(branchId);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", remark=").append(remark);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", editor=").append(editor);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}