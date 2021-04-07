import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input1,input2,result;
        Game game = new Game();

        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player1 choice (rock, paper or scissors):");

        input1 = scanner.next();
        game.Invalid_validation(input1);
        System.out.println("Enter Player2 choice (rock, paper or scissors):");
        input2 = scanner.next();
        game.Invalid_validation(input2);

        result=game.WinOrLoss(input1,input2);
        System.out.println(result);
    }
}
