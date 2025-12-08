package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
ArrayList<Card> cards;
static final List<String> SUITS = List.of("Spades", "Hearts", "Diamonds", "Clubs");
    public Deck() {
        cards=new ArrayList<Card>();
        for (int i = 1; i <= 13; i++) {
            for (String cardSuit : SUITS) {
                 Card newCard = new Card(i, cardSuit);
                cards.add(newCard);
            }
           
        }
        System.err.println("All cards");
        for (Card card: cards) {
            System.out.println(card);
        }
        
    }
     public Card drawCard() {
        Random random_method = new Random();
        int index = random_method.nextInt(cards.size());
        Card tempcard= cards.remove (index);   
        return tempcard;
    }
}
