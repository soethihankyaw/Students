package com.jdc.onestop.students.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;	
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Registration implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId	
	private RegistrationId registrationId;
	private Date registerDate;
	private String status;
	private int fees;
	private int discount;
	private int paid;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Student student;
	@OneToOne
	private Class classs;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(RegistrationId registrationId, Date registerDate, String status, int fees, int discount,
			int paid, Student student, Class classs) {
		super();
		this.registrationId = registrationId;
		this.registerDate = registerDate;
		this.status = status;
		this.fees = fees;
		this.discount = discount;
		this.paid = paid;
		this.student = student;
		this.classs = classs;
	}

	

}
