package com.jsp.ems.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ems.model.Employee;

public class Test {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
	     
	    
	}

}
