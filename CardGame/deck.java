package CardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck { //this class creates the deck.
ArrayList<Card> cards;
static final List<String> SUITS = List.of("Spades", "Hearts", "Diamonds", "Clubs"); //Card types list.
    public Deck() {
        cards=new ArrayList<Card>(); 
        for (int i = 1; i <= 13; i++) { //Makes 52 cards (13 of each type)
            for (String cardSuit : SUITS) {
                 Card newCard = new Card(i, cardSuit);
                cards.add(newCard); //adds them to the array.
            }
           
        }
        System.err.println("All cards");
        for (Card card: cards) { //Prints the deck.
            System.out.println(card);
        }
        
    }
     public Card drawCard() { //This method randomly selects a card while also keeping track of that selected card and removing it.
        Random random_method = new Random();
        int index = random_method.nextInt(cards.size());
        Card tempcard= cards.remove (index);   
        return tempcard; //Returns the random card.
    }
}
