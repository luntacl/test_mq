package com.ulic.core.channel.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class FeeStrategy implements Serializable {
	@Id
    private String feeStrategyId;

    private String feeStrategyName;

    private Float feeRate;

    private String billingCycleUnit;

    private Integer billingCycle;

    private String remark;

    private String creator;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getFeeStrategyId() {
        return feeStrategyId;
    }

    public void setFeeStrategyId(String feeStrategyId) {
        this.feeStrategyId = feeStrategyId;
    }

    public String getFeeStrategyName() {
        return feeStrategyName;
    }

    public void setFeeStrategyName(String feeStrategyName) {
        this.feeStrategyName = feeStrategyName == null ? null : feeStrategyName.trim();
    }

    public Float getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Float feeRate) {
        this.feeRate = feeRate;
    }

    public String getBillingCycleUnit() {
        return billingCycleUnit;
    }

    public void setBillingCycleUnit(String billingCycleUnit) {
        this.billingCycleUnit = billingCycleUnit == null ? null : billingCycleUnit.trim();
    }

    public Integer getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Integer billingCycle) {
        this.billingCycle = billingCycle;
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
        FeeStrategy other = (FeeStrategy) that;
        return (this.getFeeStrategyId() == null ? other.getFeeStrategyId() == null : this.getFeeStrategyId().equals(other.getFeeStrategyId()))
            && (this.getFeeStrategyName() == null ? other.getFeeStrategyName() == null : this.getFeeStrategyName().equals(other.getFeeStrategyName()))
            && (this.getFeeRate() == null ? other.getFeeRate() == null : this.getFeeRate().equals(other.getFeeRate()))
            && (this.getBillingCycleUnit() == null ? other.getBillingCycleUnit() == null : this.getBillingCycleUnit().equals(other.getBillingCycleUnit()))
            && (this.getBillingCycle() == null ? other.getBillingCycle() == null : this.getBillingCycle().equals(other.getBillingCycle()))
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
        result = prime * result + ((getFeeStrategyId() == null) ? 0 : getFeeStrategyId().hashCode());
        result = prime * result + ((getFeeStrategyName() == null) ? 0 : getFeeStrategyName().hashCode());
        result = prime * result + ((getFeeRate() == null) ? 0 : getFeeRate().hashCode());
        result = prime * result + ((getBillingCycleUnit() == null) ? 0 : getBillingCycleUnit().hashCode());
        result = prime * result + ((getBillingCycle() == null) ? 0 : getBillingCycle().hashCode());
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
        sb.append(", feeStrategyId=").append(feeStrategyId);
        sb.append(", feeStrategyName=").append(feeStrategyName);
        sb.append(", feeRate=").append(feeRate);
        sb.append(", billingCycleUnit=").append(billingCycleUnit);
        sb.append(", billingCycle=").append(billingCycle);
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