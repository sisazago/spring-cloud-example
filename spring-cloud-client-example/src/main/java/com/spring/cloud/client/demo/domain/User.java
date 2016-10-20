package com.spring.cloud.client.demo.domain;

public class User {
	
	private String Name;
	
	private String role;
	
	private String message;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
