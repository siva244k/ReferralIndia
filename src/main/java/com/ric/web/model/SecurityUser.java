package com.ric.web.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7738605003402544318L;

	// @NotEmpty(message = "please enter first name ")
	private String firstName;

	// @NotEmpty(message = "please enter lastname")
	private String lastName;

	// @NotEmpty
	// @Email(message = "Email should be in ...@mail.com format")
	private String perEmail;

	// @NotEmpty
	// @Email(message = "Email should be in ...@mail.com format")
	private String orgEmail;

	public SecurityUser(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities,
			String firstName, String lastName, String perEmail, String orgEmail) {
		super(username, password, enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);

		this.firstName = firstName;
		this.lastName = lastName;
		this.perEmail = perEmail;
		this.orgEmail = orgEmail;

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

	public String getOrgEmail() {
		return orgEmail;
	}

	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}