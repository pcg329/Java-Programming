package Chapter6;

import java.util.Scanner;

/**
 * Program to display whether or not a password inputed by the user is valid to
 * the console
 *
 * @author Payton Green
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.next();

        if (passwordChecker(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    /**
     * Checking whether or not the password is valid
     *
     * @param p is the password inputed by the user
     * @return true or false
     */
    public static boolean passwordChecker(String p) {
        int counter = 0;
        // must be 8 characters
        if (p.length() < 8) {
            return false;
        }
        // must be a digit or letter
        for (int i = 0; i < p.length(); i++) {
            if (!Character.isLetterOrDigit(p.charAt(i))) {
                return false;
            }
        }
        // must contains atleast 2 digits
        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }

        return true;

    }
}
