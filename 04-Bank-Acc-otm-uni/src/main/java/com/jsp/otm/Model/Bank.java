package com.jsp.otm.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int b_id;
	private String b_Name;
	private String b_Headquatar;
	
	@OneToMany
	private List<Account> account;
	
	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_Name() {
		return b_Name;
	}

	public void setB_Name(String b_Name) {
		this.b_Name = b_Name;
	}

	public String getB_Headquatar() {
		return b_Headquatar;
	}

	public void setB_Headquatar(String b_Headquatar) {
		this.b_Headquatar = b_Headquatar;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public Bank() {
	}
	
	
}
