import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card>cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void populate(){
        for(SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                this.cards.add(new Card(suit, rank));
            }
        }
    }

    public int getCardCount(){
        return this.cards.size();
    }


    public Card deal() {
        return this.cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
