package EricHannafin_PokerMiniProject;

import java.util.Arrays;
import java.util.Random;

public class Card {

    private String suit, value;

    private String[] cardSuit = {"diamonds","spades","clubs","hearts"};
    private String[] cardValue = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public Card(String[] cardSuit, String[] cardValue) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }
    

    public String getCardSuit() {
        return suit;
    }

    public String getCardValue() {
        return value;
    }

    public String toString() {
        return getCardValue() + " of " + getCardSuit() + " ";
    }
}
