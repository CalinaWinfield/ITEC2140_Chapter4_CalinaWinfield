import java.util.Scanner;

/**Class: Exercise8
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#8 in HW)
 * Purpose - accepts a String value from the user and displays the reverse of that value.
 */


public class Exercise8 {
    public static void main(String[] args){
        Scanner string = new Scanner(System.in);
        // I did this the same way you showed us from Feb 15th's lecture, in
        // the DayStringLoop class, and changed it to work with this problem.
        System.out.print("Enter a sentence or phrase: ");
        String phrase = string.nextLine();

        System.out.print("The reverse of '");
        for(int j = 0; j < phrase.length(); j++){
            System.out.print(phrase.charAt(j));
        }

        System.out.print("' is '");

        for(int i = phrase.length() - 1; i >= 0; i--){
            System.out.print(phrase.charAt(i));
        }
        System.out.print("'");
        System.out.println("");
    }
}
