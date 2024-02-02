package com.jsp.entity.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.LocalDateTimeType;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "name")
private String naam;
@CreationTimestamp
private LocalDateTime creationDateTime;
@UpdateTimestamp
private LocalDateTime upadtedTimeStamp;

public LocalDateTime getUpadtedTimeStamp() {
	return upadtedTimeStamp;
}
public void setUpadtedTimeStamp(LocalDateTime upadtedTimeStamp) {
	this.upadtedTimeStamp = upadtedTimeStamp;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNaam() {
	return naam;
}
public void setNaam(String naam) {
	this.naam = naam;
}
public LocalDateTime getCreationDateTime() {
	return creationDateTime;
}
public void setCreationDateTime(LocalDateTime creationDateTime) {
	this.creationDateTime = creationDateTime;
}
public Person() {
	
}



	
	}
//desired table name if we dont want entity class name as table name we can make use of @table annotation along with name attribute by which we can specify diff tab,e name apart from entity class name 
// note : all alfabate needs to in lower case
//@generated value (strategy = GenerationType.__________)
//if we want primary key to be generated automatically we can make use of this annotation along with suitable attribute details
//@Column @Column(name = "desired column name") to provide specific column name apart from identifier in entity class,we can make use of @column along with attribute name 
//@creationDateTime : it will automatically insert current date and time from machine local date and time

//generation type
//whenever we creating table we need primary key column. this primary key column need to be unique and not null, genearted value will provide us the solution by creating unique nnd not null primary key automatically
//Column annotation property 

