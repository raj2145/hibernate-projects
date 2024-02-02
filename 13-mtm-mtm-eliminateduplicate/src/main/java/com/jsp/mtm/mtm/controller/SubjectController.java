package com.jsp.mtm.mtm.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SubjectController {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
}
