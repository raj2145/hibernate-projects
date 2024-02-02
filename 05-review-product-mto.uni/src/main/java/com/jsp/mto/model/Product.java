package com.jsp.mto.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private int id;

private String name;
private int Price;
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
public int getPrice() {
	return Price;
}
public void setPrice(int i) {
	Price = i;
}
public Product() {
	
}
}
