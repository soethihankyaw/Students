package com.jdc.onestop.students.entity;

import java.util.List;

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
public class ClassDays {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(strategy = "uuid2", name = "uuid")
	@Column(name = "days_of_week")
	private String daysOfWeek;
	@ManyToOne
	private List<Class> classes;
	
	
}
