package org.sid.response;


public class UserReponse {
	
	private String userid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	
	
	public String getId() {
		return userid;
	}
	public void setId(String id) {
		this.userid = id;
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
	
	

}
