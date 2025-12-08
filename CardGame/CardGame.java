package CardGame;

public class CardGame {

    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        for (int i = 0; i < 5; i++) {
            System.out.println("player 1 card's "+gameDeck.drawCard());
        }
    }
}
