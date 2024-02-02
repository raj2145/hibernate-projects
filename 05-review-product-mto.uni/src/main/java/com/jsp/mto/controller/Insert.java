package com.jsp.mto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class Insert {

	public static void addRecord(Review review,Product product) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = entityManager.getTransaction();


		 entitytransaction.begin();
		 entityManager.persist(product);
		 entityManager.persist(review);
		
		 entitytransaction.commit();

	}	
	
	
}
