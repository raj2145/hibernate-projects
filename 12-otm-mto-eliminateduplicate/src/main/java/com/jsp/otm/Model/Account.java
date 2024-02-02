package com.jsp.otm.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	private int a_id;
	private String a_Name;
	private double a_Balance;
	@ManyToOne
	@JoinColumn(name = "bank")
	private Bank bank;
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_Name() {
		return a_Name;
	}

	public void setA_Name(String a_Name) {
		this.a_Name = a_Name;
	}

	public double getA_Balance() {
		return a_Balance;
	}

	public void setA_Balance(double a_Balance) {
		this.a_Balance = a_Balance;
	}

	public Account() {
	}	
}
