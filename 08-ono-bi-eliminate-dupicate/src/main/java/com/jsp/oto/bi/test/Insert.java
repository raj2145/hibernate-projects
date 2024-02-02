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
		

		Car car = new Car();
		car.setId(1);
		car.setCar_name("lamborgini");
		car.setChasis("df44");
		car.setCost(500000);
		
		Engine engine = new Engine();
		
		engine.setId(11);
		engine.setCc(500);
		engine.setNo_of_cylinder(5);
		
		
		car.setEngin(engine);
		engine.setCar(car);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityManager.persist(engine);
		entityTransaction.commit();
		
		
		
	}

}
