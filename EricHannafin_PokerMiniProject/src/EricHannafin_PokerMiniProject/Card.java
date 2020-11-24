package EricHannafin_PokerMiniProject;

import java.util.Arrays;
import java.util.Random;

public class Card
{

    private int rank;
    private int suit;

    private String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] ranks = {"Ace", "King", "Queen", "Jack", "10",
            "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString()
    {
        return ranks[rank] + " of " + suits[suit];

    }

}

