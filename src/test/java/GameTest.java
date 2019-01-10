import org.junit.Before;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {
    private Game game;
    private ArrayList<Player>players;
    private Player player1;

    @Before
    public void before(){
        players = new ArrayList<>();
        game = new Game(players);
    }
}