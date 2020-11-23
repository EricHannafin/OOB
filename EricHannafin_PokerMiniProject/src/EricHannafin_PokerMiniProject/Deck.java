package EricHannafin_PokerMiniProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // an array that can hold 52 cards
    private Card deck[];

    public Deck () {
        deck = new Card[52];
        int i = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[i] = new Card(suit, rank);
                i++;
            }

        }


    }
}
