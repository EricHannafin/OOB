package EricHannafin_PokerMiniProject;

import java.util.*;

public class Deck {

    private ArrayList<Card> deck;
    int firstCard = 0;

    public Deck () {
        deck = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(i, j));
            }
        }
        //Shuffle the deck after it is created
        Collections.shuffle(deck);
    }
    //Draw the top card from the deck and increment
    public Card dealCard() {

        return deck.get(firstCard++);
    }

    //Prints the deck of cards
    public void printDeck(){
        System.out.println(deck);
    }

}
