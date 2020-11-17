package EricHannafin_PokerMiniProject;

import java.util.Arrays;
import java.util.Random;

public class Card {

    private String suit, rank;

    private String[] cardSuit = {"diamonds","spades","clubs","hearts"};
    private String[] cardNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Card(String[] cardSuit, String[] cardNum) {
        this.cardNum = cardNum;
        this.cardSuit = cardSuit;
    }

    public String[] getCardSuit() {
        return cardSuit;
    }

    public String[] getCardNum() {
        return cardNum;
    }


    public String toString() {
        return getCardNum() + " of " + getCardSuit() + " ";
    }
}
