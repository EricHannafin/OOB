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
        /**
         * Calling shuffle method
         */
        deck.shuffle();
        hand = (ArrayList) deck.dealHand();
        /**
         * Save the generated hand to a file
         */
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


