package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate celsius to fahrenheit when given the celsius
 *
 * @author Payton Green
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for Celsius: ");
        double celsisus = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsisus + 32;

        System.out.println(celsisus + " Celsisus is " + fahrenheit + " Fahrenheit");
    }

}
