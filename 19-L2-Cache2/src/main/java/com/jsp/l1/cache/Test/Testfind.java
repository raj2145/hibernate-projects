package com.jsp.l1.cache.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.l1.cache.model.Person;

public class Testfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     
	     Person person = entityManager.find(Person.class, 1);
	     
	     System.out.println(person.getId());
	     System.out.println(person.getName());
	     
	     Person person2 = entityManager.find(Person.class, 1);
	     System.out.println(person2.getId());
	     System.out.println(person2.getName());
	     
	}

}
