import javax.swing.*;
import java.awt.*;

public class MixedUpLetters {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MixedUpLetters");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.YELLOW);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Mixed up letters");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JLabel questionLabel = new JLabel("Which one is missing a pair?");
        questionLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        questionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(questionLabel);

        JPanel gridPanel = new JPanel(new GridBagLayout());
        gridPanel.setBackground(Color.YELLOW);

        // Creating a layout for the buttons
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Spaces between the button

        // Array for buttons for the for loop
        String[][] labels = {
                {"A", "D", "A"},
                {"E", "B", "C"},
                {"D", "C", "B"}
        };
        // Colors array in a X pattern (the X is red)
        Color[][] colors = {
                {Color.RED, Color.DARK_GRAY, Color.RED},
                {Color.DARK_GRAY, Color.RED, Color.DARK_GRAY},
                {Color.RED, Color.DARK_GRAY, Color.RED}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton(labels[i][j]); // Creating the buttons
                button.setBackground(colors[i][j]); // Making the button colors depend on the color array, easily making it use the x pattern
                button.setForeground(Color.WHITE);
                button.setPreferredSize(new Dimension(50, 50));
                gbc.gridx = j;
                gbc.gridy = i;
                gridPanel.add(button, gbc);
            }
        }

        // Add the grid panel to the main panel
        mainPanel.add(gridPanel);
        // Add the main panel to the frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
