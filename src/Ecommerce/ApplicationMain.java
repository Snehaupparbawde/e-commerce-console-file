package Ecommerce;

import java.util.Scanner;
import ProductManagement.ProductManagementMain;
import UserManagement.UserManagementMain;

public class ApplicationMain {
	public static void main(String[] args) {

		System.out.println("**Welcome to E-Commerce");
		Scanner sc = new Scanner(System.in);
		boolean shallIKeepRunningCode = true;
		while (shallIKeepRunningCode) {
			System.out.println("What would you like to do today?");
			System.out.println("1.Product Manangement");
			System.out.println("2.User Management");
			System.out.println("9.Exit Application");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				ProductManagementMain.ProductManagementMain();
				break;
			case 2:
				UserManagementMain.UserManagementMain();
				break;
			case 9:
				System.out.println("Exiting application");
				shallIKeepRunningCode = false;
				break;
			default:
				System.out.println("Unknown option Selected...");
			}
		}
	}

}
