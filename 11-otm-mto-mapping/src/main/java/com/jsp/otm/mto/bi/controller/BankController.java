package com.jsp.otm.mto.bi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;

public class BankController {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public boolean addBank( Bank bank, List<Account> account) {
		if (bank != null &&account != null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			for (Account account2 : account) {
				entityManager.persist(account);
			}
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	public Bank find_bank_acc(int in) {
		return entityManager.find(Bank.class, in);
	}
	
	public boolean upadteBankNmae(int bank_id,String updatedNmae) {
		Bank bank = entityManager.find( Bank.class ,bank_id );
		if (bank!=null) {
			bank.setB_Name(updatedNmae);
			entityTransaction.begin();
			entityManager.merge(bank);
		entityTransaction.commit();
			return true;
		}
		return false; 
	}
	public boolean removeBank(int b_id) {
	    Bank bank = entityManager.find(Bank.class, b_id);
	    if (bank != null) {
	        List<Account> accounts = bank.getAccount(); 
	        if (accounts != null) {
	          
	            entityTransaction.begin();
	            entityManager.remove(bank);
	            for (Account account : accounts) {
	                entityManager.remove(account); 
	            }
	            entityTransaction.commit();
	            return true;
	        }
	    }
	    return false;
	}
}
