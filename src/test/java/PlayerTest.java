import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    private Player player;
    private Deck deck;
    private Card firstCard;

    @Before
    public void before(){
        player = new Player("Not Ernst");
        deck = new Deck();
        deck.populate();
        firstCard = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void hasName(){
        assertEquals("Not Ernst", player.getName());
    }

    @Test
    public void hasCard(){
        assertNull(player.getCard());
    }

    @Test
    public void canGetCardFromDeck(){
        player.getCardFromDeck(deck);
        assertEquals(51, deck.getCardCount());
        assertNotNull(player.getCard());
        assertEquals(firstCard.getRank(), player.getCard().getRank());
        assertEquals(firstCard.getSuit(), player.getCard().getSuit());
    }
}
