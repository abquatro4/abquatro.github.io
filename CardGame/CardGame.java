package CardGame;

import java.util.ArrayList;

public class CardGame { //This class is where the stuff happens and the game begins.

    public static void main(String[] args) { 
        Deck gameDeck = new Deck(); //This runs the Deck class and creates a new deck.
        ArrayList<Player> playerList = new ArrayList<>(); //This creates a list of the players.

        for (int p = 1; p <= 5; p++) { //This loop using the player class makes 5 players.
            playerList.add(new Player("Player "+p)); //Here a new player is added with their number.
        }
            
        
        for (int i = 0; i < 5; i++) { //This gives the players 5 cards.
            for (Player player : playerList) {
                Card tempCard = gameDeck.drawCard();
                player.giveCard(tempCard);
            }
        }
            System.out.println(" ");

            for (Player player : playerList) { //Here is where the player's hands are printed.
                for (Card playerCard : player.hand) {
            System.out.println(player.playerName+ " card's "+playerCard); //This line states the player's name and their cards.
                }
            }

        
    }
}
