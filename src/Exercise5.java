import java.util.Scanner;

/**Class: Exercise5
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#5 in HW)
 * Purpose - prompts the user for an integer value. The program should
 * then calculate and print the factorial of the user provided value.
 */


public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int factorial = 1;

        if (number < 0) {
            System.out.println("Invalid number for factorial.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(number + "! = " + factorial);
        }
    }
}
