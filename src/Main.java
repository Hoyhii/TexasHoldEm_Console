import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Card card = new Card("5","Pikk");
        Deck deck = new Deck();

        deck.shuffle();

        System.out.println(card);
        System.out.println(deck.size());
        deck.listOfCards();

        Scanner sc = new Scanner(System.in);
        System.out.println("Adj nevet");
        String playerName = sc.nextLine();
        System.out.println("Összeg");
        int amount = sc.nextInt();
        Player player1 = new Player(playerName,amount);
        System.out.println(player1.getBalance() + " " +player1.getName());
    }
}