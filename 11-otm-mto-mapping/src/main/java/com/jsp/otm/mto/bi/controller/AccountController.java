package com.jsp.otm.mto.bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountController {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
}
