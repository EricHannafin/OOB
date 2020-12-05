package EricHannafin_PokerMiniProject;

/**
 * This class creates a single card object with a suit and a rank
 */
public class Card {
    /**
     * Instance Variables
     */

    /*****************************************************
     *    Title:  Chapter 12  Arrays of objects
     *    Author: Samson Wu
     *    Site owner/sponsor:  https://books.trinket.io/thinkjava/chapter12.html
     *    Date: 24/1/2020
     *    Code version:
     *    Availability:  https://books.trinket.io/thinkjava/chapter12.html
     (Accessed 24 November 2020)
     *    Modified:  Code refactored (Identifiers renamed)
     *****************************************************/


    private int rank;
    private int suit;

    private String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] ranks = {"Ace", "King", "Queen", "Jack", "10",
            "9", "8", "7", "6", "5", "4", "3", "2"};

    /**
     * Card Constructor
     */
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Accessors
     */
    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    /**
     * to string method that returns a card object
     */
    public String toString() {
        return "\n" + ranks[rank] + " of " + suits[suit];

    }

}

