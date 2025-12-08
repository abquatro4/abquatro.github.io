package CardGame;

import java.util.ArrayList;

public class Player {
    ArrayList<Card> hand;
    public Player() {
        hand = new ArrayList<>();
    }
    public void giveCard(Card givingCard) {
        hand.add(givingCard);
    }
}
