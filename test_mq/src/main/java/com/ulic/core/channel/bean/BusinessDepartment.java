package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class BusinessDepartment implements Serializable {
	@Id
    private String departmentId;

	private String departmentName;

    private String departmentManager;

    private String departmentManagerPhone;

    private String departmentManagerEmail;

    private String wechatOpenid;

    private String divisionId;

    private String remark;

    @Column(name = "created_time")
    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(String departmentManager) {
        this.departmentManager = departmentManager == null ? null : departmentManager.trim();
    }

    public String getDepartmentManagerPhone() {
        return departmentManagerPhone;
    }

    public void setDepartmentManagerPhone(String departmentManagerPhone) {
        this.departmentManagerPhone = departmentManagerPhone == null ? null : departmentManagerPhone.trim();
    }

    public String getDepartmentManagerEmail() {
        return departmentManagerEmail;
    }

    public void setDepartmentManagerEmail(String departmentManagerEmail) {
        this.departmentManagerEmail = departmentManagerEmail == null ? null : departmentManagerEmail.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public String getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId == null ? null : divisionId.trim();
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
        BusinessDepartment other = (BusinessDepartment) that;
        return (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getDepartmentManager() == null ? other.getDepartmentManager() == null : this.getDepartmentManager().equals(other.getDepartmentManager()))
            && (this.getDepartmentManagerPhone() == null ? other.getDepartmentManagerPhone() == null : this.getDepartmentManagerPhone().equals(other.getDepartmentManagerPhone()))
            && (this.getDepartmentManagerEmail() == null ? other.getDepartmentManagerEmail() == null : this.getDepartmentManagerEmail().equals(other.getDepartmentManagerEmail()))
            && (this.getWechatOpenid() == null ? other.getWechatOpenid() == null : this.getWechatOpenid().equals(other.getWechatOpenid()))
            && (this.getDivisionId() == null ? other.getDivisionId() == null : this.getDivisionId().equals(other.getDivisionId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getDepartmentManager() == null) ? 0 : getDepartmentManager().hashCode());
        result = prime * result + ((getDepartmentManagerPhone() == null) ? 0 : getDepartmentManagerPhone().hashCode());
        result = prime * result + ((getDepartmentManagerEmail() == null) ? 0 : getDepartmentManagerEmail().hashCode());
        result = prime * result + ((getWechatOpenid() == null) ? 0 : getWechatOpenid().hashCode());
        result = prime * result + ((getDivisionId() == null) ? 0 : getDivisionId().hashCode());
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
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", departmentManager=").append(departmentManager);
        sb.append(", departmentManagerPhone=").append(departmentManagerPhone);
        sb.append(", departmentManagerEmail=").append(departmentManagerEmail);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", divisionId=").append(divisionId);
        sb.append(", remark=").append(remark);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", editor=").append(editor);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}