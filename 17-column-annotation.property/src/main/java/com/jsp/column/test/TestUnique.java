package com.jsp.column.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.column.model.Person;

public class TestUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     Person person = new Person();
	     person.setId(1);
	     person.setName("abc");
	     person.setContact(123456789);
	     
	     Person person2 = new Person();
	     person2.setId(2);
	     person2.setName("abc");
	     person2.setContact(123456789);
	     
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityManager.persist(person2);
	     entityTransaction.commit();
	}

}
