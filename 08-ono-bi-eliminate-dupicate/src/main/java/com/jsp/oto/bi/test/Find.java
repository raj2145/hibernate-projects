package com.jsp.oto.bi.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.bi.model.Car;
import com.jsp.oto.bi.model.Engine;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Car car = entityManager.find(Car.class, 1);
		
		if (car != null) {
			System.out.println("car id "+car.getId());
			System.out.println("car name"+car.getCar_name());
			System.out.println("chasis "+car.getChasis());
			System.out.println("cost "+car.getCost());
		
		}
		Engine engine = entityManager.find(Engine.class, 11);
		if (engine != null) {
			System.out.println("engine id :"+engine.getId());
			System.out.println("engine cc :"+engine.getCc());
			System.out.println("no fo cylinder :"+engine.getNo_of_cylinder());
		}
		
	}

}
