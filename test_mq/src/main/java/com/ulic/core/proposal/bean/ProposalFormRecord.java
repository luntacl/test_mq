package com.ulic.core.proposal.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class ProposalFormRecord implements Serializable {
	@Id
    private String proposalFormId;

    private String channelId;

    private String coopRequestId;

    private String wechatOpenid;

    private String referId;

    private String agencyId;

    private String memberId;

    private String clientIp;

    private String handlerServer;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getProposalFormId() {
        return proposalFormId;
    }

    public void setProposalFormId(String proposalFormId) {
        this.proposalFormId = proposalFormId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getCoopRequestId() {
        return coopRequestId;
    }

    public void setCoopRequestId(String coopRequestId) {
        this.coopRequestId = coopRequestId == null ? null : coopRequestId.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
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
        ProposalFormRecord other = (ProposalFormRecord) that;
        return (this.getProposalFormId() == null ? other.getProposalFormId() == null : this.getProposalFormId().equals(other.getProposalFormId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getCoopRequestId() == null ? other.getCoopRequestId() == null : this.getCoopRequestId().equals(other.getCoopRequestId()))
            && (this.getWechatOpenid() == null ? other.getWechatOpenid() == null : this.getWechatOpenid().equals(other.getWechatOpenid()))
            && (this.getReferId() == null ? other.getReferId() == null : this.getReferId().equals(other.getReferId()))
            && (this.getAgencyId() == null ? other.getAgencyId() == null : this.getAgencyId().equals(other.getAgencyId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getClientIp() == null ? other.getClientIp() == null : this.getClientIp().equals(other.getClientIp()))
            && (this.getHandlerServer() == null ? other.getHandlerServer() == null : this.getHandlerServer().equals(other.getHandlerServer()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProposalFormId() == null) ? 0 : getProposalFormId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getCoopRequestId() == null) ? 0 : getCoopRequestId().hashCode());
        result = prime * result + ((getWechatOpenid() == null) ? 0 : getWechatOpenid().hashCode());
        result = prime * result + ((getReferId() == null) ? 0 : getReferId().hashCode());
        result = prime * result + ((getAgencyId() == null) ? 0 : getAgencyId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
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
        sb.append(", proposalFormId=").append(proposalFormId);
        sb.append(", channelId=").append(channelId);
        sb.append(", coopRequestId=").append(coopRequestId);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", referId=").append(referId);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", memberId=").append(memberId);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", handlerServer=").append(handlerServer);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}