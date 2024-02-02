package com.jsp.column.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.type.LocalDateType;

@Entity
public class Person {
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(unique = true)
	private long Contact;
	@Column(updatable = false)
	private boolean gender;
	@Column(insertable = false)
	@CreationTimestamp
	private LocalDateTime dob;
	@Column(nullable = false,unique = true)
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
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
	public Person() {
		super();
	}
	

}


//@Column(nullable = false) default value of nullable is true, that means we can add nullb value.When we write null able =false we cannot adda null value to that field
//@Column(unique = true) by defalut is it false, that means we can insert duplicate value.\
//@Column(updatable = false) by defalut it is true, that means we can updadate.when we wrir update = false  we cannot update the value
//note To provide a column multiple feature we can go on adding multiple feature seprated by comma.
//Hibernate first cache
//cschesing in general is a temperory memory Some info will be store in that temperory which will be accse frequently
//by storing the info in temp memory the performance of application can  be increse for the same reason we have cachesing machenism in hibernate 
//ideal use of cache is to reduce the num of databse queries,hence reducing throughput time of appliction 
//hibernate come with two diff type cache
//1st level,2nd level cache.
//note in hibernate firstlevel cache is enable by default 


