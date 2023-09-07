import java.util.List;

public class Hand {
    private List<Card> cards;
    private HandRank rank;

    public Hand(List<Card> cards, HandRank rank){
        this.cards = cards;
        this.rank = rank;
    }

    public HandRank getRank() {
        return rank;
    }

    public List<Card> getCards() {
        return cards;
    }
}
