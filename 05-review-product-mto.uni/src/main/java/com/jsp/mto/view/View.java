package com.jsp.mto.view;

import java.util.Scanner;

import com.jsp.mto.controller.Find;
import com.jsp.mto.controller.Insert;
import com.jsp.mto.controller.Remove;
import com.jsp.mto.controller.Update;
import com.jsp.mto.model.Product;
import com.jsp.mto.model.Review;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static Find find = new Find();
	static Product product = new Product();
	static Review review = new Review();
	static Insert insert = new Insert();
	static Update update = new Update();

	public static void main(String[] args) {
		do {
			System.out.println("Enter number to perform respective Operatin");
			System.out.println("1.find\n2.Add product & review\n3.Remove product\n4.Update product\0.Exit");
			int userInput = myInput.nextInt();
			myInput.nextLine();

			switch (userInput) {
			case 0:
				myInput.close();
				System.out.println("-----Exited-----");
				break;
			case 1:
				System.out.println("enter id to find");
				Review find2 = find.find(myInput.nextInt());

				if (find2 != null) {
					System.out.println("Review Id " + review.getId());
					System.out.println("Heading" + review.getHeading());
					System.out.println("Comment " + review.getComment());
//					Product product = review.getProduct();
//					System.out.println("Product " + product.getId());
//					System.out.println("Product name " + product.getName());
//					System.out.println("Procuct Price " + product.getPrice());
				} else {
					System.out.println("Review not found");
				}
//				find.find(f_id);
				break;
			case 2:
//				product
				System.out.println("Enter product  id :");
				int p_id = myInput.nextInt();
				myInput.nextLine();
				product.setId(p_id);
				System.out.println("Product name :");
				String p_name = myInput.nextLine();
				product.setName(p_name);
				System.out.println("Enter price:");
				int p_cost = myInput.nextInt();
				myInput.nextLine();

//review
				System.out.println("Enter review id :");
				int r_id = myInput.nextInt();
				myInput.nextLine();
				review.setId(r_id);
				System.out.println("Enter heading :");
				String r_heading = myInput.nextLine();
				review.setHeading(r_heading);
				System.out.println("Enter comment");
				String r_comment = myInput.nextLine();
				review.setComment(r_comment);
				review.setProduct(product);

				insert.addRecord(review, product);
				break;
			case 3:
				System.out.println("Enter id to remove:");
				int removeId = myInput.nextInt();

				if (Remove.deleteRecord(removeId)) {
					System.out.println("review Deleted");
				} else {
					System.out.println("record not found");
				}

				break;
			case 4:
				System.out.println("Enter id to update");
				int u_id = myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter name to Upadte :");
				String u_comment = myInput.nextLine();
				review.setComment(u_comment);
				update.upadteRecord(u_id, u_comment);

				break;

			default:
				break;
			}
		} while (true);
	}

}
