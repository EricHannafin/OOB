package EricHannafin_PokerMiniProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    // creating a deck of cards named deck
    private ArrayList<Card> deck;

    Deck() {
        deck = new ArrayList<Card>();
        for(int i=0; i<4; i++)
        {
            for(int j=1; j<=13; j++)
            {
                deck.add(new Card(i,j));
            }
        }
    }



}
