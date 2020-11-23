package EricHannafin_PokerMiniProject;

import java.util.Arrays;
import java.util.Random;

public class Card
{

    private int rank;
    private int suit;

    private static final int SPADES   = 0;
    private static final int HEARTS   = 1;
    private static final int CLUBS    = 2;
    private static final int DIAMONDS = 3;

    private static final int TWO      = 2;
    private static final int THREE    = 3;
    private static final int FOUR     = 4;
    private static final int FIVE     = 5;
    private static final int SIX      = 6;
    private static final int SEVEN    = 7;
    private static final int EIGHT    = 8;
    private static final int NINE     = 9;
    private static final int TEN      = 10;
    private static final int JACK     = 11;
    private static final int QUEEN    = 12;
    private static final int KING     = 13;
    private static final int ACE      = 14;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }


    public int getRank()
    {
        return rank;
    }

    public int getSuit()
    {
        return suit;
    }


    public String rankToString() {
        switch (rank) {
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
            case 4:
                return "5";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
               return   "King";
            case 14:
                return  "Ace";
        }
        return null;
    }

    public String suitToString() {
        switch (suit) {
            case SPADES:
                return "Clubs";
            case HEARTS:
                return "Diamonds";
            case CLUBS:
                return "Hearts";
            case DIAMONDS:
                return "Spades";
        }
        return null;
    }

    public String toString()
    {
        return rankToString() + " of " + suitToString();
    }
}

