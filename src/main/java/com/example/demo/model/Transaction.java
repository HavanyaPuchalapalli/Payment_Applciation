package com.example.demo.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3046487651983594996L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 11)
	private Integer transactionId;
	@OneToOne(cascade = CascadeType.ALL)
	@Column(length = 11)
	private Customer customerid;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 3)
	private Set<Currency> currencyCode;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 11)
	private Set<Bank> senderBIC;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 11)
	private Set<Bank> receiverBIC;
	@Column(length = 11)
	private String receiverAccountHolderNumber;
	@Column(length = 100)
	private String receiverAccountHolderName;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 1)
	private Set<Transfertypes> transferTypeCode;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 4)
	private Set<Message> messageCode;
	@Column(length = 10)
	private Double currencyAmount;
	@Column(length = 10)
	private Double transferFees;
	@Column(length = 10)
	private Double inrAmount;
	private Calendar transferDate;
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Customer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}
	public Set<Currency> getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(Set<Currency> currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Set<Bank> getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(Set<Bank> senderBIC) {
		this.senderBIC = senderBIC;
	}
	public Set<Bank> getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(Set<Bank> receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiverAccountHolderNumber() {
		return receiverAccountHolderNumber;
	}
	public void setReceiverAccountHolderNumber(String receiverAccountHolderNumber) {
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
	}
	public String getReceiverAccountHolderName() {
		return receiverAccountHolderName;
	}
	public void setReceiverAccountHolderName(String receiverAccountHolderName) {
		this.receiverAccountHolderName = receiverAccountHolderName;
	}
	public Set<Transfertypes> getTransferTypeCode() {
		return transferTypeCode;
	}
	public void setTransferTypeCode(Set<Transfertypes> transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}
	public Set<Message> getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(Set<Message> messageCode) {
		this.messageCode = messageCode;
	}
	public Double getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(Double currencyAmount) {
		this.currencyAmount = currencyAmount;
	}
	public Double getTransferFees() {
		return transferFees;
	}
	public void setTransferFees(Double transferFees) {
		this.transferFees = transferFees;
	}
	public Double getInrAmount() {
		return inrAmount;
	}
	public void setInrAmount(Double inrAmount) {
		this.inrAmount = inrAmount;
	}
	public Calendar getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Calendar transferDate) {
		this.transferDate = transferDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(currencyAmount, currencyCode, customerid, inrAmount, messageCode, receiverAccountHolderName,
				receiverAccountHolderNumber, receiverBIC, senderBIC, transactionId, transferDate, transferFees,
				transferTypeCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(currencyAmount, other.currencyAmount) && Objects.equals(currencyCode, other.currencyCode)
				&& Objects.equals(customerid, other.customerid) && Objects.equals(inrAmount, other.inrAmount)
				&& Objects.equals(messageCode, other.messageCode)
				&& Objects.equals(receiverAccountHolderName, other.receiverAccountHolderName)
				&& Objects.equals(receiverAccountHolderNumber, other.receiverAccountHolderNumber)
				&& Objects.equals(receiverBIC, other.receiverBIC) && Objects.equals(senderBIC, other.senderBIC)
				&& Objects.equals(transactionId, other.transactionId)
				&& Objects.equals(transferDate, other.transferDate) && Objects.equals(transferFees, other.transferFees)
				&& Objects.equals(transferTypeCode, other.transferTypeCode);
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerid=" + customerid + ", currencyCode="
				+ currencyCode + ", senderBIC=" + senderBIC + ", receiverBIC=" + receiverBIC
				+ ", receiverAccountHolderNumber=" + receiverAccountHolderNumber + ", receiverAccountHolderName="
				+ receiverAccountHolderName + ", transferTypeCode=" + transferTypeCode + ", messageCode=" + messageCode
				+ ", currencyAmount=" + currencyAmount + ", transferFees=" + transferFees + ", inrAmount=" + inrAmount
				+ ", transferDate=" + transferDate + ", getTransactionId()=" + getTransactionId() + ", getCustomerid()="
				+ getCustomerid() + ", getCurrencyCode()=" + getCurrencyCode() + ", getSenderBIC()=" + getSenderBIC()
				+ ", getReceiverBIC()=" + getReceiverBIC() + ", getReceiverAccountHolderNumber()="
				+ getReceiverAccountHolderNumber() + ", getReceiverAccountHolderName()="
				+ getReceiverAccountHolderName() + ", getTransferTypeCode()=" + getTransferTypeCode()
				+ ", getMessageCode()=" + getMessageCode() + ", getCurrencyAmount()=" + getCurrencyAmount()
				+ ", getTransferFees()=" + getTransferFees() + ", getInrAmount()=" + getInrAmount()
				+ ", getTransferDate()=" + getTransferDate() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	public Transaction(Integer transactionId, Customer customerid, Set<Currency> currencyCode, Set<Bank> senderBIC,
			Set<Bank> receiverBIC, String receiverAccountHolderNumber, String receiverAccountHolderName,
			Set<Transfertypes> transferTypeCode, Set<Message> messageCode, Double currencyAmount, Double transferFees,
			Double inrAmount, Calendar transferDate) {
		super();
		this.transactionId = transactionId;
		this.customerid = customerid;
		this.currencyCode = currencyCode;
		this.senderBIC = senderBIC;
		this.receiverBIC = receiverBIC;
		this.receiverAccountHolderNumber = receiverAccountHolderNumber;
		this.receiverAccountHolderName = receiverAccountHolderName;
		this.transferTypeCode = transferTypeCode;
		this.messageCode = messageCode;
		this.currencyAmount = currencyAmount;
		this.transferFees = transferFees;
		this.inrAmount = inrAmount;
		this.transferDate = transferDate;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
