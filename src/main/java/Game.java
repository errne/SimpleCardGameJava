import java.util.ArrayList;

public class Game {
    private ArrayList<Player>players;
    private Deck deck;

    public Game(ArrayList<Player> players) {
        this.players = players;
        this.deck = new Deck();
        deck.populate();
        deck.shuffle();
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public int deckCarcdCount() {
        return this.deck.getCardCount();
    }

    public void dealToPlayers() {
        for (Player player : this.players){
            player.getCardFromDeck(this.deck);
        }
    }

    public Player findWinner() {
        Player player1 = this.players.get(0);
        Player player2 = this.players.get(1);

        if(player1.getCurrentCardValue() > player2.getCurrentCardValue()){
            return player1;
        } else if (player2.getCurrentCardValue() > player1.getCurrentCardValue()){
            return player2;
        } else {
            return null;
        }
    }

}
