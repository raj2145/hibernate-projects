package com.jsp.oto.bi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Engine {
	@Id
	private int id;
	private double cc;
	private int no_of_cylinder;
	@OneToOne(mappedBy = "engin")
	private Car car;
	public int getId() {
		return id;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
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
	public void setNo_of_cylinder(int no_of_cylinder) {
		this.no_of_cylinder = no_of_cylinder;
	}
	public Engine() {
	
	}
	
}
