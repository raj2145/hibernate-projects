package com.jsp.ems.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.ems.model.Department;
import com.jsp.ems.model.Employee;
import com.jsp.ems.model.Project;

public class Controller {
	static  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pgSql");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static EntityTransaction entityTransaction = entityManager.getTransaction();
     
     
     public  boolean addEmployee(Employee empolyee) {
    	 
    	if (empolyee != null) {
    		 entityTransaction.begin();
        	 entityManager.persist(empolyee);
        	 entityTransaction.commit();
        	 return true;
		}
    	 return false;
    	 
     }
     
     public  Employee FindEmployee(int findId) {
    	 return entityManager.find(Employee.class, findId);
     }
     
     public boolean updateEmployeeInfo(int id,double updatedSal ,String UpdatedDesignation) {
    	 Employee employee = entityManager.find(Employee.class, id);
    	 if (employee != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			return true;
		}
    	 return false;
     }
     public boolean RemoveEmployee(int removeId) {
    	 Employee find = entityManager.find(Employee.class, removeId);
    	 if (find != null) {
			entityTransaction.begin();
			entityManager.remove(find);
			entityTransaction.commit();
			return true;
		}
    	 
    	 return false;
    	 
     }
     public boolean addDepartment( Department department) {
    
    	 if (department != null) {
			entityTransaction.begin();
			entityManager.persist(department);
			entityTransaction.commit();
			return true;
		}
    	 return false;
     }
     public Department viewDepartment(int findId) {
    	return  entityManager.find(Department.class, findId );
    	 
     }
     public boolean  addProject(Project project) {
    	 if (project != null) {
			entityTransaction.begin();
			entityManager.persist(project);
			entityTransaction.commit();
			return true;
		}
    	 return false;
     }
     public Project viewProjects(int findId) {
    	return  entityManager.find(Project.class, findId);
    	 
     }
    public boolean assignDepatmentToEmployee(int empId , int deptId) {
    	Employee employee = entityManager.find(Employee.class, empId);
    	Department department = entityManager.find(Department.class,deptId );
    	if (employee != null && department != null) {
			entityTransaction.begin();
			employee.setDepartment(department);
//			department.setEmployee(employee);
			entityTransaction.commit();
			return true;
		}
    	return false;
    }
    public boolean assignEmployeeToProject(int empid, int projId) {
    	Employee employee = entityManager.find(Employee.class, empid);
    	Project project = entityManager.find(Project.class, projId);
    	if (employee != null && project != null) {
			entityTransaction.begin();
			employee.setProject(project);
		
			entityTransaction.commit();
		}
    	
    	return false;
    }
}
