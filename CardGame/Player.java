package CardGame;

import java.util.ArrayList;
//This class creates the players.
public class Player {
    String playerName;
    ArrayList<Card> hand; //Makes an Arraylist for the player to store the cards.
    public Player(String playerName) {
        hand = new ArrayList<>();
        this.playerName= playerName; 
    }
    public void giveCard(Card givingCard) { //This the card that is given to the player for their hand.
        hand.add(givingCard);
    }
}
