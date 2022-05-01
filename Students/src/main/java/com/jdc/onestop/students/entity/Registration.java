package com.jdc.onestop.students.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date registerDate;
	private String status;
	private int fees;
	private int discount;
	private int paid;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Set<Student> studentId;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Set<Class> classId;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(Date registerDate, String status, int fees, int discount, int paid) {
		super();
		this.registerDate = registerDate;
		this.status = status;
		this.fees = fees;
		this.discount = discount;
		this.paid = paid;
	}

}
