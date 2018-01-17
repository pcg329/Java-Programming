package Chapter4;

import java.util.Scanner;

/**
 * Program to display Employee's name, hours worked, pay rate, gross pay,
 * deductions, Federal Withholding, State Withholding, Total Deductions, and Net
 * Pay to the console
 *
 * @author Payton Green
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        /**
         * Store everything into a string and variables
         */
        System.out.print("Enter employee's name: ");
        Scanner input = new Scanner(System.in);
        String a = input.next();

        System.out.print("Enter hours worked in a week: ");
        double b = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double c = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double d = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double e = input.nextDouble();

        /**
         * Calculate grosspay, federalTax, and stateTax
         */
        double grossPay = b * c;
        double federalTax = d * grossPay;
        double stateTax = e * grossPay;

        /**
         * Print everything out to the console
         */
        System.out.printf("Employee name: %s", a);
        System.out.printf("\n Hours Worked: %.2f", b);
        System.out.printf("\n Pay Rate: $%.2f", c);
        System.out.printf("\n Gross Pay: %.2f", (b * c));
        System.out.printf("\n Deductions:");
        System.out.printf("\n Federal Withholding (%.2f%%): $%.2f\n", (d * 100), federalTax);
        System.out.printf("\n State Withholding (%.2f%%): $%.2f\n", (e * 100), stateTax);
        System.out.printf("\n Total Deduction : $%.2f\n", (federalTax + stateTax));
        System.out.printf("\n Net Pay : $%.2f\n", (grossPay - (federalTax + stateTax)));

    }

}
