package com.jsp.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.model.Person;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     Person person = entityManager.find(Person.class, 1);
	     if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}
	}

}
