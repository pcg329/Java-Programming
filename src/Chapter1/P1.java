package Chapter1;

import java.util.Scanner;

/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Payton Green
 */
public class P1 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from command line prompt
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;

        System.out.println("The area for a circle of radius " + radius + "is" + area);
    }
}
