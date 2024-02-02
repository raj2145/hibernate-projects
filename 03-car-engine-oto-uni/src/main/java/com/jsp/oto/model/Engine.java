package com.jsp.oto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Engine {
@Id
private int id;
private double cc;
private int no_of_cylinder;

@OneToOne
private Car car;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getCc() {
	return cc;
}
public void setCc(double cc) {
	this.cc = cc;
}
public int getNo_of_cylinder() {
	return no_of_cylinder;
}
public void setNo_of_cylinder(int i) {
	this.no_of_cylinder = i;
}
public Engine() {

}

}
