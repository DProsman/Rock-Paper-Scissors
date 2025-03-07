import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rock = 0");
        System.out.println("Paper = 1");
        System.out.println("Scissor = 2");

        //scan the input of the user
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

        //print out both player and computer inputs
        System.out.println("Your choice: " + playerChoice);
        System.out.println("Computer Choice: " + computerChoice);

        determineWinner(playerChoice, computerChoice);
    }

    //choose a winner using else if statements
    public static void determineWinner(int computerChoice, int playerChoice) {
        //defining the tie
        if (playerChoice == computerChoice) {
            System.out.println("This is a tie!");
        }
        // defining if the player wins
        else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 0 && computerChoice == 1) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Player wins!");
        }
        // defining the computer wins
        else {
            System.out.println("Computer wins!");
        }
    }
}