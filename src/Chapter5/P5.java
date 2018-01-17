package Chapter5;

import java.util.Scanner;

/**
 * Program to display The amount of yes, no, and the total number of votes to
 * the console
 *
 * @author Payton Green
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int count = 0;
        int yes = 0;
        int no = 0;
        int invalid = 0;
        String s1 = "";

        do {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting:");
            Scanner input = new Scanner(System.in);
            s1 = input.next().toUpperCase();
            switch (s1) {

                case "Y": // Yes vote 
                    count++;
                    yes++;
                    break;

                case "N": // No vote 
                    count++;
                    no++;
                    break;

                case "Q": // Quit out of voti
                    break;
                default:
                    System.out.print("Invalid code: ");
                    ++invalid;
                    count++;
                    break;

            }

        } while (!s1.equals("Q"));

        System.out.println("No votes: " + no);
        System.out.println("Yes votes: " + yes);
        System.out.println("Invalid votes: " + invalid);
        System.out.println("Total votes: " + count);
    }
}
