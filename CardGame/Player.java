package CardGame;

import java.util.ArrayList;

public class Player {
    String playerName;
    ArrayList<Card> hand;
    public Player(String playerName) {
        hand = new ArrayList<>();
        this.playerName= playerName;
    }
    public void giveCard(Card givingCard) {
        hand.add(givingCard);
    }
}
