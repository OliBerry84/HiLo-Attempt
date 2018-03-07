import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Cards> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public void getAllCards(){
        for (Rank rank : Rank.values())
            for (Suit suit : Suit.values())
                deck.add(new Cards(rank, suit));
    }

    public int getCardCount(){
        return this.deck.size();
    }

    public Cards getCardAtIndex(int index){
        return this.deck.get(index);
    }

    public Cards getRandomCard(){
        Collections.shuffle(this.deck);
        return getCardAtIndex(0);
    }


}