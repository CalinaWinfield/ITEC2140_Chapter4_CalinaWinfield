import java.util.Scanner;

/**Class: Exercise7
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#7 in HW)
 * Purpose - prompts the user for two String values. The program should then display if
 * string 1 is greater in length than string 2. The program should also display if string 1
 * appears after string 2 in the lexicographic order or vice versa or if they are the same.
 * Lastly, the program should display a sentence created by combining both the string values.
 */


public class Exercise7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String str1 = keyboard.nextLine();
        System.out.print("Enter another phrase: ");
        String str2 = keyboard.nextLine();

        if(str1.length() > str2.length()){
            System.out.println("String '" + str1 + "' is longer than String '" + str2 + "'");
        }
        else if(str1.length() == str2.length()){
            System.out.println("String '" + str1 + "' is the same length as String '" + str2 + "'");
        }
        else{
            System.out.println("String '" + str2 + "' is longer than String '" + str1 + "'");
        }

        // I got help here
        int comparison = str1.compareTo(str2);

        if(comparison < 0){
            System.out.println("String '" + str1 + "' appears before String '" + str2 + "' in lexicographic order.");
        }
        else if(comparison > 0){
            System.out.println("String '" + str2 + "' appears before String '" + str1 + "' in lexicographic order.");
        }
        else{
            System.out.println("Strings '" + str1 + "' and '" + str2 + "' are the same, lexicographically.");
        }
        System.out.println("New sentence created is '" + str1 + " " + str2 + "'");
    }
}
