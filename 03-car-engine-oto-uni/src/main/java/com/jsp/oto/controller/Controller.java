package com.jsp.oto.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.oto.model.Car;
import com.jsp.oto.model.Engine;



public class Controller {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
	static  EntityManager entityManager = entityManagerFactory.createEntityManager();
	static  EntityTransaction entityTransaction = entityManager.getTransaction();

	public static boolean addCar(Car car,Engine engine) {
		if (car!= null && engine != null) {
			entityTransaction.begin();
			entityManager.persist(car);
			entityManager.persist(engine);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
	public Car findCar(int car_id) {
		return entityManager.find(Car.class, car_id);

	}

	public boolean updateCar(int car_id, double update_cost) {

		Car car = findCar(car_id);
		if (car != null) {
			car.setCost(update_cost);
			entityTransaction.begin();
			entityManager.merge(car);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public boolean removeCar(int car_id) {
		Car car = findCar(car_id);
		if (car != null) {

			entityTransaction.begin();
			entityManager.remove(car);
			entityManager.remove(car.getEngin());
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
}
