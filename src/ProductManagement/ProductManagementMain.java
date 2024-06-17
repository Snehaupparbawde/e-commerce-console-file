package ProductManagement;

import java.util.Scanner;

public class ProductManagementMain {
	public static void ProductManagementMain() {
		System.out.println("**Welcome to Product Management**");

		Scanner sc = new Scanner(System.in);
		boolean shallIKeepRunningCode = true;

		Product product = new Product();
		while (shallIKeepRunningCode) {

			System.out.println("What would you like to do today?");
			System.out.println("1.Add Product");
			System.out.println("2.Update Product");
			System.out.println("3.Search Product");
			System.out.println("4.Delete Product");
			System.out.println("5.Print Product");
			System.out.println("9.Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Add Product:");
				System.out.println("Enter Product name:");
				product.name = sc.next();

				System.out.println("Enter Product quantity:");
				product.quantity = sc.nextInt();

				System.out.println("Enter Price");
				product.price = sc.next();

				System.out.println("***Product added successfully!");
				product.printProduct();
				break;

			case 2:
				System.out.println("Update Product not implemented");
				break;

			case 3:
				System.out.println("Search Product not implemented");
				break;

			case 4:
				System.out.println("Delete Product not implemented");
				break;

			case 5:
				product.printProduct();
				break;

			case 9:
				System.out.println("Exit Application");
				shallIKeepRunningCode = false;
				break;

			default:
				System.out.println("Unknown option selected...");
			}
		}
	}
}
