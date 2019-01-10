public class Player {

    private Card currentCard;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return this.currentCard;
    }

    public void getCardFromDeck(Deck deck) {
        currentCard = deck.deal();
    }
}
