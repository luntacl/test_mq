package com.ulic.core.proposal.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class ProposalForm implements Serializable {
	
	
    private String proposalFormUniqId;
    
    private String proposalFormId;

    private String productMetadataId;

    private String transId;

    private String proposalFormStep;

    private String requestCookie;

    private String responseData;

    private Integer proposalFormStatus;

    private Integer policyRelationStatus;

    private String clientIp;

    private String handlerServer;

    private Date createdTime;

    private Date updatedTime;

    private String proposalFormStepContent;

    private static final long serialVersionUID = 1L;

    public String getProposalFormUniqId() {
        return proposalFormUniqId;
    }

    public void setProposalFormUniqId(String proposalFormUniqId) {
        this.proposalFormUniqId = proposalFormUniqId;
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

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getProposalFormStep() {
        return proposalFormStep;
    }

    public void setProposalFormStep(String proposalFormStep) {
        this.proposalFormStep = proposalFormStep == null ? null : proposalFormStep.trim();
    }

    public String getRequestCookie() {
        return requestCookie;
    }

    public void setRequestCookie(String requestCookie) {
        this.requestCookie = requestCookie == null ? null : requestCookie.trim();
    }

    public String getReposeData() {
        return responseData;
    }

    public void setReposeData(String responseData) {
        this.responseData = responseData == null ? null : responseData.trim();
    }

    public Integer getProposalFormStatus() {
        return proposalFormStatus;
    }

    public void setProposalFormStatus(Integer proposalFormStatus) {
        this.proposalFormStatus = proposalFormStatus;
    }

    public Integer getPolicyRelationStatus() {
        return policyRelationStatus;
    }

    public void setPolicyRelationStatus(Integer policyRelationStatus) {
        this.policyRelationStatus = policyRelationStatus;
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

    public String getProposalFormStepContent() {
        return proposalFormStepContent;
    }

    public void setProposalFormStepContent(String proposalFormStepContent) {
        this.proposalFormStepContent = proposalFormStepContent == null ? null : proposalFormStepContent.trim();
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
        ProposalForm other = (ProposalForm) that;
        return (this.getProposalFormUniqId() == null ? other.getProposalFormUniqId() == null : this.getProposalFormUniqId().equals(other.getProposalFormUniqId()))
            && (this.getProposalFormId() == null ? other.getProposalFormId() == null : this.getProposalFormId().equals(other.getProposalFormId()))
            && (this.getProductMetadataId() == null ? other.getProductMetadataId() == null : this.getProductMetadataId().equals(other.getProductMetadataId()))
            && (this.getTransId() == null ? other.getTransId() == null : this.getTransId().equals(other.getTransId()))
            && (this.getProposalFormStep() == null ? other.getProposalFormStep() == null : this.getProposalFormStep().equals(other.getProposalFormStep()))
            && (this.getRequestCookie() == null ? other.getRequestCookie() == null : this.getRequestCookie().equals(other.getRequestCookie()))
            && (this.getReposeData() == null ? other.getReposeData() == null : this.getReposeData().equals(other.getReposeData()))
            && (this.getProposalFormStatus() == null ? other.getProposalFormStatus() == null : this.getProposalFormStatus().equals(other.getProposalFormStatus()))
            && (this.getPolicyRelationStatus() == null ? other.getPolicyRelationStatus() == null : this.getPolicyRelationStatus().equals(other.getPolicyRelationStatus()))
            && (this.getClientIp() == null ? other.getClientIp() == null : this.getClientIp().equals(other.getClientIp()))
            && (this.getHandlerServer() == null ? other.getHandlerServer() == null : this.getHandlerServer().equals(other.getHandlerServer()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getProposalFormStepContent() == null ? other.getProposalFormStepContent() == null : this.getProposalFormStepContent().equals(other.getProposalFormStepContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProposalFormUniqId() == null) ? 0 : getProposalFormUniqId().hashCode());
        result = prime * result + ((getProposalFormId() == null) ? 0 : getProposalFormId().hashCode());
        result = prime * result + ((getProductMetadataId() == null) ? 0 : getProductMetadataId().hashCode());
        result = prime * result + ((getTransId() == null) ? 0 : getTransId().hashCode());
        result = prime * result + ((getProposalFormStep() == null) ? 0 : getProposalFormStep().hashCode());
        result = prime * result + ((getRequestCookie() == null) ? 0 : getRequestCookie().hashCode());
        result = prime * result + ((getReposeData() == null) ? 0 : getReposeData().hashCode());
        result = prime * result + ((getProposalFormStatus() == null) ? 0 : getProposalFormStatus().hashCode());
        result = prime * result + ((getPolicyRelationStatus() == null) ? 0 : getPolicyRelationStatus().hashCode());
        result = prime * result + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        result = prime * result + ((getHandlerServer() == null) ? 0 : getHandlerServer().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getProposalFormStepContent() == null) ? 0 : getProposalFormStepContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proposalFormUniqId=").append(proposalFormUniqId);
        sb.append(", proposalFormId=").append(proposalFormId);
        sb.append(", productMetadataId=").append(productMetadataId);
        sb.append(", transId=").append(transId);
        sb.append(", proposalFormStep=").append(proposalFormStep);
        sb.append(", requestCookie=").append(requestCookie);
        sb.append(", responseData=").append(responseData);
        sb.append(", proposalFormStatus=").append(proposalFormStatus);
        sb.append(", policyRelationStatus=").append(policyRelationStatus);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", handlerServer=").append(handlerServer);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", proposalFormStepContent=").append(proposalFormStepContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}