
package Chapter7;

import java.util.Scanner;

/**
 * Program to display if two lists are identical to each other to the console
 * @author Payton Green
 */
public class C7_26 {
/**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2:");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }
/**
 * 
 * @param list1
 * @param list2
 * @return 
 */
    public static boolean equals(int[] list1, int[] list2) {
        return java.util.Arrays.equals(list1, list2);
    }
}
