import java.util.Scanner;

/**Class: Exercise2
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#2 in HW)
 * Purpose - prompts the user for student grades, calculates and displays the average
 * grade in the class. The user should enter a character to stop providing values.
 */


public class Exercise2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int sum = 0;
		int gradeCount = 0;

		System.out.println("Enter student grades: ");

		while(true) {
			if(keyboard.hasNextInt()) {
				int grade = keyboard.nextInt();
				sum += grade;
				gradeCount++;
			}
			else{
				break;
			}
		}
		double average = (double) sum / gradeCount;
		System.out.printf("The student's average grade is %.2f ",average);
	}
}