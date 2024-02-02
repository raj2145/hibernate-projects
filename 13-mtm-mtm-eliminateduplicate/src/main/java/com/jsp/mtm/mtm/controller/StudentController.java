package com.jsp.mtm.mtm.controller;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class StudentController {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public static boolean addStudentSubject(Student student,Subject subject) {
		if (student != null && subject != null) {
			entityTransaction.begin();
			entityManager.persist(student);
			
				entityManager.persist(subject);
			
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
	public void listOfsubjectOptedByStudent(int std_id, int sub_id ) {
		Student student = entityManager.find(Student.class, std_id);
		
		if (student != null) {
			entityManager.find(Subject.class, sub_id);
		}
		
	}
	
	
}
