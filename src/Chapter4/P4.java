package Chapter4;

import java.util.Scanner;

/**
 *Program to display which bidder is better to hire 
 *
 * @author Payton Green
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        /*Print out name and hours for both bidders
        * Store them seperatley into variables
         */
        System.out.print("Enter the name of the first bidder:");
        Scanner input = new Scanner(System.in);
        String name1 = input.next();

        System.out.print("Enter how many hours the first bidder will work:");
        int hours1 = input.nextInt();

        System.out.print("Enter how much the first bidder will charge per hour:");
        double charge1 = input.nextDouble();

        System.out.print("Enter the name of the second bidder:");
        String name2 = input.next();

        System.out.print("Enter how many hours the second bidder will work:");
        int hours2 = input.nextInt();

        System.out.print("Enter how much the second bidder will charge per hour:");
        double charge2 = input.nextDouble();

        double totalCost1 = hours1 * charge1;
        double totalCost2 = hours2 * charge2;

        //Who is the winner?
        if (totalCost1 < totalCost2) {
            System.out.printf("The winner is %s", name1, totalCost1);
        } else if (totalCost1 > totalCost2) {
            System.out.printf("\n The winner is %s.2f", name2, totalCost2);
        } else if (totalCost1 == totalCost2 && hours1 < hours2) {
            System.out.printf("The winner is %s.2f", name1, totalCost1, hours1);
        } else if (totalCost1 == totalCost2 && hours1 > hours2) {
            System.out.printf("The winner is %s.2f", name2, totalCost2, hours2);
        } else if (totalCost1 == totalCost2 && hours1 == hours2) {
            System.out.printf("They have identical bids %s.2f", name1, totalCost1, hours1, name2, totalCost2, hours2);
        }
    }

}
