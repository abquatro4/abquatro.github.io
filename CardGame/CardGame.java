package CardGame;

import java.util.ArrayList;

public class CardGame {

    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        ArrayList<Player> playerList = new ArrayList<>();

        for (int p = 1; p <= 5; p++) {
            playerList.add(new Player("Player "+p));
        }
            
        
        for (int i = 0; i < 5; i++) {
            for (Player player : playerList) {
                Card tempCard = gameDeck.drawCard();
                player.giveCard(tempCard);
            }
        }
            System.out.println(" ");

            for (Player player : playerList) {
                for (Card playerCard : player.hand) {
            System.out.println(player.playerName+ " card's "+playerCard);
                }
            }

        
    }
}
