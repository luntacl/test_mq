package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class Channel implements Serializable {
	@Id
    private String channelId;

    private String channelName;

    private String channelManager;

    private Long partnerId;

    private String ipList;

    private String tokenKey;

    private String securityTypeId;

    private String securityKey;

    private Integer channelStatus;

    private String channelConfig;

    private String remark;

    private String creator;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelManager() {
        return channelManager;
    }

    public void setChannelManager(String channelManager) {
        this.channelManager = channelManager == null ? null : channelManager.trim();
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getIpList() {
        return ipList;
    }

    public void setIpList(String ipList) {
        this.ipList = ipList == null ? null : ipList.trim();
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey == null ? null : tokenKey.trim();
    }

    public String getSecurityTypeId() {
        return securityTypeId;
    }

    public void setSecurityTypeId(String securityTypeId) {
        this.securityTypeId = securityTypeId == null ? null : securityTypeId.trim();
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey == null ? null : securityKey.trim();
    }

    public Integer getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
    }

    public String getChannelConfig() {
        return channelConfig;
    }

    public void setChannelConfig(String channelConfig) {
        this.channelConfig = channelConfig == null ? null : channelConfig.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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
        Channel other = (Channel) that;
        return (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getChannelManager() == null ? other.getChannelManager() == null : this.getChannelManager().equals(other.getChannelManager()))
            && (this.getPartnerId() == null ? other.getPartnerId() == null : this.getPartnerId().equals(other.getPartnerId()))
            && (this.getIpList() == null ? other.getIpList() == null : this.getIpList().equals(other.getIpList()))
            && (this.getTokenKey() == null ? other.getTokenKey() == null : this.getTokenKey().equals(other.getTokenKey()))
            && (this.getSecurityTypeId() == null ? other.getSecurityTypeId() == null : this.getSecurityTypeId().equals(other.getSecurityTypeId()))
            && (this.getSecurityKey() == null ? other.getSecurityKey() == null : this.getSecurityKey().equals(other.getSecurityKey()))
            && (this.getChannelStatus() == null ? other.getChannelStatus() == null : this.getChannelStatus().equals(other.getChannelStatus()))
            && (this.getChannelConfig() == null ? other.getChannelConfig() == null : this.getChannelConfig().equals(other.getChannelConfig()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getChannelManager() == null) ? 0 : getChannelManager().hashCode());
        result = prime * result + ((getPartnerId() == null) ? 0 : getPartnerId().hashCode());
        result = prime * result + ((getIpList() == null) ? 0 : getIpList().hashCode());
        result = prime * result + ((getTokenKey() == null) ? 0 : getTokenKey().hashCode());
        result = prime * result + ((getSecurityTypeId() == null) ? 0 : getSecurityTypeId().hashCode());
        result = prime * result + ((getSecurityKey() == null) ? 0 : getSecurityKey().hashCode());
        result = prime * result + ((getChannelStatus() == null) ? 0 : getChannelStatus().hashCode());
        result = prime * result + ((getChannelConfig() == null) ? 0 : getChannelConfig().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
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
        sb.append(", channelId=").append(channelId);
        sb.append(", channelName=").append(channelName);
        sb.append(", channelManager=").append(channelManager);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", ipList=").append(ipList);
        sb.append(", tokenKey=").append(tokenKey);
        sb.append(", securityTypeId=").append(securityTypeId);
        sb.append(", securityKey=").append(securityKey);
        sb.append(", channelStatus=").append(channelStatus);
        sb.append(", channelConfig=").append(channelConfig);
        sb.append(", remark=").append(remark);
        sb.append(", creator=").append(creator);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", editor=").append(editor);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}