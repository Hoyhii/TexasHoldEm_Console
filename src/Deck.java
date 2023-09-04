import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();

        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Makk", "Pikk", "Kör", "Káró"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jumbo", "Dáma", "Király", "Ász" };

        for (String suit : suits){
            for (String rank : ranks){
                cards.add(new Card(rank,suit));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        if (cards.isEmpty()){
            throw new IllegalStateException("Elfogyott a lap.");
        }
        return cards.remove(cards.size() - 1);
    }

    public void reset(){
        cards.clear();
        initializeDeck();
    }

    public int size(){
        return cards.size();
    }

    public void listOfCards(){
        for (Card card: cards){
            System.out.println(card);
        }

    }
}
