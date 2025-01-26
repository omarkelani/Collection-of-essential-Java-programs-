package omarkelani.ArithmeticOperations;
import java.util.Scanner;

public class ArithmeticOperations {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input first number from usres
	        System.out.print("Enter first number: ");
	        int firstNumber = scanner.nextInt();

	        // Input second number from users
	        System.out.print("Enter second number: ");
	        int secondNumber = scanner.nextInt();

	        // Perform basic arithmetic operations
	        int addition = firstNumber + secondNumber;
	        int subtraction = firstNumber - secondNumber;
	        int multiplication = firstNumber * secondNumber;
	        double division = (double) firstNumber / secondNumber;

	        // Output results of calculations
	        System.out.println("Addition: " + addition);
	        System.out.println("Subtraction: " + subtraction);
	        System.out.println("Multiplication: " + multiplication);
	        System.out.println("Division: " + division);

	        scanner.close();
	    }
	}



