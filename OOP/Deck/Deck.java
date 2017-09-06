import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    
    public Deck(){
        String[] values = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(String value : values){
            cards.add(new Card(value, "Spades"));
            cards.add(new Card(value, "Clubs"));
            cards.add(new Card(value, "Diamonds"));
            cards.add(new Card(value, "Hearts"));
        }
    }
    public void showDeck(){
        for(Card card: this.cards){
            card.showCard();
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }
}
