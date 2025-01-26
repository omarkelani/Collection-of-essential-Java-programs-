package omarkelani.numberguessinggame;

//get user input from the keyboard
import java.util.Scanner;
//generate random numbers
import java.util.Random;


//the main class for the program
public class numberguessinggame {
	//main entry point of java program
	 public static void main(String[] args) {
//		 read input from the user
	        Scanner scanner = new Scanner(System.in);
//	        generate random numbers
	        Random random = new Random();
//	        Generate a random number between 1 and 100
	        int numberToGuess = random.nextInt(100) + 1;
//	        Initialize a variable to store the users guess starting at 0
	        int userGuess = 0;
//	        Print a message asking the user to guess a number
	        System.out.println("Guess a number between 1 and 100:");

//	        guesses the correct number
	        while (userGuess != numberToGuess) {
	            // Get users guess
	            userGuess = scanner.nextInt();
//	            If the guess is greater than the random number ask the user to try again
	            if (userGuess > numberToGuess) {
	                System.out.print("Too high! Try again: ");
//	                If the guess is less than a random number ask the user to try again
	            } else if (userGuess < numberToGuess) {
	                System.out.print("Too low! Try again: ");
//	                f the guess is correct congratulate the user
	            } else {
	                System.out.println("Congratulations! You guessed the number.");
	            }
	        }
	        scanner.close();
	    }
	}

	
	
	
	
	
	


