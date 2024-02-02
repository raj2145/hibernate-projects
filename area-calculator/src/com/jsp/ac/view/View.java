package com.jsp.ac.view;

import java.util.Scanner;

import com.jsp.ac.controller.Circle;
import com.jsp.ac.controller.Rectangle;
import com.jsp.ac.controller.Trangle;

public class View {

	static Scanner myInput = new Scanner(System.in);
//	static Area area = new Area();
	static Circle circle = new Circle();
	static Rectangle rectangle = new Rectangle();

	static Trangle trangle = new Trangle();
			
	public static void main(String[] args) {

		do {
			System.out.println("1.area of circle\n2.area of rectangle\n3. area of trangle \n4.Exit");
			int userInput = myInput.nextInt();

			switch (userInput) {
			case 1:
				System.out.println("Enter radius of circle");
				double pie=3.14;
				double radiusofcircle =myInput.nextDouble();
				myInput.nextLine();
				System.out.println(circle.area(pie, radiusofcircle));

				break;
			case 2:
				System.out.println("Enter length of rectangle");
				double lengthofrectangle=myInput.nextDouble();
				myInput.nextLine();
				System.out.println("ener breath of rectangle ");
				double breathofrecatngle =myInput.nextDouble();
				myInput.nextLine();
			System.out.println("area of rectangle :"+rectangle.area(lengthofrectangle, breathofrecatngle));
				
						
				

				break;
			case 3:
				System.out.println("Enter height of trangle :");
				double heightOftrangle = myInput.nextDouble();
				myInput.nextLine();
				System.out.println("Enter base of trangle ");
				double baseoftrangle=myInput.nextDouble();
				myInput.nextLine();
				System.out.println("area of rectangle " + trangle.area(heightOftrangle, baseoftrangle));
				
				

				break;
			case 4:

				break;

			default:
				break;
			}
		} while (true);
	}

}
