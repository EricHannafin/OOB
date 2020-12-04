package EricHannafin_PokerMiniProject;

import java.util.*;

public class Deck {

    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    int firstCard = 0;

    //Create a new deck of cards
    public Deck () {
        deck = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j < 13; j++) {
                deck.add(new Card(i, j));
            }
        }
        //Shuffle the deck after it is created using the shuffle collection
       // Collections.shuffle(deck);
    }

    //Draw the top card from the deck and increment
    public Card dealCard() {
        return deck.get(firstCard++);
    }

    //add 5 cards from the deck to create hand
    public List<Card> dealHand(){
        hand = new ArrayList<>();
        for(int i=0; i<5; i++){

            hand.add(deck.get(firstCard++));
        }
        System.out.println(hand);
        return hand;
    }

    //Method to shuffle deck of cards
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int j = rand.nextInt(52);
            int k = rand.nextInt(52);
            Card temp = deck.get(j);
            deck.set(j, deck.get(k));
            deck.set(k, temp);
        }
    }
    //Prints the deck of cards
    public void printDeck(){
        System.out.println(deck);
    }

}
