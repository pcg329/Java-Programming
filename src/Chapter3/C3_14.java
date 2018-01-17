package Chapter3;

import java.util.Scanner;

/**
 * Program to display heads or tails by entering 0 or 1 to the console
 *
 * @author Payton Green
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double computerGuess = (int) (Math.random() * 2);
        System.out.print("Enter 0 or 1, 0 being heads and 1 being tails: ");
        Scanner input = new Scanner(System.in);

        double answer = input.nextInt();
        System.out.println("Your guess was " + answer + "." + "The computer said " + computerGuess + ".");

        if (answer == computerGuess) {
            System.out.println("correct");
        } else if (answer != computerGuess) {
            System.out.println("incorrect");
        }
    }
}
