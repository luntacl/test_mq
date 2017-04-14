package com.ulic.core.proposal.bean;

import java.io.Serializable;

public class ProposalWithBLOBs extends Proposal implements Serializable {
    private String proposalContent;

    private String responseData;

    private static final long serialVersionUID = 1L;

    public String getProposalContent() {
        return proposalContent;
    }

    public void setProposalContent(String proposalContent) {
        this.proposalContent = proposalContent == null ? null : proposalContent.trim();
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData == null ? null : responseData.trim();
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
        ProposalWithBLOBs other = (ProposalWithBLOBs) that;
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
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getProposalContent() == null ? other.getProposalContent() == null : this.getProposalContent().equals(other.getProposalContent()))
            && (this.getResponseData() == null ? other.getResponseData() == null : this.getResponseData().equals(other.getResponseData()));
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
        result = prime * result + ((getProposalContent() == null) ? 0 : getProposalContent().hashCode());
        result = prime * result + ((getResponseData() == null) ? 0 : getResponseData().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proposalContent=").append(proposalContent);
        sb.append(", responseData=").append(responseData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}