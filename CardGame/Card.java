package CardGame;

public class Card {
//In this class the basic information for creating a card is made.
    int value;
    String suit;
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    @Override
    public String toString() { //This returns the card information in a readable way.
        return ""+ value+" "+suit;
    }
}
