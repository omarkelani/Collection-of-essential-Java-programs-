package omarkelani.OddEvenNumberCheck;
import java.util.Scanner;

public class OddEvenNumberCheck {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter a number 
	        System.out.print("Enter a number: ");
//	        Read the number entered by the user
	        int number = scanner.nextInt();

	        // Check if the number is odd or even
	        if (number % 2 != 0) {
	            System.out.println("The number is odd");
	        } else {
	            System.out.println("The number is even");
	        }

	        scanner.close();
	    }
	}
