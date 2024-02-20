/**Class: Exercise10
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#10 in HW)
 * Purpose - Write a program that creates the following pattern.
 *  ******
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 */


public class Exercise10 {
    public static void main(String[] args){
        // I took from the chapter's 4.10.Nested Loops example and played around
        // with the numbers until I understood and fixed it to work for this problem.
        for(int row = 6; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
