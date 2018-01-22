package com.relatech.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.relatech.model.UserProfile;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String username;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserProfile usprof;
	
	public User() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfile getUsprof() {
		return usprof;
	}

	public void setUsprof(UserProfile usprof) {
		this.usprof = usprof;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", usprof=" + usprof + "]";
	}
	
}
