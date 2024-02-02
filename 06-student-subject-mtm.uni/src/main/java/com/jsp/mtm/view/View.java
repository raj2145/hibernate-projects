package com.jsp.mtm.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.mtm.controller.Controller;
import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static Student student = new Student();
	static Subject subject = new Subject();

	public static void main(String[] args) {

		do {
			System.out.println("enter respective option to perform the Operation");
			System.out.println("1.Insert data\n2.Update data\n3.Find data\n4.Remove data\n0.Exited");
			int userInput = myInput.nextInt();
			switch (userInput) {
			case 0:
				myInput.close();
				System.out.println("connection closed");

				break;
			case 1:
				System.out.println("Enter student id :");
				int s_id = myInput.nextInt();
				myInput.nextLine();
				student.setId(s_id);
				System.out.println("Enter Student Name :");
				String s_name = myInput.nextLine();
				student.setName(s_name);
				System.out.println("Enter Student Email :");
				String s_e = myInput.nextLine();
				student.setEmail(s_name);
				System.out.println("Enter Mobile Number :");
				long s_mn = myInput.nextLong();
				myInput.nextLine();
				student.setMobile_number(s_mn);

				ArrayList<Subject> subjects = new ArrayList();
				System.out.println("Enter Subject id :");
				int sub_id = myInput.nextInt();
				myInput.nextLine();
				subject.setId(sub_id);
				System.out.println("Enter Subject name :");
				String sub_name = myInput.nextLine();
				subject.setName(sub_name);
				System.out.println("Enter description :");
				String sub_descrip = myInput.nextLine();
				subject.setDescription(sub_descrip);
				System.out.println("Enter trainer name");
				String sub_trainer = myInput.nextLine();
				subject.setTrainer(sub_trainer);
				subjects.add(subject);
				student.setSubject(subjects);
				Controller.addStudentSubject(student, subject);

				break;
			case 2:
				System.out.println("enter id to update :");
				int u_id = myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter new Student name :");
				String u_name = myInput.nextLine();
				if (Controller.Update(u_id, u_name)) {
					System.out.println("Successfully updated");
				} else {
					System.out.println("reord not found");
				}

				break;
			case 3:
				System.out.println("Enter id to find :");
				int f_id = myInput.nextInt();
				myInput.nextLine();
				Student student2 = Controller.findStudent(f_id);
				if (student2!=null) {
					System.out.println(student.getId());
					System.out.println(student.getName());
					System.out.println(student.getEmail());
					System.out.println(student.getMobile_number());
					
					System.out.println("detail of subject opted by student");
					List<Subject> subject2 = student.getSubject();
					for (Subject subject : subject2) {
						System.out.println(subject.getId());
						System.out.println(subject.getName());
						System.out.println(subject.getDescription());
						System.out.println(subject.getTrainer());
						
				
				}
				}
				
				
				
				
				
				
				break;
			case 4:
				System.out.println("Enter id to remove: ");
				int r_id = myInput.nextInt();
				myInput.nextLine();

				if (Controller.removeStudent(r_id)) {
					System.out.println("succesfully deleted");
				} else {
					System.out.println("given id does not exist");
				}
				break;

			default:
				System.out.println("invalid input");
				break;
			}
		} while (true);

	}

}
