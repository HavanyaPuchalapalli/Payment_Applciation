package com.example.demo.model;

import java.io.Serializable;
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
public class Logger implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8743370302364537201L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 11)
	private Integer loggerId;
	@OneToOne(cascade = CascadeType.ALL)
	@Column(length = 11)
	private Customer customerId;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 11)
	private Set<Customeruser> userId;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 100)
	private Set<Employee> employeeId;
	@Column(length = 100)
	private String screeName;
	@Column(length = 100)
	private String action;
	@Column(length = 200)
	private String ipAddress;
	public Integer getLoggerId() {
		return loggerId;
	}
	public void setLoggerId(Integer loggerId) {
		this.loggerId = loggerId;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public Set<Customeruser> getUserId() {
		return userId;
	}
	public void setUserId(Set<Customeruser> userId) {
		this.userId = userId;
	}
	public Set<Employee> getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Set<Employee> employeeId) {
		this.employeeId = employeeId;
	}
	public String getScreeName() {
		return screeName;
	}
	public void setScreeName(String screeName) {
		this.screeName = screeName;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(action, customerId, employeeId, ipAddress, loggerId, screeName, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logger other = (Logger) obj;
		return Objects.equals(action, other.action) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(ipAddress, other.ipAddress)
				&& Objects.equals(loggerId, other.loggerId) && Objects.equals(screeName, other.screeName)
				&& Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "Logger [loggerId=" + loggerId + ", customerId=" + customerId + ", userId=" + userId + ", employeeId="
				+ employeeId + ", screeName=" + screeName + ", action=" + action + ", ipAddress=" + ipAddress
				+ ", getLoggerId()=" + getLoggerId() + ", getCustomerId()=" + getCustomerId() + ", getUserId()="
				+ getUserId() + ", getEmployeeId()=" + getEmployeeId() + ", getScreeName()=" + getScreeName()
				+ ", getAction()=" + getAction() + ", getIpAddress()=" + getIpAddress() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public Logger(Integer loggerId, Customer customerId, Set<Customeruser> userId, Set<Employee> employeeId,
			String screeName, String action, String ipAddress) {
		super();
		this.loggerId = loggerId;
		this.customerId = customerId;
		this.userId = userId;
		this.employeeId = employeeId;
		this.screeName = screeName;
		this.action = action;
		this.ipAddress = ipAddress;
	}
	public Logger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
