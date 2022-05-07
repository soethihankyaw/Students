package com.jdc.onestop.students.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
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
public class Class implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classId;
	@Embedded
	private CourseCodeAndTeacherId courseCodeAndTeacherId;
	private String classType;
	private String startDate;
	private String months;
	private Time timeFrom;
	private Time timeTo;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Course course;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Employee teacher;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(String classType, String startDate, String months, Time timeFrom, Time timeTo) {
		super();
		this.classType = classType;
		this.startDate = startDate;
		this.months = months;
		this.timeFrom = timeFrom;
		this.timeTo = timeTo;
	}

}
