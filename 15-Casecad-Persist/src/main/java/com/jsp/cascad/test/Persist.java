package com.jsp.cascad.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.model.Car;
import com.jsp.oto.model.Engine;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	     EntityManager entityManager = entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction = entityManager.getTransaction();
//	     
	     Car car = new Car();
	     car.setId(1);
	     car.setCar_name("bmw");
	     car.setChasis("255kd");
	     car.setCost(10000);
	     
	     Engine engine = new Engine();
	     engine.setId(01);
	     engine.setCc(500);
	     engine.setNo_of_cylinder(4);
	     
	     car.setEngin(engine);
	     
	     entityTransaction.begin();
	     entityManager.persist(car);
	     entityTransaction.commit();
	}

}
