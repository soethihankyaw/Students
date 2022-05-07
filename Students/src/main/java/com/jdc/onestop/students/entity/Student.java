package com.jdc.onestop.students.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String phone;
	private String gmail;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Account account;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String phone, String gmail) {
		super();
		this.name = name;
		this.phone = phone;
		this.gmail = gmail;
	}

}
