package com.jsp.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.model.Person;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
     
	     Person person = new Person();
	person.setNaam("ashish");
	     
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityTransaction.commit();
	}

}
