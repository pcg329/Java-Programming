package Chapter2;

import java.util.Scanner;

/**
 * Program to display the subtotal, gratuity rate, and the total of both to the
 * console
 *
 * @author Payton green
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = subtotal * .15;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

}
