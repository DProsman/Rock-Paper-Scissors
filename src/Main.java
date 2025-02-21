import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rock = 0");
        System.out.println("Paper = 1");
        System.out.println("Scissor = 2");

        Scanner scanner = new Scanner(System.in);

        final int Rock = 0;
        final int Paper = 1;
        final int Scissors = 2;
        String[] choices = {"Rock", "Paper", "Scissors"};
        //let the player choose a number from 0 to 2
        System.out.println("Choose: 0, 1, 2");
        int playerChoice = scanner.nextInt();

        //validate player input
        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("Invalid Choice! Please choose 0, 1, 2.");
            return;
        }

        //let the computer choose a number from 0 to 2.9999
        int computerChoice = (int) (Math.random() * 3);
    }
}