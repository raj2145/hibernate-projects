package com.jsp.l1.cache.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	}

}
