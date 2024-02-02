package com.jsp.Mock.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Mock.model.Passport;
import com.jsp.Mock.model.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	     
	     Person person = new Person();
	     person.setId(1);
	     person.setName("ashish");
	     person.setAddress("mumbai");
	     
	     Passport passport = new Passport();
	     passport.setId(11);
	     passport.setPassportnumber(25598878);
	     
	     person.setPassport(passport);
	     
	     entityTransaction.begin();
	     entityManager.persist(person);
	     entityManager.persist(passport);
	     entityTransaction.commit();
	}

}
