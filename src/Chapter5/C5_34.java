package Chapter5;

import java.util.Scanner;

/**
 * Program to display the game rock, paper, scissors and who won to the console
 *
 * @author Payton Green
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int count = 0;          // Used to keep count of wins and losses
        int computer = 0;       // Computer guess
        int player = 0;         // Player guess

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number and beat the computer, 0=Scissors, 1=Rock, 2=Paper:");
            player = input.nextInt();
            computer = (int) (Math.random() * 3);

            switch (computer) {
                case 0:
                    if (player == 0) // scissors (c) vs scissors (p)
                    {
                        System.out.println("You said " + player + ". The Computer said " + computer + ". It's a tie");
                    } else if (player == 1) { // scissors (c) vs rock (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You win");
                        count++;
                    } else if (player == 2) { // scissors (c) vs paper (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You lose");
                        count--;
                    }
                    break;
                case 1:
                    if (player == 0) {// rock (c) vs scissors (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You lose");
                        count--;
                    } else if (player == 1) { // rock (c) vs rock (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You tie");
                    } else if (player == 2) { // rock (c) vs paper (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You win");
                        count++;
                    }
                    break;
                case 2:
                    if (player == 0) { // paper (c) vs scissors (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You win");
                        count++;
                    } else if (player == 1) { // paper (c) vs rock (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". You lose");
                        count--;
                    } else if (player == 2) { // papaer (c) vs paper (p)
                        System.out.println("You said " + player + ". The Computer said " + computer + ". It's a tie");
                    }
                    break;
            }

        } while (count <= 2 && count >= -2);

        if (count > 2) {
            System.out.println("You have won more than 2 times");
        } else {
            System.out.println("The computer has won more than 2 times");
        }

    }
}
