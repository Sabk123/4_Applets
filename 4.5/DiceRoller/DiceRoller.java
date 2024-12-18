import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRoller implements ActionListener {
    public static void main(String[] args) {
        new DiceRoller();
    }
     JFrame frame;
     JLabel titleLabel;
    JLabel diceImage;
    JButton rollButton;
    Random random = new Random();

    public DiceRoller() {
        frame = new JFrame("dice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(180, 250); // Small rectangular size
        frame.setLayout(new BorderLayout());

        titleLabel = new JLabel("Click to roll the dice", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(titleLabel, BorderLayout.NORTH);

        diceImage = new JLabel();
        diceImage.setHorizontalAlignment(SwingConstants.CENTER);
        diceImage.setIcon(createImageIcon("dice1.png")); // Default dice face
        diceImage.setPreferredSize(new Dimension(100, 100));
        frame.add(diceImage, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        rollButton = new JButton("Roll");
        rollButton.setPreferredSize(new Dimension(60, 30));
        rollButton.setActionCommand("roll");
        rollButton.addActionListener(this);
        rollButton.setFont(new Font("Arial", Font.PLAIN, 12));
        buttonPanel.add(rollButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("roll")) {
            int randNum = random.nextInt(6) + 1;
            diceImage.setIcon(createImageIcon("dice" + randNum + ".png"));
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = DiceRoller.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
