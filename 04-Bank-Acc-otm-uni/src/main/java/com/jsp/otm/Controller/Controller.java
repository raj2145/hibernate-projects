package com.jsp.otm.Controller;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;

public class Controller {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pg_admin");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	
	public boolean addBankAndAccounts(Bank bank, List<Account> account) {
		if (bank!=null && account!=null) {
			transaction.begin();
			entityManager.persist(bank);
			for (Account accounts : account) {
				entityManager.persist(accounts);
			}
			transaction.commit();
			return true;
		} return false;
		
	}
	
	public Bank find_bank_acc(int in) {
		return entityManager.find(Bank.class, in);
	}
	
	public boolean upadteBankNmae(int bank_id,String updatedNmae) {
		Bank bank = entityManager.find( Bank.class ,bank_id );
		if (bank!=null) {
			bank.setB_Name(updatedNmae);
			transaction.begin();
			entityManager.merge(bank);
			transaction.commit();
			return true;
		}
		return false; 
	}
	public boolean removeBank(int b_id) {
	    Bank bank = entityManager.find(Bank.class, b_id);
	    if (bank != null) {
	        List<Account> accounts = bank.getAccount(); 
	        if (accounts != null) {
	          
	            transaction.begin();
	            entityManager.remove(bank);
	            for (Account account : accounts) {
	                entityManager.remove(account); 
	            }
	            transaction.commit();
	            return true;
	        }
	    }
	    return false;
	}
	
	public boolean deleteParticularAccount(int bankIdToFind,int accIdToDelete) {
		
		Bank bank = entityManager.find(Bank.class, bankIdToFind);
		if (bank != null) {
			List<Account> accounts = bank.getAccount();
			if (accounts != null) {
				
				return false;
				
			}else {
				Account accountToRemove =null;
				for (Account account : accounts) {
					if (account.getA_id()==accIdToDelete ) {
						accountToRemove = account;
						break;
					}
				}
				if (accountToRemove != null) {
				transaction.begin();
				accounts.remove(accountToRemove);
				transaction.commit();
				
				transaction.begin();
				entityManager.remove(accounts);
				transaction.commit();
				} else {
// account with given id does not exist
					return false;
				}
			}
		}
		//Bank with give id does not exixt
		
		return false;
		
	}
//	public boolean remove_bank(int b_id) {
//		 Bank bank = entityManager.find(Bank.class, b_id);
//		 List<Account> account = bank.getAccount();
//		if (bank!=null && account!=null) {
//			transaction.begin();
//			entityManager.remove(bank);
//			for (Account account2 : account) {
//				entityManager.remove(account);
//			}
//			transaction.commit();
//			return true;
//		}
//		return false;
//	}
//	
}
