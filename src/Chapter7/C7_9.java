package Chapter7;

import java.util.Scanner;

/**
 * Program to display the minimum number in a list of 10 numbers to the console
 *
 * @author Payton Green
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[] minimum = new double[10];
        System.out.print("Enter 10 numbers:");
        System.out.println("The minimum number is: " + min(minimum));

    }

    /**
     * Finds the minimum number within the numbers inputed by the user
     *
     * @param array stores the numbers inputed by the user
     * @return the minimum number o fall the numbers inserted by the user
     */
    public static double min(double[] array) {
        double best = 0;

        Scanner input = new Scanner(System.in);
        double[] minimum = new double[10];
        for (int i = 0; i < minimum.length; i++) {
            minimum[i] = input.nextDouble();
            if (best > minimum[i]) {
                best = minimum[i];
            }

        }
        return minimum[0];

    }

}
