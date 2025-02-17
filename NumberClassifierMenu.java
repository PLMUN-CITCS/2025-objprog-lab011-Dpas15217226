import java.util.Scanner; // Import Scanner class

public class NumberClassifierMenu {
    public static void main(String[] args) {
        // Create Scanner object and choice variable
        Scanner input = new Scanner(System.in);
        char userChoice;

        // Start do-while loop to allow menu repetition
        do {
            // Display menu options
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = input.nextInt(); // Read user choice

            // Switch statement for menu handling
            switch (choice) {
                case 1:
                    // Case 1: Classify Number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();

                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    // Check if number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2:
                    // Case 2: Multiplication Table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Case 3: Exit Program
                    System.out.println("Exiting the program. Goodbye!");
                    input.close();
                    return; // Exit the program immediately

                default:
                    // Handle invalid choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            // Ask if user wants to return to menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume leftover newline
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y'); // Loop continues if user enters 'Y'

        // Close scanner after loop
        input.close();
        System.out.println("Program ended.");
    }
}
