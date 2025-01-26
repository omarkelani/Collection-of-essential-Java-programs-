package omarkelani.GradeCalculator;

//get user input from the keyboard
import java.util.Scanner;


//the main class for the program
public class GradeCalculator {
//	main entry point of java program
	public static void main(String[] args) {
//		Create an input scanner object
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        
        
//        Input marks and calculate the total
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        
        
//        Calculate the average
        double average = total / 5.0;
        
        
//        Determine the grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

//        Print the results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
	}
}
