package org.sid.dto;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9088488986675507318L;
	private long id;
	private String userid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String encryptePassword;
	private String emailVerificationToken;
	private boolean emailVerificationStatus=false;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getEncryptePassword() {
		return encryptePassword;
	}
	public void setEncryptePassword(String encryptePassword) {
		this.encryptePassword = encryptePassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public boolean isEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}

	
	
}
