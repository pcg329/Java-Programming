package Chapter7;

import java.util.Scanner;

/**
 * Program to display the input of the numbers in an array, the average of the
 * array, and the array itself to the console
 *
 * @author Payton Green
 */

public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Insert the length of the array
        System.out.print("Enter how many numbers the will array contain:");
        int array[] = new int[input.nextInt()];
        insertnumbers(array);

        System.out.println("The average of the array is:" + average(array));
        System.out.println(java.util.Arrays.toString(array));
    }

    public static void insertnumbers(int array[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers into the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
//Average the numbers

    public static int average(int array[]) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total / array.length;
    }

    public static void printarray(int array[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {

        }
    }
}
