import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DeckTest {
    private Deck deck, deck2;
    @Before
    public void before(){
        deck = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void deckInitiallyEmpty(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canPopulateDeck(){
        deck.populate();
        assertEquals(52, deck.getCardCount());
    }

    @Test
    public void canDealCard(){
        deck.populate();
        deck.deal();
        assertEquals(51, deck.getCardCount());
    }

    @Test
    public void canShuffle(){
        deck.populate();
        deck2.populate();
        deck.shuffle();
        deck2.shuffle();
        assertFalse(deck==deck2);

    }
}
