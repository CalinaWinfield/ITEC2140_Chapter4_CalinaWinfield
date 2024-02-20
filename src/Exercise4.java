/**Class: Exercise4
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 15, 2024
 *
 * (#4 in HW)
 * Purpose - prints the first 30 values in the Fibonacci series.
 */


public class Exercise4 {
    public static void main(String[] args){
        int n = 30;
        int fibStart = 0;
        int fibSecond = 1;

        for(int i = 1; i <= n; i++){
            System.out.print(fibStart + ", ");

            int nextNumber = fibStart + fibSecond;
            fibStart = fibSecond;
            fibSecond = nextNumber;
        }
    }
}
