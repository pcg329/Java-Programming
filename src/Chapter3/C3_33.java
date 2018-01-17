package Chapter3;

import java.util.Scanner;

/**
 * Program to display which package has a better price based on price/weight to
 * the console
 *
 * @author Payton Green
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter weight and price for package 1: ");
        System.out.print("Enter weight and price for package 2:");
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double price = input.nextDouble();

        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double package1 = price / weight;
        double package2 = price2 / weight2;

        if (package1 > package2) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("Package 1 has a better price");
        }
    }

}
