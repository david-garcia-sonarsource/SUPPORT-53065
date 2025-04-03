import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Print greeting message
        printGreeting();
        // Print current date and time
        printCurrentDateTime();
        // Perform and print basic arithmetic operations
        performArithmeticOperations();
        // Get and print user input
        getUserInput();
    }

    // Method to print greeting message
    private static void printGreeting() {
        System.out.println("Hello, World!");
    }

    // Method to print current date and time
    private static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }

    // Method to perform and print basic arithmetic operations
    private static void performArithmeticOperations() {
        int a = 10;
        int b = 5;
        System.out.println("Basic Arithmetic Operations:");
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
    }

    // Method to get and print user input
    private static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
