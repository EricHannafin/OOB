package EricHannafin_PokerMiniProject;

import java.util.*;

/**
 * This class generates, deals, shuffles and prints a deck of cards
 */

public class Deck {

    /**
     * Instance Variables
     */

    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    int firstCard = 0;

    /**
     * Method to create a deck of cards.
     */
    public Deck() {
        deck = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    /**
     * Method that deals the top card from the deck
     */
    public Card dealCard() {
        return deck.get(firstCard++);
    }

    /**
     * Method that deals 5 cards from the deck to a hand
     */
    public List<Card> dealHand() {
        hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            hand.add(deck.get(firstCard++));
        }
        return hand;
    }

    /**
     * Method to shuffle a deck of cards
     */
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int j = rand.nextInt(52);
            int k = rand.nextInt(52);
            Card temp = deck.get(j);
            deck.set(j, deck.get(k));
            deck.set(k, temp);
        }
    }

    /**
     * Method to print the deck of cards
     */
    public void printDeck() {
        System.out.println(deck);
    }

}
