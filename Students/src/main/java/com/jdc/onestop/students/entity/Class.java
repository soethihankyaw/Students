package com.jdc.onestop.students.entity;

import java.sql.Time;
import java.util.List;
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
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String classtype;
	private String startDate;
	private String months;
	private Time timeFrom;
	private Time timeTo;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Set<Course> courseCode;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private List<Employee> teacherId;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(String classtype, String startDate, String months, Time timeFrom, Time timeTo) {
		super();
		this.classtype = classtype;
		this.startDate = startDate;
		this.months = months;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
	}

}
