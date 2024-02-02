package com.jsp.mtm.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class Controller {

	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();
// add
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
	//update
	public static boolean Update(int id,String name) {
		Student student = entityManager.find(Student.class, name);
		if (student != null) {
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		}
		return false;
	}
	
	//find
	
	public static Student findStudent(int findId) {
		return entityManager.find(Student.class, findId);
	}
	
	//remove
	public static boolean removeStudent(int findId) {
		Student student = entityManager.find(Student.class, findId);
		if (student!= null) {
			List<Subject> subject = student.getSubject();
			if (subject !=null) {
				entityTransaction.begin();
				entityManager.remove(student);
				for (Subject subject2 : subject) {
					entityManager.remove(subject);
				}
			}
			
			
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
