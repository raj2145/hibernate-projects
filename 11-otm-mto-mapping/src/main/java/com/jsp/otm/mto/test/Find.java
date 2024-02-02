package com.jsp.otm.mto.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Account account = entityManager.find(Account.class, 22);
		if (account != null) {
			System.out.println(account.getA_id());
			System.out.println(account.getA_Name());
			System.out.println(account.getA_Balance());
			
			Bank bank2 = account.getBank();
		Bank bank = entityManager.find(Bank.class, 1);
		System.out.println(bank.getB_id());
		System.out.println(bank.getB_Name());
		System.out.println(bank.getB_Headquatar());
			
		}
	}

}
