package com.Patient.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="visitedDoctor")
	private String visitedDoctor;
	@Column(name="dateOfVisited")
	private String dateOfVisited;
	public Patient() {
		super();
	}
	public Patient(long id, String name, String visitedDoctor, String dateOfVisited) {
		super();
		this.id = id;
		this.name = name;
		this.visitedDoctor = visitedDoctor;
		this.dateOfVisited = dateOfVisited;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getDateOfVisited() {
		return dateOfVisited;
	}
	public void setDateOfVisited(String dateOfVisited) {
		this.dateOfVisited = dateOfVisited;
	}

	
}
