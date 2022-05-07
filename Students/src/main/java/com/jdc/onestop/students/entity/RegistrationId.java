package com.jdc.onestop.students.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
@Getter
public class RegistrationId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer student_id;
	private Integer class_id;

	public RegistrationId() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(class_id, student_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationId other = (RegistrationId) obj;
		return Objects.equals(class_id, other.class_id) && Objects.equals(student_id, other.student_id);
	}

	public RegistrationId(Integer student_id, Integer class_id) {
		super();
		this.student_id = student_id;
		this.class_id = class_id;
	}

}
