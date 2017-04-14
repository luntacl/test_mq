package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "business_branch")
public class BusinessBranch implements Serializable {
	
	@Id
    @Column(name="branch_id")
    private String branchId;

    @Column(name="branch_name")
    private String branchName;

    @Column(name="branch_manager")
    private String branchManager;

    @Column(name="branch_manager_phone")
    private String branchManagerPhone;

    @Column(name="branch_manager_email")
    private String branchManagerEmail;

    @Column(name="wechat_openid")
    private String wechatOpenid;

    @Column(name="remark")
    private String remark;

    @Column(name="created_time")
    private Date createdTime;

    @Column(name="editor")
    private String editor;

    @Column(name="updated_time")
    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId == null ? null : branchId.trim();
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager == null ? null : branchManager.trim();
    }

    public String getBranchManagerPhone() {
        return branchManagerPhone;
    }

    public void setBranchManagerPhone(String branchManagerPhone) {
        this.branchManagerPhone = branchManagerPhone == null ? null : branchManagerPhone.trim();
    }

    public String getBranchManagerEmail() {
        return branchManagerEmail;
    }

    public void setBranchManagerEmail(String branchManagerEmail) {
        this.branchManagerEmail = branchManagerEmail == null ? null : branchManagerEmail.trim();
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
        BusinessBranch other = (BusinessBranch) that;
        return (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()))
            && (this.getBranchName() == null ? other.getBranchName() == null : this.getBranchName().equals(other.getBranchName()))
            && (this.getBranchManager() == null ? other.getBranchManager() == null : this.getBranchManager().equals(other.getBranchManager()))
            && (this.getBranchManagerPhone() == null ? other.getBranchManagerPhone() == null : this.getBranchManagerPhone().equals(other.getBranchManagerPhone()))
            && (this.getBranchManagerEmail() == null ? other.getBranchManagerEmail() == null : this.getBranchManagerEmail().equals(other.getBranchManagerEmail()))
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
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        result = prime * result + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        result = prime * result + ((getBranchManager() == null) ? 0 : getBranchManager().hashCode());
        result = prime * result + ((getBranchManagerPhone() == null) ? 0 : getBranchManagerPhone().hashCode());
        result = prime * result + ((getBranchManagerEmail() == null) ? 0 : getBranchManagerEmail().hashCode());
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
        sb.append(", branchId=").append(branchId);
        sb.append(", branchName=").append(branchName);
        sb.append(", branchManager=").append(branchManager);
        sb.append(", branchManagerPhone=").append(branchManagerPhone);
        sb.append(", branchManagerEmail=").append(branchManagerEmail);
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