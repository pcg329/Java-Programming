package Chapter7;

import java.util.Scanner;

/**
 * Program to display the students' grades to the console
 *
 * @author Payton Green
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter the number of students
        System.out.print("Enter the number of students:");
        int s = input.nextInt();
        int grades[] = new int[s];

        //Enter the grades and get the best score
        System.out.println("Enter 4 grades:");
        int best = -1;
        for (int i = 0; i < s; i++) {
            grades[i] = input.nextInt();
            if (best < grades[i]) {
                best = grades[i];
            }
        }

        //display the grades based of the student score
        for (int i = 0; i < s; i++) {
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + grade(grades[i], best));
        }
    }

    /**
     * returns a letter if the grade is within those parameters
     *
     * @param score the percentage of the students
     * @param best the grade for the students
     * @return a letter grade
     */
    public static char grade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
