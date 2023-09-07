import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    public int compare(Card card1, Card card2){
        int rankComparison = card1.getRank().compareTo(card2.getRank());
        if (rankComparison == 0){
            return card1.getSuit().compareTo(card2.getSuit());
        }
        return rankComparison;
    }
}
