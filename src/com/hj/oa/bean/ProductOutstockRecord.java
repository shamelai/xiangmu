package com.hj.oa.bean;

import java.io.Serializable;
import java.util.Date;

public class ProductOutstockRecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.odd_number
     *
     * @mbggenerated
     */
    private String oddNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.proposer
     *
     * @mbggenerated
     */
    private String proposer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.proposer_id
     *
     * @mbggenerated
     */
    private Integer proposerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.dept_id
     *
     * @mbggenerated
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.reason
     *
     * @mbggenerated
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.cancel_time
     *
     * @mbggenerated
     */
    private Date cancelTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.receiver_company
     *
     * @mbggenerated
     */
    private String receiverCompany;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.addr
     *
     * @mbggenerated
     */
    private String addr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.receiver
     *
     * @mbggenerated
     */
    private String receiver;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.tel
     *
     * @mbggenerated
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.contract
     *
     * @mbggenerated
     */
    private String contract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.approval_id
     *
     * @mbggenerated
     */
    private Integer approvalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_product_outstock_record.approval_type
     *
     * @mbggenerated
     */
    private String approvalType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_product_outstock_record
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.id
     *
     * @return the value of t_product_outstock_record.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.id
     *
     * @param id the value for t_product_outstock_record.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.odd_number
     *
     * @return the value of t_product_outstock_record.odd_number
     *
     * @mbggenerated
     */
    public String getOddNumber() {
        return oddNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.odd_number
     *
     * @param oddNumber the value for t_product_outstock_record.odd_number
     *
     * @mbggenerated
     */
    public void setOddNumber(String oddNumber) {
        this.oddNumber = oddNumber == null ? null : oddNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.proposer
     *
     * @return the value of t_product_outstock_record.proposer
     *
     * @mbggenerated
     */
    public String getProposer() {
        return proposer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.proposer
     *
     * @param proposer the value for t_product_outstock_record.proposer
     *
     * @mbggenerated
     */
    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.proposer_id
     *
     * @return the value of t_product_outstock_record.proposer_id
     *
     * @mbggenerated
     */
    public Integer getProposerId() {
        return proposerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.proposer_id
     *
     * @param proposerId the value for t_product_outstock_record.proposer_id
     *
     * @mbggenerated
     */
    public void setProposerId(Integer proposerId) {
        this.proposerId = proposerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.dept_id
     *
     * @return the value of t_product_outstock_record.dept_id
     *
     * @mbggenerated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.dept_id
     *
     * @param deptId the value for t_product_outstock_record.dept_id
     *
     * @mbggenerated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.create_time
     *
     * @return the value of t_product_outstock_record.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.create_time
     *
     * @param createTime the value for t_product_outstock_record.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.reason
     *
     * @return the value of t_product_outstock_record.reason
     *
     * @mbggenerated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.reason
     *
     * @param reason the value for t_product_outstock_record.reason
     *
     * @mbggenerated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.cancel_time
     *
     * @return the value of t_product_outstock_record.cancel_time
     *
     * @mbggenerated
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.cancel_time
     *
     * @param cancelTime the value for t_product_outstock_record.cancel_time
     *
     * @mbggenerated
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.receiver_company
     *
     * @return the value of t_product_outstock_record.receiver_company
     *
     * @mbggenerated
     */
    public String getReceiverCompany() {
        return receiverCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.receiver_company
     *
     * @param receiverCompany the value for t_product_outstock_record.receiver_company
     *
     * @mbggenerated
     */
    public void setReceiverCompany(String receiverCompany) {
        this.receiverCompany = receiverCompany == null ? null : receiverCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.addr
     *
     * @return the value of t_product_outstock_record.addr
     *
     * @mbggenerated
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.addr
     *
     * @param addr the value for t_product_outstock_record.addr
     *
     * @mbggenerated
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.receiver
     *
     * @return the value of t_product_outstock_record.receiver
     *
     * @mbggenerated
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.receiver
     *
     * @param receiver the value for t_product_outstock_record.receiver
     *
     * @mbggenerated
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.tel
     *
     * @return the value of t_product_outstock_record.tel
     *
     * @mbggenerated
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.tel
     *
     * @param tel the value for t_product_outstock_record.tel
     *
     * @mbggenerated
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.contract
     *
     * @return the value of t_product_outstock_record.contract
     *
     * @mbggenerated
     */
    public String getContract() {
        return contract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.contract
     *
     * @param contract the value for t_product_outstock_record.contract
     *
     * @mbggenerated
     */
    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.state
     *
     * @return the value of t_product_outstock_record.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.state
     *
     * @param state the value for t_product_outstock_record.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.approval_id
     *
     * @return the value of t_product_outstock_record.approval_id
     *
     * @mbggenerated
     */
    public Integer getApprovalId() {
        return approvalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.approval_id
     *
     * @param approvalId the value for t_product_outstock_record.approval_id
     *
     * @mbggenerated
     */
    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_product_outstock_record.approval_type
     *
     * @return the value of t_product_outstock_record.approval_type
     *
     * @mbggenerated
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_product_outstock_record.approval_type
     *
     * @param approvalType the value for t_product_outstock_record.approval_type
     *
     * @mbggenerated
     */
    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType == null ? null : approvalType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_outstock_record
     *
     * @mbggenerated
     */
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
        ProductOutstockRecord other = (ProductOutstockRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOddNumber() == null ? other.getOddNumber() == null : this.getOddNumber().equals(other.getOddNumber()))
            && (this.getProposer() == null ? other.getProposer() == null : this.getProposer().equals(other.getProposer()))
            && (this.getProposerId() == null ? other.getProposerId() == null : this.getProposerId().equals(other.getProposerId()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getCancelTime() == null ? other.getCancelTime() == null : this.getCancelTime().equals(other.getCancelTime()))
            && (this.getReceiverCompany() == null ? other.getReceiverCompany() == null : this.getReceiverCompany().equals(other.getReceiverCompany()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getReceiver() == null ? other.getReceiver() == null : this.getReceiver().equals(other.getReceiver()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getContract() == null ? other.getContract() == null : this.getContract().equals(other.getContract()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getApprovalId() == null ? other.getApprovalId() == null : this.getApprovalId().equals(other.getApprovalId()))
            && (this.getApprovalType() == null ? other.getApprovalType() == null : this.getApprovalType().equals(other.getApprovalType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_outstock_record
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOddNumber() == null) ? 0 : getOddNumber().hashCode());
        result = prime * result + ((getProposer() == null) ? 0 : getProposer().hashCode());
        result = prime * result + ((getProposerId() == null) ? 0 : getProposerId().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getCancelTime() == null) ? 0 : getCancelTime().hashCode());
        result = prime * result + ((getReceiverCompany() == null) ? 0 : getReceiverCompany().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getReceiver() == null) ? 0 : getReceiver().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getContract() == null) ? 0 : getContract().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getApprovalId() == null) ? 0 : getApprovalId().hashCode());
        result = prime * result + ((getApprovalType() == null) ? 0 : getApprovalType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_product_outstock_record
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", oddNumber=").append(oddNumber);
        sb.append(", proposer=").append(proposer);
        sb.append(", proposerId=").append(proposerId);
        sb.append(", deptId=").append(deptId);
        sb.append(", createTime=").append(createTime);
        sb.append(", reason=").append(reason);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", receiverCompany=").append(receiverCompany);
        sb.append(", addr=").append(addr);
        sb.append(", receiver=").append(receiver);
        sb.append(", tel=").append(tel);
        sb.append(", contract=").append(contract);
        sb.append(", state=").append(state);
        sb.append(", approvalId=").append(approvalId);
        sb.append(", approvalType=").append(approvalType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}