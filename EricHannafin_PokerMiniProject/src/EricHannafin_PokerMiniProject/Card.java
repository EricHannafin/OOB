package EricHannafin_PokerMiniProject;

import java.util.Arrays;

public class Card {

    private String[] cardSuit = {"diamonds","spades","clubs","hearts"};
    private String[] cardNum = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Card(String[] cardSuit, String[] cardNum) {
        this.cardSuit = cardSuit;
        this.cardNum = cardNum;
    }

    public String[] getCardSuit() {
        return cardSuit;
    }

    public String[] getCardNum() {
        return cardNum;
    }

    @Override
    public String toString() {
        return getCardNum() + " of " + getCardSuit() + " ";
    }
}
