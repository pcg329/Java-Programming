package Chapter6;

import java.util.Scanner;

/**
 * Program to display the conversion of U.S. dollars to Euros, Pounds, and Yen
 * to the console
 *
 * @author Payton Green
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Euros
        System.out.print("Enter how many Euros a dollar could buy:");
        double Euros = input.nextDouble();

        //Pounds
        System.out.print("Enter how many Pounds a dollar could buy:");
        double Pounds = input.nextDouble();

        //Yen
        System.out.print("Enter how many Yen a dollar could buy:");
        double Yen = input.nextDouble();

        String answer;
        do {
            //Enter a Currency
            System.out.print("Enter the amount of dollars you want to convert:");
            double Dollars = input.nextDouble();
            System.out.print("Enter E to buy Euros, P to buy Pounds, or Y to buy Yen:");
            String s1 = input.next().toUpperCase();

            switch (s1) {

                case "E":
                    double EurosX = conversion(Dollars, Euros);
                    System.out.printf("For %.2f dollars, you will get %.2f Euros", Dollars, EurosX);
                    break;

                case "P":
                    double PoundsX = conversion(Dollars, Pounds);
                    System.out.printf("For %.2f dollars, you will get %.2f Pounds", Dollars, PoundsX);
                    break;

                case "Y":
                    double YenX = conversion(Dollars, Yen);
                    System.out.printf("For %.2f dollars, you will get %.2f Yen", Dollars, YenX);
                    break;
            }

            //Do you want to perform more conversions?
            do {
                System.out.println("\n Do you want to perform more coversions? ");
                answer = input.next().toUpperCase();
            } while (!answer.equals("NO") && !answer.equals("YES"));

        } while (!answer.equals("NO"));
    }

    //Coverting dollars to Euros, Pounds, or Yen
    /**
     * Converting dollars to one of the three options and applying tax
     *
     * @param Dollars is the amount that the user want to convert
     * @param num2 is the exchange currency
     * @return if the amount is above or below 100 dollars
     */
    public static double conversion(double Dollars, double num2) {

        if (Dollars > 100) {
            return (0.95 * Dollars * num2);
        } else {
            return (0.90 * Dollars * num2);
        }
    }
}
