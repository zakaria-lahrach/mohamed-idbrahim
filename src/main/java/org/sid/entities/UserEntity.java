package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Users")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5631554753157936922L;
	
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable=false)
	private String userid;
	@Column(nullable=false,length=50)
	private String firstname;
	@Column(nullable=false,length=50)
	private String lastname;
	@Column(nullable=false,length=120)
	private String email;
	@Column(nullable=false,unique=true)
	private String encryptePassword;
	@Column(nullable=true)
	private String emailVerificationToken;
	@Column(nullable=false,columnDefinition="boolean default false")
	private boolean emailVerificationStatus =false;
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
