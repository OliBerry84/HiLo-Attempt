import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Cards cards;

    @Before
    public void before(){
        cards = new Cards(Rank.JACK, Suit.CLUBS);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.CLUBS, cards.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.JACK, cards.getRank());
    }

    @Test
    public void canGetValue(){
        assertEquals(11, cards.getValueFromEnum());
    }
}
