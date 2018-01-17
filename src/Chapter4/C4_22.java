package Chapter4;

import java.util.Scanner;

/**
 * Program to display substrings to the console
 *
 * @author Payton Green
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String a = input.next().toUpperCase();

        System.out.print("Enter the substring: ");
        String b = input.next().toUpperCase();

        if (a.contains(b)) {
            System.out.println(b + " is a substring of " + a);
        } else {
            System.out.println(b + "is not a substring of " + a);
        }
    }

}
