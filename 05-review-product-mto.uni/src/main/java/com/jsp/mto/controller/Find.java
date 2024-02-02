package com.jsp.mto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class Find {
public  Review find(int id ) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entitytransaction = entityManager.getTransaction();

	
	return entityManager.find(Review.class, id);
	
	
}
}
