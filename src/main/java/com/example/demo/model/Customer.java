package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3591791467935994808L;
	@Id
	private String customerId;
	@Column(length= 50,
			unique=true)
	private String accountHolderName;
	@Column(length = 1)
	private Boolean overDraftFlag;
	@Column(length = 10)
	private Double clearBalance;
	@Column(length = 100)
	private String customerAddress;
	@Column(length = 100)
	private String customerCity;
	@Column(length = 1)
	private String customerType;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Boolean getOverDraftFlag() {
		return overDraftFlag;
	}
	public void setOverDraftFlag(Boolean overDraftFlag) {
		this.overDraftFlag = overDraftFlag;
	}
	public Double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(Double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, clearBalance, customerAddress, customerCity, customerId, customerType,
				overDraftFlag);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accountHolderName, other.accountHolderName)
				&& Objects.equals(clearBalance, other.clearBalance)
				&& Objects.equals(customerAddress, other.customerAddress)
				&& Objects.equals(customerCity, other.customerCity) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerType, other.customerType)
				&& Objects.equals(overDraftFlag, other.overDraftFlag);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountHolderName=" + accountHolderName + ", overDraftFlag="
				+ overDraftFlag + ", clearBalance=" + clearBalance + ", customerAddress=" + customerAddress
				+ ", customerCity=" + customerCity + ", customerType=" + customerType + ", getCustomerId()="
				+ getCustomerId() + ", getAccountHolderName()=" + getAccountHolderName() + ", getOverDraftFlag()="
				+ getOverDraftFlag() + ", getClearBalance()=" + getClearBalance() + ", getCustomerAddress()="
				+ getCustomerAddress() + ", getCustomerCity()=" + getCustomerCity() + ", getCustomerType()="
				+ getCustomerType() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	public Customer(String customerId, String accountHolderName, Boolean overDraftFlag, Double clearBalance,
			String customerAddress, String customerCity, String customerType) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.overDraftFlag = overDraftFlag;
		this.clearBalance = clearBalance;
		this.customerAddress = customerAddress;
		this.customerCity = customerCity;
		this.customerType = customerType;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
