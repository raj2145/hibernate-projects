package com.jsp.Mock.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {
@Id
private int id;
private long passportnumber;
public Passport() {

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getPassportnumber() {
	return passportnumber;
}
public void setPassportnumber(long passportnumber) {
	this.passportnumber = passportnumber;
}


}
