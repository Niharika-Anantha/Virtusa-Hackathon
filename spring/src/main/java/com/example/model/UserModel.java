package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usermodel")
public class UserModel {
	
	@Id
	@GeneratedValue
	private int usermodelid;
	private int lawyermodelid;
	private String email;
	private String password;
	private String username;
	private String mobileNumber;
	private boolean active;
	private String role;
	
	public UserModel() {}
	
	
	public UserModel(String email, String password, String username, String mobileNumber, boolean active, String role) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.active = active;
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserModel [email=" + email + ", password=" + password + ", username=" + username + ", mobileNumber="
				+ mobileNumber + ", active=" + active + ", role=" + role + ", usermodelid=" + usermodelid + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getUsermodelid() {
		return usermodelid;
	}
	public void setUsermodelid(int usermodelid) {
		this.usermodelid = usermodelid;
	}


	public int getLawyermodelid() {
		return lawyermodelid;
	}


	public void setLawyermodelid(int lawyermodelid) {
		this.lawyermodelid = lawyermodelid;
	}
	
}
