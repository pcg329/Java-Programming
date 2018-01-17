package Chapter3;

import java.util.Scanner;

/**
 * Program to display which number is bigger, if the first divided by the second
 * number is a proper or improper fraction, if it is in the range of 1 to 100,
 * and the letter the first number is given based on the value to the console
 *
 * @author Payton Green
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter the first number:");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();

        System.out.print("Enter the second number");
        double num2 = input.nextDouble();

        //First Message
        if (num1 < num2) {
            System.out.println("The first number is less than the second number");
        } else {
            System.out.println("The first number is greater than the second number");
        }

        //Second Message
        if (num1 == num2) {
            System.out.println("The first number is equal to the second number");
        }

        //Third Message
        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second number");
        }

        //Fourth Message 
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second number");
        }

        //Fifth Message
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else if (num1 % num2 < 1) {
            System.out.println("Proper fraction");
        } else if (num1 % num2 > 1) {
            System.out.println("Improper fraction");
        }

        //Sixth Message
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else if (num1 >= 50) {
            System.out.println("F");
        }

        //Seventh Message
        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of  range");
        }

    }
}
