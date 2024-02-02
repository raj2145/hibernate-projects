package com.jsp.mto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Review;

public class Remove {

	public static boolean deleteRecord(int removeId) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		
		Review review = entityManager.find(Review.class, removeId);
		if (review != null) {
			entityTransaction.begin();
			entityManager.remove(review);
			entityTransaction.commit();
			return true;
		}else {
			System.out.println("id does not exist");
		}
		return false;
	}

}
