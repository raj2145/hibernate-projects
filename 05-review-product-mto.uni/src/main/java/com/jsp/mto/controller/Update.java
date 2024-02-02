package com.jsp.mto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Review;

public class Update {

	public  boolean upadteRecord(int findId,String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Review review = entityManager.find(Review.class, findId);
		

		if (review != null) {
			entityTransaction.begin();
		     entityManager.merge(review);
			
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	

}
