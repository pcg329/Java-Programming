package Chapter4;

import java.util.Scanner;

/**
 * Program to display Class and Grade to the console
 *
 * @author Payton Green
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        System.out.print("Enter M,C or I and 1, 2, 3, or 4: ");
        Scanner input = new Scanner(System.in);
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);

        /**
         * If-else if statements to determine what to print out M = Mathematics,
         * C= Computer Science, I= Information Technology F = Freshman, S=,
         * Sophomore, J= Junior, S= Senior
         */
        if (b == 'M' && c == '1') {
            System.out.println("Mathematics Freshman");
        } else if (b == 'M' && c == '2') {
            System.out.println("Mathematics Sophomore");
        } else if (b == 'M' && c == '3') {
            System.out.println("Mathematics Junior");
        } else if (b == 'M' && c == '4') {
            System.out.println("Mathematics Senior");
        } else if (b == 'C' && c == '1') {
            System.out.println("Computer Science Freshman");
        } else if (b == 'C' && c == '2') {
            System.out.println("Computer Science Sophomore");
        } else if (b == 'C' && c == '3') {
            System.out.println("Computer Science Junior");
        } else if (b == 'C' && c == '4') {
            System.out.println("Computer Science Senior");
        } else if (b == 'I' && c == '1') {
            System.out.println("Information Technology Freshman");
        } else if (b == 'I' && c == '2') {
            System.out.println("Information Technology Sophomore");
        } else if (b == 'I' && c == '3') {
            System.out.println("Information Technology Junior");
        } else if (b == 'I' && c == '4') {
            System.out.println("Information Technology Senior");
        } else {
            System.out.println("Invalid");
        }
    }

}
