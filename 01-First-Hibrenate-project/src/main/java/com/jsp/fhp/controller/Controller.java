package com.jsp.fhp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("pgAdmin");
EntityManager entityManager = EntityManagerFactory.createEntityManager();
EntityTransaction entityTransaction = entityManager.getTransaction();
System.out.println(EntityManagerFactory);

	}

}
