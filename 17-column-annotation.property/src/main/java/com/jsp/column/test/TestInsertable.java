package com.jsp.column.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.column.model.Person;

public class TestInsertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     
	     Person person = new Person();
	     person.setId(2);
	     person.setName("abc");
	     person.setContact(1234567890);
	     person.setGender(true);
	     
	     
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityTransaction.commit();
	}

}
