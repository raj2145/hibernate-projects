package com.jsp.column.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.column.model.Person;

public class TestUpdatable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     Person person = new Person();
//	     person.setId(1);
//	     person.setName("abc");
//	     person.setContact(123456789);
//	     person.setGender(true);
//	     
//	     entityTransaction.begin();
//	     entityManager.persist(person);
//	     entityTransaction.commit();
//	     
	     
	     Person person2 = entityManager.find(Person.class, 1);
	     
	
	    	 person2.setGender(false);
			entityTransaction.begin();
			entityManager.merge(person2);
			entityTransaction.commit();
		
	     
	}

}
