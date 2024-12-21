import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AncientStones implements ActionListener {
    public static void main(String[] args) {
        new AncientStones();
    }

    JLabel statusBar;

    public AncientStones() {
        JFrame frame = new JFrame("Ancient Stones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 680);
        frame.setLayout(new BorderLayout());

        JLabel stone_peru = new JLabel(createImageIcon("stone_peru.jpg"));
        stone_peru.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(stone_peru, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 10, 10)); // Easy layout maker
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] options = {"stone1.jpg", "stone2.jpg", "stone3.jpg", "stone4.jpg"}; // Array for easy image getting
        int correctOption = 2; // I'm like 99% sure the correct one is the third button, not too sure, though, can be changed if wrong, remember to use the 0 based array to fix it

        for (int i = 0; i < options.length; i++) {
            JButton button = new JButton(createImageIcon(options[i]));
            if (i == correctOption) {
                button.setActionCommand("correct");
            } else {
                button.setActionCommand("wrong");
            }
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Status bar (may not be EXACTLY the same as the one in the image, but hopefully close enough)
        statusBar = new JLabel("Click on a button to see if you are right.");
        statusBar.setHorizontalAlignment(SwingConstants.CENTER);
        statusBar.setOpaque(true); // Allow background color
        statusBar.setBackground(Color.LIGHT_GRAY); // Set background color to gray
        statusBar.setBorder(BorderFactory.createEmptyBorder(8, 0, 8, 0));
        frame.add(statusBar, BorderLayout.SOUTH);


        frame.setVisible(true);
    }

     public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if ("correct".equals(actionCommand)) {
            statusBar.setText("You got it! Good job.");
        } else {
            statusBar.setText("You are wrong. Try again.");
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = AncientStones.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
