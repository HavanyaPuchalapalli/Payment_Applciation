package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 490574909308863512L;
	@Id
	@Column(length = 11)
	private String bic;
	@Column(length=100)
	private String bankName;
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bankName, bic);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(bankName, other.bankName) && Objects.equals(bic, other.bic);
	}
	@Override
	public String toString() {
		return "Bank [bic=" + bic + ", bankName=" + bankName + ", getBic()=" + getBic() + ", getBankName()="
				+ getBankName() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	public Bank(String bic, String bankName) {
		super();
		this.bic = bic;
		this.bankName = bankName;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
