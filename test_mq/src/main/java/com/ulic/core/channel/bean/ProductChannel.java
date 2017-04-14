package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class ProductChannel extends ProductChannelKey implements Serializable {
	@Id
    private String productChannelId;

    private String feeStrategyId;

    private Integer productChannelStatus;

    private Date onlineTime;

    private Date offlineTime;

    private Date maintainStarttime;

    private Date maintainEndtime;

    private String maintainUrl;

    private String remark;

    private String creator;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getProductChannelId() {
        return productChannelId;
    }

    public void setProductChannelId(String productChannelId) {
        this.productChannelId = productChannelId;
    }

    public String getFeeStrategyId() {
        return feeStrategyId;
    }

    public void setFeeStrategyId(String feeStrategyId) {
        this.feeStrategyId = feeStrategyId;
    }

    public Integer getProductChannelStatus() {
        return productChannelStatus;
    }

    public void setProductChannelStatus(Integer productChannelStatus) {
        this.productChannelStatus = productChannelStatus;
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Date getMaintainStarttime() {
        return maintainStarttime;
    }

    public void setMaintainStarttime(Date maintainStarttime) {
        this.maintainStarttime = maintainStarttime;
    }

    public Date getMaintainEndtime() {
        return maintainEndtime;
    }

    public void setMaintainEndtime(Date maintainEndtime) {
        this.maintainEndtime = maintainEndtime;
    }

    public String getMaintainUrl() {
        return maintainUrl;
    }

    public void setMaintainUrl(String maintainUrl) {
        this.maintainUrl = maintainUrl == null ? null : maintainUrl.trim();
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
        ProductChannel other = (ProductChannel) that;
        return (this.getProductMetadataId() == null ? other.getProductMetadataId() == null : this.getProductMetadataId().equals(other.getProductMetadataId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getProductChannelId() == null ? other.getProductChannelId() == null : this.getProductChannelId().equals(other.getProductChannelId()))
            && (this.getFeeStrategyId() == null ? other.getFeeStrategyId() == null : this.getFeeStrategyId().equals(other.getFeeStrategyId()))
            && (this.getProductChannelStatus() == null ? other.getProductChannelStatus() == null : this.getProductChannelStatus().equals(other.getProductChannelStatus()))
            && (this.getOnlineTime() == null ? other.getOnlineTime() == null : this.getOnlineTime().equals(other.getOnlineTime()))
            && (this.getOfflineTime() == null ? other.getOfflineTime() == null : this.getOfflineTime().equals(other.getOfflineTime()))
            && (this.getMaintainStarttime() == null ? other.getMaintainStarttime() == null : this.getMaintainStarttime().equals(other.getMaintainStarttime()))
            && (this.getMaintainEndtime() == null ? other.getMaintainEndtime() == null : this.getMaintainEndtime().equals(other.getMaintainEndtime()))
            && (this.getMaintainUrl() == null ? other.getMaintainUrl() == null : this.getMaintainUrl().equals(other.getMaintainUrl()))
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
        result = prime * result + ((getProductMetadataId() == null) ? 0 : getProductMetadataId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getProductChannelId() == null) ? 0 : getProductChannelId().hashCode());
        result = prime * result + ((getFeeStrategyId() == null) ? 0 : getFeeStrategyId().hashCode());
        result = prime * result + ((getProductChannelStatus() == null) ? 0 : getProductChannelStatus().hashCode());
        result = prime * result + ((getOnlineTime() == null) ? 0 : getOnlineTime().hashCode());
        result = prime * result + ((getOfflineTime() == null) ? 0 : getOfflineTime().hashCode());
        result = prime * result + ((getMaintainStarttime() == null) ? 0 : getMaintainStarttime().hashCode());
        result = prime * result + ((getMaintainEndtime() == null) ? 0 : getMaintainEndtime().hashCode());
        result = prime * result + ((getMaintainUrl() == null) ? 0 : getMaintainUrl().hashCode());
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
        sb.append(", productChannelId=").append(productChannelId);
        sb.append(", feeStrategyId=").append(feeStrategyId);
        sb.append(", productChannelStatus=").append(productChannelStatus);
        sb.append(", onlineTime=").append(onlineTime);
        sb.append(", offlineTime=").append(offlineTime);
        sb.append(", maintainStarttime=").append(maintainStarttime);
        sb.append(", maintainEndtime=").append(maintainEndtime);
        sb.append(", maintainUrl=").append(maintainUrl);
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