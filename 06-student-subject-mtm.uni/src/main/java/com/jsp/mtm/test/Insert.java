package com.jsp.mtm.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("psSql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Student student = new Student();
//		student.setId(1);
//		student.setName("shygt");
//		student.setEmail("abv55@gmail.com");
//		student.setMobile_number(984848484);
//		
//		Subject subject = new Subject();
//		subject.setId(11);
//		subject.setName("sql");
//		subject.setDescription("easy");
//		subject.setTrainer("vk");
//		
//		Subject subject2 = new Subject();
//		subject2.setId(22);
//		subject2.setName("j2ee");
//		subject2.setDescription("medium");
//		subject2.setTrainer("sk");
//		
//		ArrayList<Subject> subjects=new ArrayList();
//		subjects.add(subject2);
//		subjects.add(subject);
//		
//		student.setSubject(subjects);
//		
//		entityTransaction.begin();
//		entityManager.persist(student);
//		entityManager.persist(subject);
//		entityManager.persist(subject2);
//		entityTransaction.commit();
		
		//considering we have object already existing in subject table
		//now if i want  to add new student and assign available subject
		
//		
//		Student student2 = new Student();
//		student2.setId(2);
//		student2.setName("sdgv");
//		student2.setEmail("dsf@gmail");
//		student2.setMobile_number(465466844);
//		
//		Subject subject = entityManager.find(Subject.class, 11);
//		
//		ArrayList<Subject> subjects1 =new ArrayList<Subject>();
//		subjects1.add(subject);
//		student2.setSubject(subjects1);
//		entityTransaction.begin();
//		entityManager.persist(student2);
//		entityTransaction.commit();
		
		String jpql ="SELECT s FROM Student s";
		TypedQuery<Student> query = entityManager.createQuery(jpql,Student.class);
		List<Student> listStudent = query.getResultList();
		for (Student student : listStudent) {
			System.out.println("id "+student.getId());
		}
	}

}
