import java.util.Scanner;

/**Class: Exercise9
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#9 in HW)
 * Purpose - prompts the user for a String value and a character value. The program
 * should then find the last occurrence of the provided character in the provided String
 * and display the corresponding index. If the character is not found in the String, display -1.
 */


public class Exercise9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phrase or sentence: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int last = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == character) {
                last = i;
                break;
            }
        }
        System.out.println("Last occurrence of '" + character + "' is at index: " + last);
    }
}
