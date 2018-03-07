import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canGetCardCount(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canGetAllCards(){
        deck.getAllCards();
        assertEquals(52, deck.getCardCount());
    }



}

