import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public String setName(){
        System.out.println("Kérem, adja meg a nevét: ");
        return scanner.nextLine();
    }
    public int makeBet(){
        System.out.println("Kérem adjon meg egy tétet: ");
        while(!scanner.hasNextInt()){
            System.out.println("A tétnek pozitív egész számnak kell lennie.");
            System.out.println("Próbálja újra megadni a tétet: ");
            scanner.next();
        }
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

}
