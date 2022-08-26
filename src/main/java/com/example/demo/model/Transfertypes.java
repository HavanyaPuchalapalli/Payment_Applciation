package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transfertypes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5970673540404241857L;
	@Id
	
	@Column(length=1)
	private String transferTypeCode;
	@Column(length = 100)
	private String transferTypeDescription;
	public String getTransferTypeCode() {
		return transferTypeCode;
	}
	public void setTransferTypeCode(String transferTypeCode) {
		this.transferTypeCode = transferTypeCode;
	}
	public String getTransferTypeDescription() {
		return transferTypeDescription;
	}
	public void setTransferTypeDescription(String transferTypeDescription) {
		this.transferTypeDescription = transferTypeDescription;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(transferTypeCode, transferTypeDescription);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transfertypes other = (Transfertypes) obj;
		return Objects.equals(transferTypeCode, other.transferTypeCode)
				&& Objects.equals(transferTypeDescription, other.transferTypeDescription);
	}
	@Override
	public String toString() {
		return "Transfertypes [transferTypeCode=" + transferTypeCode + ", transferTypeDescription="
				+ transferTypeDescription + ", getTransferTypeCode()=" + getTransferTypeCode()
				+ ", getTransferTypeDescription()=" + getTransferTypeDescription() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public Transfertypes(String transferTypeCode, String transferTypeDescription) {
		super();
		this.transferTypeCode = transferTypeCode;
		this.transferTypeDescription = transferTypeDescription;
	}
	public Transfertypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
