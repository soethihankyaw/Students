package com.jdc.onestop.students.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Payments {

	@Id
	@Column(name = "paid_date",nullable = false)
	private int paidDate;
	private int toPaid;
	private int paidAmount;
	@ManyToOne
	private Set<Registration> registrations;

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(int paidDate,int toPaid, int paidAmount) {
		super();
		this.paidDate = paidDate;
		this.toPaid = toPaid;
		this.paidAmount = paidAmount;
	}

}
