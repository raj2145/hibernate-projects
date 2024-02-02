package com.jsp.l1.cache.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.l1.cache.model.Person;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	      
	     Person name = new Person();
	     
	     name.setName("abc");
	     
	     entityTransaction.begin();
	     entityManager.persist(name);
	     entityTransaction.commit();
	     
//	     Person person = entityManager.find(Person.class, 1);
//	     System.out.println(person.getId());
//	     System.out.println(person.getName());
//	     Person person2 = entityManager.find(Person.class, 1);
//	     System.out.println(person2.getId());
//	     System.out.println(person2.getName());
//	     person2.setName("pqr");
//	     entityTransaction.begin();
//	     entityManager.merge(person2);
//	     entityTransaction.commit();
//	     
//	     Person person3 = entityManager.find(Person.class, 1);
//	     System.out.println(person3.getId());
//	     System.out.println(person3.getName());
	     
	}

}
