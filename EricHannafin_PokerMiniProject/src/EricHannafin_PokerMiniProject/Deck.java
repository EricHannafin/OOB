package EricHannafin_PokerMiniProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

      private ArrayList<Card> cards;

      public Deck()
      {
            for(int a =0; a<=3; a++)
            {
                  for(int b =0; b<=12;b++)
                  {
                        cards.add(drawRandomCard());
                  }
                  cards.addAll(cards);
            }

      }

      public Card drawRandomCard()
      {
            Random generator = new Random();
            int index = generator.nextInt(cards.size());
            return cards.remove(index);
      }
}
