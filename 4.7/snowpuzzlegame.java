import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowPuzzleGame {

     JFrame frame;
     JLabel imageLabel;
     JTextField inputField;
     JButton guessButton;
     JLabel messageLabel;

     String[] images = {"hp1.jpg", "hp2.jpg", "hp3.jpg", "hp4.jpg", "hp5.jpg", "hp6.jpg"};
     String[] answers = {"F1", "E4", "D11", "D6", "A12", "C8"};

     int currentIndex = 0;

    public SnowPuzzleGame() {
        // Set up the main frame
        frame = new JFrame("Hidden Pictures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Main panel for vertical stacking
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Title
        JLabel titleLabel = new JLabel("Hidden Pictures", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        // Grid image
        JLabel gridLabel = new JLabel(createImageIcon("hp_grid.jpg"));
        gridLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(gridLabel);

        // Instruction
        JLabel instructionLabel = new JLabel("Find the square in the picture.", JLabel.CENTER);
        instructionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);
        instructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(instructionLabel);

        // Input area
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel locationLabel = new JLabel("Location: ");
        inputPanel.add(locationLabel);

        JLabel currentImageLabel = new JLabel();
        loadImage(currentIndex, currentImageLabel);
        inputPanel.add(currentImageLabel);

        inputField = new JTextField(5);
        inputPanel.add(inputField);

        guessButton = new JButton("Guess?");
        guessButton.addActionListener(new GuessButtonListener(currentImageLabel));
        inputPanel.add(guessButton);

        mainPanel.add(inputPanel);

        // Image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        loadImage(currentIndex, imageLabel);

        // Message panel
        messageLabel = new JLabel("Enter the location (e.g., E11) and press Guess!", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(messageLabel);

        frame.add(mainPanel, BorderLayout.CENTER);

        // Set up the frame size and make it visible
        frame.setSize(500, 700); // Increased height for better fit
        frame.setVisible(true);
    }

    private void loadImage(int index, JLabel targetLabel) {
        ImageIcon icon = createImageIcon(images[index]);
        if (icon != null) {
            targetLabel.setIcon(icon);
        } else {
            targetLabel.setText("Image not found");
        }
    }

    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SnowPuzzleGame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private class GuessButtonListener implements ActionListener {
        private JLabel currentImageLabel;

        public GuessButtonListener(JLabel currentImageLabel) {
            this.currentImageLabel = currentImageLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String userGuess = inputField.getText().trim().toUpperCase();
            if (userGuess.equals(answers[currentIndex])) {
                JOptionPane.showMessageDialog(frame, "That's Right! Try the next one!", "Right!", JOptionPane.INFORMATION_MESSAGE);
                currentIndex++;

                if (currentIndex >= images.length) {
                    JOptionPane.showMessageDialog(frame, "That's Right!\nYou have completed the game. \nThe game will start over.", "Game Completed", JOptionPane.INFORMATION_MESSAGE);
                    currentIndex = 0;
                }
                loadImage(currentIndex, currentImageLabel);
                loadImage(currentIndex, imageLabel);
                inputField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "That's Wrong! Try Again.", "Wrong!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new SnowPuzzleGame();
    }
}
