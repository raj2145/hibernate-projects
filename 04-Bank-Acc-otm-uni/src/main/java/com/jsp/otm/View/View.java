package com.jsp.otm.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.otm.Controller.Controller;
import com.jsp.otm.Model.Account;
import com.jsp.otm.Model.Bank;

public class View {
	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	static ArrayList<Account> account = new ArrayList();
	static Bank bank = new Bank();

	public static void main(String[] args) {

		do {
			System.out.println("Enter a Number to perform Respective Operation");
			System.out.println(
					"1. Add Bank and Accounts \n2. Find Bank and Accounts \n3. Update Bank and Accounts\n4. Delete Bank and Account \n5. Exit");

			switch (myInput.nextInt()) {
			case 1:

				System.out.println("Enter Bank ID = ");
				bank.setB_id(myInput.nextInt());
				myInput.nextLine();
				System.out.println("Enter Bank Name = ");
				bank.setB_Name(myInput.nextLine());
				System.out.println("Enter Bank Headquatar = ");
				bank.setB_Headquatar(myInput.nextLine());

				// ArrayList<Account> account = new ArrayList();
				do {
					Account account1 = new Account();

					System.out.println("Enter Account ID = ");
					account1.setA_id(myInput.nextInt());
					myInput.nextLine();
					System.out.println("Enter Account Name = ");
					account1.setA_Name(myInput.nextLine());
					System.out.println("Enter Account Balance = ");
					account1.setA_Balance(myInput.nextDouble());
					myInput.nextLine();

					account.add(account1);

					System.out.println("Do u want to add more Account to this bank");
				} while (myInput.nextBoolean());

				bank.setAccount(account);

				if (controller.addBankAndAccounts(bank, account)) {
					System.out.println("Data Inserted");
				} else {
					System.out.println("No insertion ");
				}

				break;
			case 2:
				System.out.println("1. Search only Bank Details\n2. Search Bank's All Accounts");

				switch (myInput.nextInt()) {
				case 1:
					System.out.println("Enter the Bank ID");
					Bank only_Bank = controller.find_bank_acc(myInput.nextInt());

					if (only_Bank != null) {
						System.out.println("Bank Name = " + only_Bank.getB_Name());
						System.out.println("Bank Headquater = " + only_Bank.getB_Headquatar());
					} else {
						System.out.println("No Data is found with the given ID");
					}
					break;
				case 2:
					System.out.println("Enter the Bank ID");
					Bank find_bank_acc = controller.find_bank_acc(myInput.nextInt());

					if (find_bank_acc != null) {
						System.out.println("Bank Name" + find_bank_acc.getB_Name());
						System.out.println("Location" + find_bank_acc.getB_Headquatar());
						List<Account> accoun = find_bank_acc.getAccount();
						for (Account account2 : accoun) {
							System.out.println("Id " + account2.getA_id());
							System.out.println("Account holder Name" + account2.getA_Name());
							System.out.println("Account Balance" + account2.getA_Balance() + "\n");
						}
					} else {
						System.out.println("Id does not Exist");
					}

					break;
				default:
					System.out.println("Invalid Input");
					break;
				}

				break;
			case 3:
				System.out.println("Enter id :");
				int d_Id = myInput.nextInt();
				myInput.nextLine();
				System.out.println("Enter new bank name :");
				String u_name = myInput.nextLine();
				if (controller.upadteBankNmae(d_Id, u_name)) {
					System.out.println("bank name Updated");
				} else {
					System.out.println("given id does not exist");
				}
				break;
			case 4:
				System.out.println("Enter bank id to Remove :");
				int r_id = myInput.nextInt();
				myInput.nextLine();

				if (controller.removeBank(r_id)) {
					System.out.println("Bank Deleted");
				} else {
					System.out.println("given id does not exist");
				}
				break;
			case 5:
				myInput.close();
				System.out.println("Exited");
				break;
			default:
				System.out.println("Invalid Number to Perform Operation");
				break;
			}
		} while (false);

	}
}
