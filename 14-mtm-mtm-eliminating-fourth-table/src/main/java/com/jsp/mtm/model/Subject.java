package com.jsp.mtm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
private int id;
	private String name;
	private String description;
	private String trainer;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="my_Subject_id"),
	inverseJoinColumns = @JoinColumn(name ="my_student_id"))
	private List<Student> student;
	public Subject() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	
	
}
