package com.jsp.mtm.mtm.view;

import java.util.ArrayList;
import java.util.Scanner;


import com.jsp.mtm.model.Student;
import com.jsp.mtm.model.Subject;
import com.jsp.mtm.mtm.controller.StudentController;
import com.jsp.mtm.mtm.controller.SubjectController;

public class View {
static Scanner myInput = new Scanner(System.in);
static StudentController studentController = new StudentController();
static SubjectController subjectController = new SubjectController();
static Student student = new Student();
static Subject subject = new Subject();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				do {
					
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
					ArrayList<Student> students = new ArrayList();
                    students.add(student);
               
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
					subject.setStudent(students);
				} while (myInput.nextBoolean());
				StudentController.addStudentSubject(student, subject);
break;

			case 2:
				System.out.println("Enter student id :");
				int id = myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter Subject id : ");
				int sub_id=myInput.nextInt();
				myInput.nextLine();
				
			System.out.println(subject.getName());
				
				break;
case 3:
				
				break;
case 4:
	
	break;


			default:
				break;
			}
		} while (true);

	}

}
