package Chapter5;

import java.util.Scanner;

/**
 * Program to display the reversed string of the input of the the user to the
 * console
 *
 * @author Payton Green
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(" You typed the string" + a + ". The reversed string is " + (new StringBuffer(a).reverse().toString()));
    }
}
