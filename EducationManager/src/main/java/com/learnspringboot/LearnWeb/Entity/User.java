package com.learnspringboot.LearnWeb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Column(name = "Ho")
	private String ho;
	
	@Column(name = "Ten")
	private String ten;
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "vai_tro")
	private String role;
	
	
	public User() {
		
	}


	public User(String ho, String ten, String username, String password, String role) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public String getHo() {
		return ho;
	}


	public void setHo(String ho) {
		this.ho = ho;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
	
}
