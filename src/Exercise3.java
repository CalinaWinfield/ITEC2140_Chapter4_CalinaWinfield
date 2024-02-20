import java.util.Scanner;

/**Class: Exercise3
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#3 in HW)
 * Purpose - prompts the user for student grades and displays the highest and lowest
 * grades in the class. The user should enter a character to stop providing values.
 */


public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student grades: ");
        int notMax = 0;
        int notMin = 100;

        while(input.hasNextInt()){
            int grade = input.nextInt();

            if(grade > notMax){
                notMax = grade;
            }

            if(grade < notMin){
                notMin = grade;
            }
        }
        System.out.println("Highest grade: " + notMax);
        System.out.println("Lowest grade: " + notMin);
    }
}
