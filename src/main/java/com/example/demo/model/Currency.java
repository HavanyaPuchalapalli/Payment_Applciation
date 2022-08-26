package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8969799066740061461L;
	@Id
	@Column(length=3)
	private String currencyCode;
	@Column(length=100)
	private String currencyName;
	@Column(length = 10)
	private Double conversionRate;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public Double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conversionRate, currencyCode, currencyName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Objects.equals(conversionRate, other.conversionRate) && Objects.equals(currencyCode, other.currencyCode)
				&& Objects.equals(currencyName, other.currencyName);
	}
	@Override
	public String toString() {
		return "Currency [currencyCode=" + currencyCode + ", currencyName=" + currencyName + ", conversionRate="
				+ conversionRate + ", getCurrencyCode()=" + getCurrencyCode() + ", getCurrencyName()="
				+ getCurrencyName() + ", getConversionRate()=" + getConversionRate() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public Currency(String currencyCode, String currencyName, Double conversionRate) {
		super();
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.conversionRate = conversionRate;
	}
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
