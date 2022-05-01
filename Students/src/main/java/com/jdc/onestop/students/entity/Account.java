package com.jdc.onestop.students.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private String password;
	private int activated;
	private Date registerAt;
	private Date retireAt;

	public Account(String username, String password, int activated, Date registerAt, Date retireAt) {
		super();
		this.username = username;
		this.password = password;
		this.activated = activated;
		this.registerAt = registerAt;
		this.retireAt = retireAt;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

}
