package clubs_trump.classes;

import java.util.ArrayList;

public class Deck {

  public ArrayList<Card> deck = new ArrayList<>();
  final String[] suits = { " - Clubs", " - Spades", " - Hearts", " - Daimonds" };

  public Deck() {
    for (String suit : suits) {
      for (int i = 0; i < 13; i++) {
        switch (i) {
          case 0:
            deck.add(new Card("Ace" + suit));
            break;
          case 12:
            deck.add(new Card("King" + suit));
            break;
          case 11:
            deck.add(new Card("Queen" + suit));
            break;
          case 10:
            deck.add(new Card("Jack" + suit));
            break;

          default:
            deck.add(new Card(String.valueOf(i) + suit));
            break;
        }
      }
    }
  }

  public ArrayList<Card> shuffle() {
    return this.deck;
  }
}
