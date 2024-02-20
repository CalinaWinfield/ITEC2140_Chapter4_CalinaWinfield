import java.util.Scanner;

/**Class: Exercise1
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#1 in HW)
 * Purpose - prompts the user for an integer and displays
 * if the provided integer is a prime number or not.
 */


public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean prime = true;

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                prime = false;
            }
        }

        if(prime){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is not a prime number.");
        }
    }
}
