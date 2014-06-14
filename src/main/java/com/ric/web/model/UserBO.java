package com.ric.web.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserBO {

	@NotEmpty(message="username should not be empty")
	private String userName;

	@NotEmpty(message="please enter first name ")
	private String firstName;

	@NotEmpty(message="please enter lastname")
	private String lastName;

	@NotEmpty
	@Email(message="Email should be in ...@mail.com format")
	private String perEmail;

	@NotEmpty
	@Email(message="Email should be in ...@mail.com format")
	private String ogrEmail;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPerEmail() {
		return perEmail;
	}

	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	public String getOgrEmail() {
		return ogrEmail;
	}

	public void setOgrEmail(String ogrEmail) {
		this.ogrEmail = ogrEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@NotEmpty
	private String password;

}