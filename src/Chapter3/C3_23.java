package Chapter3;

import java.util.Scanner;

/**
 * Program to display both, or, and and two number inputs are divisible by 5 and
 * 6 to the console
 *
 * @author Payton Green
 */
public class C3_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();

        if (integer % 5 == 0 && integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 and 6? false");
        }

        if (integer % 5 == 0 || integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 or 6? false");
        }

        if (integer % 5 == 0 ^ integer % 6 == 0) {
            System.out.println("Is " + integer + " divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + integer + " divisible by 5 or 6, but not both? false");
        }
    }

}
