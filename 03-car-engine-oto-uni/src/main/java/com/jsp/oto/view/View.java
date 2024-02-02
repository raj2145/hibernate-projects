package com.jsp.oto.view;

import java.util.Scanner;

import com.jsp.oto.controller.Controller;
import com.jsp.oto.model.Car;
import com.jsp.oto.model.Engine;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static Car car = new Car();
	static Engine engine = new Engine();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 do {
			System.out.println("Select Operation to perform");
			System.out.println("1.Add Car\n 2.Remove Car\n 3.Update Car Detail\n4.FindCar\n0.Exit");
			System.out.println("Enter Digit respective to desired option : ");
			int userInput = myInput.nextInt();
			myInput.nextLine();
		
			switch (userInput) {
			case 0:
				myInput.close();
				System.out.println("-------Exited--------");
				System.out.println(0);
				break;
				
				
 //Add Car
			case 1:
				System.out.println("How many car you want to add ?\n1. Single car\n2.multipcar");
				int carCount = myInput.nextInt();
				myInput.nextLine();
				
		 if (carCount == 1) {
			 System.out.println("Enter Car id: ");
				int i_c_id = myInput.nextInt();
				myInput.nextLine();
				car.setId(i_c_id);
				System.out.println("Enter Car Name: ");
				String i_c_name = myInput.nextLine();
				car.setCar_name(i_c_name);
				System.out.println("Enter chasis name: ");
				String i_c_chasis = myInput.nextLine();
				car.setChasis(i_c_chasis);
				System.out.println("Price of Car  :");
				int i_c_cost = myInput.nextInt();
				car.setCost(i_c_cost);
				System.out.println("Enter Engine id: ");
				int e_id = myInput.nextInt();
				engine.setId(e_id);
				System.out.println("Enter Engine cc: ");
				int e_cc = myInput.nextInt();
				engine.setCc(e_cc);
				System.out.println("Enter No of Cylinder: ");
				int e_no_of_cylinder = myInput.nextInt();
				myInput.nextLine();
				engine.setNo_of_cylinder(e_no_of_cylinder);
				car.setEngin(engine);
				controller.addCar(car, engine);
		 }else {
			
		}
		 break;
		 
		 
		 //Remove
			case 2:
				System.out.println("Enter car id to remove: ");
				int IdRemove = myInput.nextInt();
				myInput.nextLine();
				controller.removeCar(IdRemove);
			
				break;
			
				//Update
			case 3:
				System.out.print("Enter car id to update: ");
			    int car_Id = myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter New cost of the car: ");
				double cost = myInput.nextDouble();
				myInput.nextLine();
				if (controller.updateCar(car_Id , cost)) {
					System.out.println("Car Updated");
				}else {
					System.out.println("Car does not exists by given id");
				}
			
			break;
			
				//Find Car
			case 4:
		   System.out.println("Enter car Id to find: ");
		   int c_id = myInput.nextInt();
		   Car  car = controller.findCar(c_id);
			if (car != null) {
				System.out.println("Car id : "+car.getId());
				System.out.println("Car name: "+car.getCar_name());
				System.out.println("Car chasis: "+car.getChasis());
				Engine engine = car .getEngin();
				System.out.println("Engine id : "+engine.getId());
				System.out.println("cc : "+ engine.getCc());
				System.out.println("no. of cylinder : "+ engine.getNo_of_cylinder());
			}else {
				System.out.println("Car with given id does not exit");
			}
	
				break;
		 
			default:
				System.out.println("---------Invalid Section--------------");
				break;
			}
		} while (true);
	}

}
