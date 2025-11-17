package CardGame;

public class CardGame {
    int Hearts;
    int Diamonds;
    int Clubs;
    int Spades;
    CardGame(int Hearts, int Diamonds, int Clubs, int Spades) {

        this.Hearts=Hearts;
        this.Diamonds=Diamonds;
        this.Clubs=Clubs;
        this.Spades=Spades;
    }
    
    public int compareTo(CardGame a) { 
        return  this.Diamonds - a.Diamonds;
    }
}
 