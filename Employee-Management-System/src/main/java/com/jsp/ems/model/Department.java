package com.jsp.ems.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;
private String name;
@OneToMany
private List<Employee> employee;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Department() {

}


}
