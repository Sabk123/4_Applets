import javax.swing.*;
import java.awt.*;

public class Unscramble {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Unscramble");
        frame.setSize(320, 140);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.YELLOW);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Unscramble!");
        titleLabel.setFont(new Font("Ravie", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JLabel instructionLabel = new JLabel("Enter the unscrambled word. Press done to check.");
        instructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(instructionLabel);

        JPanel unscramblePanel = new JPanel();
        unscramblePanel.setBackground(Color.YELLOW);
        unscramblePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel scrambledWordLabel = new JLabel("ertpuocm");
        scrambledWordLabel.setFont(new Font("Serif", Font.BOLD, 16));
        unscramblePanel.add(scrambledWordLabel);

        JTextField inputField = new JTextField(10);
        unscramblePanel.add(inputField);

        JButton doneButton = new JButton("Done");
        doneButton.setBackground(new Color(222, 13, 222));
        doneButton.setForeground(Color.YELLOW);

        unscramblePanel.add(doneButton);
        mainPanel.add(unscramblePanel);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
