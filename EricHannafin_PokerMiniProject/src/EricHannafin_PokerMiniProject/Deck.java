package EricHannafin_PokerMiniProject;

import java.lang.reflect.Array;
import java.util.*;

public class Deck {

    private ArrayList<Card> deck;

    public Deck () {
        deck = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    public void printDeck(){
        System.out.println("\n" + deck);
    }
}
