package gen;

import java.util.Scanner;

public class UserInput {

    public static Person collectUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your date of birth (YYYY-MM-DD):");
        String dob = scanner.nextLine();

        System.out.println("Enter your gender (M/F):");
        String gender = scanner.nextLine();

        System.out.println("Enter your height in inches:");
        int height = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        System.out.println("Enter your city:");
        String city = scanner.nextLine();

        System.out.println("Enter your state:");
        String state = scanner.nextLine();

        System.out.println("Enter your zip code:");
        String zip = scanner.nextLine();

        System.out.println("Enter your customer ID:");
        String customerId = scanner.nextLine();
        
        scanner.close();

        // Return a new Person object with all collected data
        return new Person(lastName, firstName, dob, gender, height, address, city, state, zip, customerId);
    }
}
