package com.mybudget.personalbudget.adapter.init;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Esteban Agudelo
 */

@ConfigurationProperties("budget")
public class Credential {
	
	private String username;
	private String password;
	
	public final String getUsername() {
		return username;
	}
	public final void setUsername(String username) {
		this.username = username;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
}
