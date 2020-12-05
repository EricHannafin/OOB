package EricHannafin_PokerMiniProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /**
         * Generate instance of the GUI
         */
        GUI gui = new GUI();

        /**
         * Create a new deck object
         */
        Deck deck = new Deck();
        ArrayList hand;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = sc.nextLine();

        System.out.println("Please enter your age ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Sorry you are too young to play this game");
            System.exit(0);
        }

        System.out.println("How many chips would you like to play with today? ");
        int total = sc.nextInt();

        System.out.println("How much would you like to bet on this hand ");
        int bet = sc.nextInt();

        /**
         * Calling shuffle method
         */
        deck.shuffle();
        hand = (ArrayList) deck.dealHand();
        /**
         * Save the generated hand to a file
         */

        /*****************************************************
         *    Title:  Java Write to File – 4 Ways to Write File in Java
         * 17 Comments
         *    Author: Pankaj
         *    Site owner/sponsor:  https://www.journaldev.com/
         *    Date:
         *    Code version:
         *    Availability:  https://www.journaldev.com/878/java-write-to-file
         (Accessed 01 December 2020)
         *    Modified:  Code refactored (Identifiers renamed)
         *****************************************************/
        File hands = new File("hands.txt");
        try {
            FileWriter saveHand = new FileWriter("hands.txt");
            saveHand.write(String.valueOf(hands));
            saveHand.close();
            System.out.println("Successfully saved hand");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("\n\nWelcome " + name + "here is your hand " + hand);

    }

}


