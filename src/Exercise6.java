import java.util.Scanner;

/**Class: Exercise6
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#6 in HW)
 * Purpose - accepts an integer from the user and displays the sum of the digits of the provided integer.
 */


public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // I copied the program from my work in Chapter 2's "Reverse"
        // problem, and adjusted it some to match the purpose of this problem.
        System.out.print("Enter a number between (or equal to) 0 and 9999: ");
        int number = input.nextInt();         //2148

        int ones = number % 10;               //8
        int newNum1 = number / 10;            //214
        int tens = newNum1 % 10;              //4
        int hundreds = (newNum1 / 10) % 10;   //1
        int thousands = newNum1 / 100;        //2

        int digitSum = ones + tens + hundreds + thousands;

        System.out.println("The sum of the digits of " + number + " is " + digitSum);
    }
}
