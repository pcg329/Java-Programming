package Chapter2;

import java.util.Scanner;

/**
 * Program to display the cost of the meal, drink, dessert, and tip and put it
 * into a total to the console
 *
 * @author Payton Green
 *
 *
 */

public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of the meal, drink, and dessert: ");

        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double dessert = input.nextDouble();
        double tax = .10 * (meal + drink + dessert);
        double tip = .15 * (meal + drink + dessert + tax);
        double total = tip + tax + (meal + drink + dessert);

        System.out.println("The tax is " + tax + "." + " The tip is " + tip + "." + " The total is " + total + ".");
    }
}
