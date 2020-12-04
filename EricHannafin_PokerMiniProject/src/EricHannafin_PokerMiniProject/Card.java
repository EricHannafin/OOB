package EricHannafin_PokerMiniProject;

/**
 * This class creates a single card object with a suit and a rank
 */
public class Card {
    /**
     * Instance Variables
     */
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

