package com.ulic.core.proposal.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class Proposal implements Serializable {
	
	@Id
    private String proposalId;

    private String proposalFormId;

    private String productMetadataId;

    private String channelId;

    private String referId;

    private String agencyId;

    private String memberId;

    private String institutionCode;

    private String parentProposalId;

    private Integer holderType;

    private String holderName;

    private String holderPhone;

    private String holderCidtype;

    private String holderCidno;

    private Long premium;

    private Integer onlinePay;

    private String couponId;

    private Integer proposalStatus;

    private String clientIp;

    public String getProposalContent() {
		return proposalContent;
	}

	public void setProposalContent(String proposalContent) {
		this.proposalContent = proposalContent;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	private String handlerServer;

    private Date createdTime;

    private Date updatedTime;
    
    private String proposalContent;

    private String responseData;

    private static final long serialVersionUID = 1L;

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId == null ? null : proposalId.trim();
    }


    public String getProposalFormId() {
		return proposalFormId;
	}

	public void setProposalFormId(String proposalFormId) {
		this.proposalFormId = proposalFormId;
	}

	public String getProductMetadataId() {
        return productMetadataId;
    }

    public void setProductMetadataId(String productMetadataId) {
        this.productMetadataId = productMetadataId == null ? null : productMetadataId.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getReferId() {
        return referId;
    }

    public void setReferId(String referId) {
        this.referId = referId == null ? null : referId.trim();
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId == null ? null : agencyId.trim();
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode == null ? null : institutionCode.trim();
    }

    public String getParentProposalId() {
        return parentProposalId;
    }

    public void setParentProposalId(String parentProposalId) {
        this.parentProposalId = parentProposalId == null ? null : parentProposalId.trim();
    }

    public Integer getHolderType() {
        return holderType;
    }

    public void setHolderType(Integer holderType) {
        this.holderType = holderType;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName == null ? null : holderName.trim();
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone == null ? null : holderPhone.trim();
    }

    public String getHolderCidtype() {
        return holderCidtype;
    }

    public void setHolderCidtype(String holderCidtype) {
        this.holderCidtype = holderCidtype == null ? null : holderCidtype.trim();
    }

    public String getHolderCidno() {
        return holderCidno;
    }

    public void setHolderCidno(String holderCidno) {
        this.holderCidno = holderCidno == null ? null : holderCidno.trim();
    }

    public Long getPremium() {
        return premium;
    }

    public void setPremium(Long premium) {
        this.premium = premium;
    }

    public Integer getOnlinePay() {
        return onlinePay;
    }

    public void setOnlinePay(Integer onlinePay) {
        this.onlinePay = onlinePay;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public Integer getProposalStatus() {
        return proposalStatus;
    }

    public void setProposalStatus(Integer proposalStatus) {
        this.proposalStatus = proposalStatus;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getHandlerServer() {
        return handlerServer;
    }

    public void setHandlerServer(String handlerServer) {
        this.handlerServer = handlerServer == null ? null : handlerServer.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
        Proposal other = (Proposal) that;
        return (this.getProposalId() == null ? other.getProposalId() == null : this.getProposalId().equals(other.getProposalId()))
            && (this.getProposalFormId() == null ? other.getProposalFormId() == null : this.getProposalFormId().equals(other.getProposalFormId()))
            && (this.getProductMetadataId() == null ? other.getProductMetadataId() == null : this.getProductMetadataId().equals(other.getProductMetadataId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getReferId() == null ? other.getReferId() == null : this.getReferId().equals(other.getReferId()))
            && (this.getAgencyId() == null ? other.getAgencyId() == null : this.getAgencyId().equals(other.getAgencyId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getInstitutionCode() == null ? other.getInstitutionCode() == null : this.getInstitutionCode().equals(other.getInstitutionCode()))
            && (this.getParentProposalId() == null ? other.getParentProposalId() == null : this.getParentProposalId().equals(other.getParentProposalId()))
            && (this.getHolderType() == null ? other.getHolderType() == null : this.getHolderType().equals(other.getHolderType()))
            && (this.getHolderName() == null ? other.getHolderName() == null : this.getHolderName().equals(other.getHolderName()))
            && (this.getHolderPhone() == null ? other.getHolderPhone() == null : this.getHolderPhone().equals(other.getHolderPhone()))
            && (this.getHolderCidtype() == null ? other.getHolderCidtype() == null : this.getHolderCidtype().equals(other.getHolderCidtype()))
            && (this.getHolderCidno() == null ? other.getHolderCidno() == null : this.getHolderCidno().equals(other.getHolderCidno()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getOnlinePay() == null ? other.getOnlinePay() == null : this.getOnlinePay().equals(other.getOnlinePay()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getProposalStatus() == null ? other.getProposalStatus() == null : this.getProposalStatus().equals(other.getProposalStatus()))
            && (this.getClientIp() == null ? other.getClientIp() == null : this.getClientIp().equals(other.getClientIp()))
            && (this.getHandlerServer() == null ? other.getHandlerServer() == null : this.getHandlerServer().equals(other.getHandlerServer()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProposalId() == null) ? 0 : getProposalId().hashCode());
        result = prime * result + ((getProposalFormId() == null) ? 0 : getProposalFormId().hashCode());
        result = prime * result + ((getProductMetadataId() == null) ? 0 : getProductMetadataId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getReferId() == null) ? 0 : getReferId().hashCode());
        result = prime * result + ((getAgencyId() == null) ? 0 : getAgencyId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getInstitutionCode() == null) ? 0 : getInstitutionCode().hashCode());
        result = prime * result + ((getParentProposalId() == null) ? 0 : getParentProposalId().hashCode());
        result = prime * result + ((getHolderType() == null) ? 0 : getHolderType().hashCode());
        result = prime * result + ((getHolderName() == null) ? 0 : getHolderName().hashCode());
        result = prime * result + ((getHolderPhone() == null) ? 0 : getHolderPhone().hashCode());
        result = prime * result + ((getHolderCidtype() == null) ? 0 : getHolderCidtype().hashCode());
        result = prime * result + ((getHolderCidno() == null) ? 0 : getHolderCidno().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getOnlinePay() == null) ? 0 : getOnlinePay().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getProposalStatus() == null) ? 0 : getProposalStatus().hashCode());
        result = prime * result + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        result = prime * result + ((getHandlerServer() == null) ? 0 : getHandlerServer().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proposalId=").append(proposalId);
        sb.append(", proposalFormId=").append(proposalFormId);
        sb.append(", productMetadataId=").append(productMetadataId);
        sb.append(", channelId=").append(channelId);
        sb.append(", referId=").append(referId);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", memberId=").append(memberId);
        sb.append(", institutionCode=").append(institutionCode);
        sb.append(", parentProposalId=").append(parentProposalId);
        sb.append(", holderType=").append(holderType);
        sb.append(", holderName=").append(holderName);
        sb.append(", holderPhone=").append(holderPhone);
        sb.append(", holderCidtype=").append(holderCidtype);
        sb.append(", holderCidno=").append(holderCidno);
        sb.append(", premium=").append(premium);
        sb.append(", onlinePay=").append(onlinePay);
        sb.append(", couponId=").append(couponId);
        sb.append(", proposalStatus=").append(proposalStatus);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", handlerServer=").append(handlerServer);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}