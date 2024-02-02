package com.jsp.oto.bi.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.bi.model.Car;
import com.jsp.oto.bi.model.Engine;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		
	}

}
