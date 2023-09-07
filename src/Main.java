import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Card card = new Card("5","Pikk");
        Deck deck = new Deck();

        deck.shuffle();

        System.out.println(card);
        System.out.println(deck.size());
        deck.listOfCards();

        List<Card> cards = deck.getCards();

        int amount = 3000;



        InputHandler inputHandler = new InputHandler();
        String playerName = inputHandler.setName();
        int bet = inputHandler.makeBet();
        Player player1 = new Player(playerName,amount);
        player1.placeBet(bet);
        System.out.println(player1.getBalance() + " " +player1.getName());


    }
}