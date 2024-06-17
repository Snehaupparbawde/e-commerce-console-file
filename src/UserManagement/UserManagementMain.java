package UserManagement;
import java.util.Scanner;
public class UserManagementMain {
	public static void UserManagementMain() {
		System.out.println("**Welcome to User Management**");

		Scanner sc = new Scanner(System.in);
		boolean shallIKeepRunningCode = true;

		User user = new User();
		while (shallIKeepRunningCode) {

			System.out.println("What would you like to do today?");
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Delete User");
			System.out.println("5.Print User");
			System.out.println("9.Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Add User:");
				System.out.println("Enter your firstname:");
				user.firstName = sc.next();

				System.out.println("Enter your lastname:");
				user.lastName = sc.next();

				System.out.println("Enter your gender:");
				user.gender = sc.next();

				System.out.println("Enter your email:");
				user.email = sc.next();

				System.out.println("Enter your password:");
				String password = sc.next();

				System.out.println("Enter your confirm password:");
				String confirmPassword = sc.next();

				if (password.equals(confirmPassword)) {
					user.password = password;
				} else {
					System.out.println("Password and confirm password does not match");
					System.out.println("!!!User addition fail");
				}
				System.out.println("**User added Successfully");
				user.printUser();
				break;

			case 2:
				System.out.println("Update User not implemented");
				break;

			case 3:
				System.out.println("Search User not implemented");
				break;

			case 4:
				System.out.println("Delete User not implemented");
				break;

			case 5:
				user.printUser();
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



