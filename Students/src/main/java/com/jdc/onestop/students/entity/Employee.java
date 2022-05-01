package com.jdc.onestop.students.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Set<String> role;
	private String phone;
	private String email;
	
	@ManyToOne
	private Account account;
	@OneToMany(mappedBy = "teacherId")
	private List<Class> classes;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, Set<String> role, String phone, String email) {
		super();
		this.name = name;
		this.role = role;
		this.phone = phone;
		this.email = email;
	}

}
