import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int bet;
    private int balance;

    public Player(String name, int initialBalance) {
        this.name = name;
        this.hand = hand;
        this.bet = bet;
        this.balance = initialBalance;
    }


    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand){
        this.hand = hand;
    }
    public int getBet(){
        return bet;
    }
    public void resetBet(){
        bet = 0;
    }

    public void addChips(int amount){
        balance += amount;
    }

    public void placeBet(int amount){
        if (amount > balance){
            System.out.println("Nincs elég zsetonod a tétel megrakásához.");
        }else{
            bet += amount;
            balance -= amount;
        }
    }
}
