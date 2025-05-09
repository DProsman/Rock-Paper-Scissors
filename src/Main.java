import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scan the input of the user
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"Rock", "Paper", "Scissors"};

        //let the player choose a number from 0 to 2
        System.out.println("Choose:\n0 (Rock)\n1 (Paper)\n2 (Scissors)");

        // check of invoer een geheel getal is
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number: 0 (Rock), 1 (Paper), or 2 (Scissors).");
            return;
        }

        int playerChoice = scanner.nextInt();

        //validate player input
        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("Invalid Choice! Please choose 0, 1, 2.");
            return;
        }

        //let the computer choose a number from 0 to 2.9999
        int computerChoice = (int) (Math.random() * 3);

        //print out both player and computer inputs
        System.out.println("Your choice: " + choices[playerChoice]);
        System.out.println("Computer Choice: " + choices[computerChoice]);

        determineWinner(computerChoice, playerChoice);
    }

    //choose a winner using else if statements
    public static void determineWinner(int computerChoice, int playerChoice) {
        //defining the tie
        if (playerChoice == computerChoice) {
            System.out.println("This is a tie!");
        }
        // defining if the player wins
        else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Player wins!");
        }
        // defining the computer wins
        else {
            System.out.println("Computer wins!");
        }
    }
}