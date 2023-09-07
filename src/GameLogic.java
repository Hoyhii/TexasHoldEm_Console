import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameLogic {
    public static Hand rateHand(Player player, List<Card> communityCards){
        List<Card> allCards = new ArrayList<>();
        allCards.addAll(player.getHand());
        allCards.addAll(communityCards);

        Collections.sort(allCards, new CardComparator());

        Hand besthand = checkRoyalFlush(allCards);
        
        if (besthand == null){
            besthand = checkStraightFlush(allCards);
        }
        if (besthand == null){
            besthand = checkFourOfAKind(allCards);
        }
        if (besthand == null){
            besthand = checkFullHouse(allCards);
        }
        if (besthand == null){
            besthand = checkFlush(allCards);
        }
        if (besthand == null){
            besthand = checkStraight(allCards);
        }
        if (besthand == null){
            besthand = checkThreeOfAKind(allCards);
        }
        if (besthand == null){
            besthand = checkTwoPair(allCards);
        }
        if (besthand == null){
            besthand = checkOnePair(allCards);
        }
        if (besthand == null){
            besthand = checkHighCard(allCards);
        }
        return besthand;

    }

    private static Hand checkRoyalFlush(List<Card> allCards) {
        return null;
    }

    private static Hand checkStraightFlush(List<Card> allCards) {
        return null;
    }

    private static Hand checkFourOfAKind(List<Card> allCards) {
        return null;
    }

    private static Hand checkFullHouse(List<Card> allCards) {
        return null;
    }

    private static Hand checkFlush(List<Card> allCards) {
        return null;
    }

    private static Hand checkStraight(List<Card> allCards) {
        return null;
    }

    private static Hand checkThreeOfAKind(List<Card> allCards) {
        return null;
    }

    private static Hand checkTwoPair(List<Card> allCards) {
        return null;
    }

    private static Hand checkOnePair(List<Card> allCards) {

        return null;
    }

    private static Hand checkHighCard(List<Card> allCards) {
        return null;
    }


}
