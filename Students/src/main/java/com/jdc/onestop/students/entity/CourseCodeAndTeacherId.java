package com.jdc.onestop.students.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
@Getter
public class CourseCodeAndTeacherId implements Serializable {

	private static final long serialVersionUID = 1L;

	private String courseCode;
	private Integer teacherId;

	public CourseCodeAndTeacherId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseCodeAndTeacherId(String courseCode, Integer teacherId) {
		super();
		this.courseCode = courseCode;
		this.teacherId = teacherId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseCode, teacherId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseCodeAndTeacherId other = (CourseCodeAndTeacherId) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(teacherId, other.teacherId);
	}

}
