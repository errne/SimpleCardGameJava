import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private ArrayList<Player>players;
    private Player player1;
    private Player player2;
    private Card win, lose, draw;

    @Before
    public void before(){
        players = new ArrayList<>();
        player1 = new Player("Bo");
        player2 = new Player("Do");
        win = new Card(SuitType.HEARTS, RankType.KING);
        lose = new Card(SuitType.CLUBS, RankType.FOUR);
        draw = new Card(SuitType.DIAMONDS, RankType.KING);
        players.add(player1);
        players.add(player2);
        game = new Game(players);
    }

    @Test
    public void hasPlayers(){
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void hasDeck(){
        assertEquals(52, game.deckCarcdCount());
    }

    @Test
    public void canDealToPlayers(){
        game.dealToPlayers();
        assertEquals(50, game.deckCarcdCount());
    }

    @Test
    public void Player1Wins(){
        player1.getIndividualCard(win);
        player2.getIndividualCard(lose);
        assertEquals(player1, game.findWinner() );
    }

    @Test
    public void Player2Wins(){
        player1.getIndividualCard(lose);
        player2.getIndividualCard(win);
        assertEquals(player2, game.findWinner() );
    }

    @Test
    public void canHaveDraw(){
        player1.getIndividualCard(win);
        player2.getIndividualCard(draw);
        assertNull(game.findWinner());
    }
}