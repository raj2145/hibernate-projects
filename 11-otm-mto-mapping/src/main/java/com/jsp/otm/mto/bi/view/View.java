package com.jsp.otm.mto.bi.view;

import java.util.List;
import java.util.Scanner;

import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;
import com.jsp.otm.mto.bi.controller.AccountController;
import com.jsp.otm.mto.bi.controller.BankController;

public class View {
static Scanner myInput = new Scanner(System.in);
static BankController bankController = new BankController();
static AccountController accountContoller = new AccountController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
do {
	System.out.println("Enter a Number to perform Respective Operation");
	System.out.println("1. Add Bank and Accounts \n2. Find Bank and Accounts \n3. Update Bank and Accounts\n4. Delete Bank and Account \n5. Exit");
int userInput=myInput.nextInt();
myInput.nextLine();
	switch (userInput) {
	case 1:
		System.out.println("what you want to add ?\n 1.Bank\n 2.Account");
		
		switch (myInput.nextInt()) {
		case 1:
			Bank bank = new Bank();
			System.out.println("Enter Bank ID = ");
			bank.setB_id(myInput.nextInt());
			myInput.nextLine();
			System.out.println("Enter Bank Name = ");
			bank.setB_Name(myInput.nextLine());
			System.out.println("Enter Bank Headquatar = ");
			bank.setB_Headquatar(myInput.nextLine());

//			 ArrayList<Account> account = new ArrayList();
		
			Account account = new Account();

				System.out.println("Enter Account ID = ");
				account.setA_id(myInput.nextInt());
				myInput.nextLine();
				System.out.println("Enter Account Name = ");
				account.setA_Name(myInput.nextLine());
				System.out.println("Enter Account Balance = ");
				account.setA_Balance(myInput.nextDouble());
				myInput.nextLine();


             
				

		

			
			break;
		case 2:
			System.out.println("Add account");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
		break;
	case 2:
		 
		break;
	default:
		System.out.println("Invalid Input");
		break;
	}
} while (true);
	}

}
