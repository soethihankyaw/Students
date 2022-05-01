package com.jdc.onestop.students.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Course {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(strategy = "uuid2", name = "uuid")
	@Column(name = "code")
	private String code;
	private String name;
	private int hours;
	private String level;
	private int onlineFees;
	private int offlineFees;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String name, int hours, String level, int onlineFees, int offlineFees) {
		super();
		this.name = name;
		this.hours = hours;
		this.level = level;
		this.onlineFees = onlineFees;
		this.offlineFees = offlineFees;
	}

}
