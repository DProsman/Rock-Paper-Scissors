public class Gamelogic {

    public static String[] choices = {"Rock", "Paper", "Scissors"};

    public static String determineWinner(int computerChoice, int playerChoice) {
        if (playerChoice == computerChoice) {
            return "This is a tie!";
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }

    public static int GetComputerChoice() {
        return (int) (Math.random() * 3);
    }
}
