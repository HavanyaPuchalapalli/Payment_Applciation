package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customeruser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7715631267243116178L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 11)
	private Integer userId;
	@Column(length = 100, unique = true)
	private String userName;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(length = 11)
	private List<Customer> customerId;
	@Column(length = 100)
	private String userPassword;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Customer> getCustomerId() {
		return customerId;
	}
	public void setCustomerId(List<Customer> customerId) {
		this.customerId = customerId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, userId, userName, userPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customeruser other = (Customeruser) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
	}
	@Override
	public String toString() {
		return "Customeruser [userId=" + userId + ", userName=" + userName + ", customerId=" + customerId
				+ ", userPassword=" + userPassword + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
				+ ", getCustomerId()=" + getCustomerId() + ", getUserPassword()=" + getUserPassword() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public Customeruser(Integer userId, String userName, List<Customer> customerId, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.customerId = customerId;
		this.userPassword = userPassword;
	}
	public Customeruser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
