import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsGUI extends JFrame {

    private JLabel resultLabel;

    public RockPaperScissorsGUI() {
        setTitle("Rock Paper Scissors");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        resultLabel = new JLabel("Choose Rock, Paper or Scissors", SwingConstants.CENTER);
        panel.add(resultLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        String[] buttonTexts = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < buttonTexts.length; i++) {
            int choice = i;
            JButton button = new JButton(buttonTexts[i]);
            button.addActionListener(e -> handlePlayerChoice(choice));
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        add(panel);
    }

    private void handlePlayerChoice(int playerChoice) {
        int computerChoice = Gamelogic.GetComputerChoice();
        String result = Gamelogic.determineWinner(computerChoice, playerChoice);

        resultLabel.setText(
                "You: " + Gamelogic.choices[playerChoice]
                        + " | Computer: " + Gamelogic.choices[computerChoice]
                        + " → " + result
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RockPaperScissorsGUI gui = new RockPaperScissorsGUI();
            gui.setVisible(true);
        });
    }
}
