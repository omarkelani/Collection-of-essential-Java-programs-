package omarkelani.BasicCalculator;

import java.util.Scanner;


public class BasicCalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input mathematical operation from users
	        System.out.print("Choose an operation (+, -, *, /): ");
	        char operation = scanner.next().charAt(0);

	        // Input first number from users
	        System.out.print("Enter first number: ");
	        double firstNumber = scanner.nextDouble();

	        // Input second number from users
	        System.out.print("Enter second number: ");
	        double secondNumber = scanner.nextDouble();

	        // Perform calculation based on the operation
	        double result;
	        switch (operation) {
//	        for addition
	            case '+':
	                result = firstNumber + secondNumber;
	                break;
//	                for subtraction
	            case '-':
	                result = firstNumber - secondNumber;
	                break;
//	                for multiplication
	            case '*':
	                result = firstNumber * secondNumber;
	                break;
//	                for division.
	            case '/':
	                if (secondNumber != 0) {
	                    result = firstNumber / secondNumber;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    scanner.close();
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation.");
	                scanner.close();
	                return;
	        }

	        // Output result
	        System.out.println("Result: " + result);

	        scanner.close();
	    }
	}



