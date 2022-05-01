package com.jdc.onestop.students.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ClassDays {
	
	@Id
	@Column(name = "days_of_week", nullable = false)
	private String daysOfWeek;
	@ManyToOne
	private List<Class> classes;
	
	public ClassDays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassDays(String daysOfWeek) {
		super();
		this.daysOfWeek = daysOfWeek;
	}
	
	
	
	
}
