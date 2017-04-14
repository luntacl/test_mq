package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class ExpandEmployee implements Serializable {
	@Id
    private String expandEmployeeId;

    private String expandEmployeeName;

    private String expandEmployeePhone;

    private String expandEmployeeEmail;

    private String wechatOpenid;

    private String departmentId;

    private Integer activated;

    private Integer disabled;

    private Date deactivatedTime;

    private String remark;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getExpandEmployeeId() {
        return expandEmployeeId;
    }

    public void setExpandEmployeeId(String expandEmployeeId) {
        this.expandEmployeeId = expandEmployeeId;
    }

    public String getExpandEmployeeName() {
        return expandEmployeeName;
    }

    public void setExpandEmployeeName(String expandEmployeeName) {
        this.expandEmployeeName = expandEmployeeName == null ? null : expandEmployeeName.trim();
    }

    public String getExpandEmployeePhone() {
        return expandEmployeePhone;
    }

    public void setExpandEmployeePhone(String expandEmployeePhone) {
        this.expandEmployeePhone = expandEmployeePhone == null ? null : expandEmployeePhone.trim();
    }

    public String getExpandEmployeeEmail() {
        return expandEmployeeEmail;
    }

    public void setExpandEmployeeEmail(String expandEmployeeEmail) {
        this.expandEmployeeEmail = expandEmployeeEmail == null ? null : expandEmployeeEmail.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Date getDeactivatedTime() {
        return deactivatedTime;
    }

    public void setDeactivatedTime(Date deactivatedTime) {
        this.deactivatedTime = deactivatedTime;
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
        ExpandEmployee other = (ExpandEmployee) that;
        return (this.getExpandEmployeeId() == null ? other.getExpandEmployeeId() == null : this.getExpandEmployeeId().equals(other.getExpandEmployeeId()))
            && (this.getExpandEmployeeName() == null ? other.getExpandEmployeeName() == null : this.getExpandEmployeeName().equals(other.getExpandEmployeeName()))
            && (this.getExpandEmployeePhone() == null ? other.getExpandEmployeePhone() == null : this.getExpandEmployeePhone().equals(other.getExpandEmployeePhone()))
            && (this.getExpandEmployeeEmail() == null ? other.getExpandEmployeeEmail() == null : this.getExpandEmployeeEmail().equals(other.getExpandEmployeeEmail()))
            && (this.getWechatOpenid() == null ? other.getWechatOpenid() == null : this.getWechatOpenid().equals(other.getWechatOpenid()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getActivated() == null ? other.getActivated() == null : this.getActivated().equals(other.getActivated()))
            && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
            && (this.getDeactivatedTime() == null ? other.getDeactivatedTime() == null : this.getDeactivatedTime().equals(other.getDeactivatedTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpandEmployeeId() == null) ? 0 : getExpandEmployeeId().hashCode());
        result = prime * result + ((getExpandEmployeeName() == null) ? 0 : getExpandEmployeeName().hashCode());
        result = prime * result + ((getExpandEmployeePhone() == null) ? 0 : getExpandEmployeePhone().hashCode());
        result = prime * result + ((getExpandEmployeeEmail() == null) ? 0 : getExpandEmployeeEmail().hashCode());
        result = prime * result + ((getWechatOpenid() == null) ? 0 : getWechatOpenid().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getActivated() == null) ? 0 : getActivated().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getDeactivatedTime() == null) ? 0 : getDeactivatedTime().hashCode());
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
        sb.append(", expandEmployeeId=").append(expandEmployeeId);
        sb.append(", expandEmployeeName=").append(expandEmployeeName);
        sb.append(", expandEmployeePhone=").append(expandEmployeePhone);
        sb.append(", expandEmployeeEmail=").append(expandEmployeeEmail);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", activated=").append(activated);
        sb.append(", disabled=").append(disabled);
        sb.append(", deactivatedTime=").append(deactivatedTime);
        sb.append(", remark=").append(remark);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", editor=").append(editor);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}