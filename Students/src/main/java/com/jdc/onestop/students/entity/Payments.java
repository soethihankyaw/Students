package com.jdc.onestop.students.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Payments implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "paid_date",nullable = false)
	private int paidDate;
	private int toPaid;
	private int paidAmount;
	@OneToOne
	private Registration registration;

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(int paidDate, int toPaid, int paidAmount, Registration registration) {
		super();
		this.paidDate = paidDate;
		this.toPaid = toPaid;
		this.paidAmount = paidAmount;
		this.registration = registration;
	}

	

	

	

}
