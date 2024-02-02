package com.jsp.otm.mto.test;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bank bank = new Bank();
		bank.setB_id(1);
		bank.setB_Name("Sbi");
		bank.setB_Headquatar("mumbai");

		Account account = new Account();
		account.setA_id(11);
		account.setA_Name("chursiya");
		account.setA_Balance(150);
	account.setBank(bank);
		Account account2 = new Account();
		account2.setA_id(22);
		account2.setA_Name("ashish");
		account2.setA_Balance(200);
	
		account2.setBank(bank);
		ArrayList<Account> accounts =new ArrayList<Account> ();
		accounts.add(account);
		accounts.add(account2);
	
		bank.setAccount(accounts);
		
		entityTransaction.begin();

		entityManager.persist(bank);
		entityManager.persist(account);
		entityManager.persist(account2);
		entityTransaction.commit();

	}

}
