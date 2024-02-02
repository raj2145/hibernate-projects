package com.jsp.ems.view;

import java.util.Scanner;

import com.jsp.ems.controller.Controller;
import com.jsp.ems.model.Department;
import com.jsp.ems.model.Employee;
import com.jsp.ems.model.Project;

public class View {

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static Department department = new Department();
	static Employee employee = new Employee();
	static Project project = new Project();

	public static void main(String[] args) {

		do {
			System.out.println("enter a respective option :");
			System.out.println(
					"1.add employee\n2.View employee info\n3.Update employeee info\n4.Remove Employee\n5.view department\n6.Add depatment\n7.Add project\n8.View project\n9.Exit\n10.assign department");
			int userInput = myInput.nextInt();
			myInput.nextLine();
			switch (userInput) {
			case 1:
				System.out.println("Enter name of Employee :");
				String E_name = myInput.nextLine();
				employee.setName(E_name);
				System.out.println("Enter designation :");
				String E_d = myInput.nextLine();
				employee.setPosition(E_d);
				System.out.println("enter Salary :");
				double E_sal = myInput.nextDouble();
				employee.setSalary(E_sal);
				
				controller.addEmployee(employee);
				

				break;
			case 2:
				System.out.println(" Enter id Employee details :");
				int F_id = myInput.nextInt();
				myInput.nextLine();
				Employee findEmployee = controller.FindEmployee(F_id);
				if (findEmployee != null) {
					System.out.println("-------------------------------------------------");
					System.out.println("Employee id :"+findEmployee.getId());
					System.out.println("Employee name :"+findEmployee.getName());
					System.out.println("Employee designation :"+findEmployee.getPosition());
					System.out.println("Employee Salary :"+findEmployee.getSalary());
					System.out.println("Employee Date of joining :"+findEmployee.getJoiningDateTime());
					System.out.println("-----------------------------------------------------------------");
				}else {
					System.out.println("--------------enter valid id---------------");
				}
				break;
			case 3:
                System.out.println("Enter id update employee info");
                int U_id=myInput.nextInt();
                Employee employee2 = controller.FindEmployee(U_id);
               if (employee2 != null) {
            	   System.out.println("Enter Updated salary :");
                   double U_sal=myInput.nextDouble();
                   myInput.nextLine();
                   employee2.setSalary(U_sal);
                   
                   System.out.println("Enter Updated Designation :");
                   String Update_d=myInput.nextLine();
                   employee2.setPosition(Update_d);
                   controller.updateEmployeeInfo(U_id, U_sal, Update_d);
			}else {
				System.out.println("invalid id");
			}
				break;
			case 4:
				System.out.println("Enter Id to Remove Employee :");
				int R_id=myInput.nextInt();
				myInput.nextLine();
				
				if (controller.RemoveEmployee(R_id) ) {
					System.out.println("Employee record deleted");
				}else {
					System.out.println("employee not found");
				}
				
				
				break;
			case 5:
				System.out.println("Enter Id To Find Department :");
				int findDepartment = myInput.nextInt();
				myInput.nextLine();
				Department viewDepartment = controller.viewDepartment(findDepartment);
				
				if (viewDepartment != null) {
					System.out.println("Department id :" + viewDepartment.getId());
					System.out.println("Department name :"+ viewDepartment.getName());
				}else {
					System.out.println("Depatment not found ");
				}

				break;
			case 6:
                 System.out.println("Enter department name :");
                 String n_d=myInput.nextLine();
                 department.setName(n_d);
                 employee.setDepartment(department);
                 controller.addDepartment(department);
				break;
			case 7:
				System.out.println("Enter project name :");
				String projectName = myInput.nextLine();
				project.setName(projectName);
				System.out.println("Enter project description :");
				String projectDescrip =myInput.nextLine();
				project.setDescription(projectDescrip);
				
				controller.addProject(project);
				

				break;
			case 8:
				System.out.println("Enter project id :");
				int projectId=myInput.nextInt();
				myInput.nextLine();
			Project viewProject = controller.viewProjects(projectId);
				if (viewProject != null) {
					System.out.println("Project id :" + viewProject.getId());
					System.out.println("Project name " + viewProject.getName());
					System.out.println("project description :" +viewProject.getDescription());
				}

				break;
			case 9:
				myInput.close();
				System.out.println("------------Exited--------------------");
				
			case 10:
				System.out.println("Enter employee id :");
				int empId=myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Depatment id :");
				int deptId=myInput.nextInt();
				myInput.nextLine();
				
				boolean assignDepatmentToEmployee = controller.assignDepatmentToEmployee(empId, deptId);
				if (assignDepatmentToEmployee) {
					System.out.println("succesfully assigned");
				}else {
					System.out.println("not assigned");
				}
				break;

			default:
				System.out.println("----------Invalid input----------------");
				break;
			}
		} while (true);
	}

}
