import java.util.List;

public class OutputHandler {
    public void displayPlayerHand(Player player){
        System.out.println("Játékos " + player.getName() + " keze: ");
        for (Card card: player.getHand()){
            System.out.print(card.toString() + " ");
        }
        System.out.println();
    }

    public static void displayFirstThreeCommunityCards(List<Card> communityCards){
        System.out.println("Első három közösségi kártya: ");
        for (int i = 0; i < 3; i++){
            System.out.print(communityCards.get(i).toString() + " ");
        }
        System.out.println();
    }
    public static void displayFourthCommunityCard(List<Card> communityCards){
        System.out.println("Közösségi kártyák: ");
        for (int i = 0; i < 4; i++){
            System.out.print(communityCards.get(i).toString() + " ");
        }
        System.out.println();
    }
    public static void displayFifthCommunityCard(List<Card> communityCards){
        System.out.println("Közösségi kártyák: ");
        for (int i = 0; i < 5; i++){
            System.out.print(communityCards.get(i).toString() + " ");
        }
        System.out.println();
    }

    public static void displayWinner(Player winner){
        System.out.println("A nyertes játékos: " + winner.getName());
    }
}
