package com.jsp.ems.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
	private String name;
	private String Position;
	private double Salary;
	@CreationTimestamp
	private LocalDateTime JoiningDateTime;
	@ManyToOne
	private Department department;
	@ManyToMany
	private List<Project> project;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = (List<Project>) project;
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
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public LocalDateTime getJoiningDateTime() {
		return JoiningDateTime;
	}
	public void setJoiningDateTime(LocalDateTime joiningDateTime) {
		JoiningDateTime = joiningDateTime;
	}
	public Employee() {
		
	}
	
	
}
