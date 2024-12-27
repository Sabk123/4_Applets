import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BirdsPuzzle implements ActionListener {
    public static void main(String[] args) {
        new BirdsPuzzle();
    }
     JFrame frame;
     JPanel cardPanel;
     CardLayout cardLayout;
     JTextField answerField;
     JLabel statusLabel;

    public BirdsPuzzle() {
        // Main frame setup
        frame = new JFrame("Birds Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 570);
        frame.setLayout(new BorderLayout());

        // Card layout for switching screens
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Screen 1 setup
        JPanel screen1 = new JPanel(new BorderLayout());

        // Top part for screen 1
        JPanel topPanel1 = new JPanel(new BorderLayout());
        JLabel instruction1 = new JLabel("Look carefully at the picture. When done, press next.");
        JButton nextButton = new JButton("Next");
        nextButton.setPreferredSize(new Dimension(80, 30));
        nextButton.setBackground(Color.LIGHT_GRAY);
        nextButton.setActionCommand("next");
        nextButton.addActionListener(this);
        topPanel1.add(instruction1, BorderLayout.CENTER);
        topPanel1.add(nextButton, BorderLayout.EAST);

        // Bottom part for screen 1
        JPanel bottomPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel questionLabel1 = new JLabel("Which bird is missing?");
        answerField = new JTextField(15);
        JButton rightButton1 = new JButton("Right?"); // This will NOT work unless if you're on screen 2, as per the image provided
        rightButton1.setPreferredSize(new Dimension(80, 30));
        rightButton1.setBackground(Color.LIGHT_GRAY);
        rightButton1.setActionCommand("check");
        rightButton1.addActionListener(this);
        bottomPanel1.add(questionLabel1);
        bottomPanel1.add(answerField);
        bottomPanel1.add(rightButton1);

        // Add components to screen 1
        JLabel birdImage1 = new JLabel(createImageIcon("birds1.jpg"));
        screen1.add(topPanel1, BorderLayout.NORTH);
        screen1.add(birdImage1, BorderLayout.CENTER);
        screen1.add(bottomPanel1, BorderLayout.SOUTH);



        // Screen 2 setup
        JPanel screen2 = new JPanel(new BorderLayout());

        // Top part for screen 2
        JPanel topPanel2 = new JPanel(new BorderLayout());
        JLabel instruction2 = new JLabel("Try to remember which bird flew away.");
        JButton backButton = new JButton("Back");
        backButton.setPreferredSize(new Dimension(80, 30));
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.setActionCommand("back");
        backButton.addActionListener(this);
        topPanel2.add(instruction2, BorderLayout.CENTER);
        topPanel2.add(backButton, BorderLayout.EAST);

        // Bottom part for screen 2
        JPanel bottomPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel questionLabel2 = new JLabel("Which bird is missing?");
        answerField = new JTextField(15);
        JButton rightButton2 = new JButton("Right?");
        rightButton2.setPreferredSize(new Dimension(80, 30));
        rightButton2.setBackground(Color.LIGHT_GRAY);
        rightButton2.setActionCommand("check");
        rightButton2.addActionListener(this);
        bottomPanel2.add(questionLabel2);
        bottomPanel2.add(answerField);
        bottomPanel2.add(rightButton2);

        // Add components to screen 2
        JLabel birdImage2 = new JLabel(createImageIcon("birds2.jpg"));
        screen2.add(topPanel2, BorderLayout.NORTH);
        screen2.add(birdImage2, BorderLayout.CENTER);
        screen2.add(bottomPanel2, BorderLayout.SOUTH);

        // Add screens to card layout
        cardPanel.add(screen1, "screen1");
        cardPanel.add(screen2, "screen2");
        frame.add(cardPanel, BorderLayout.CENTER);
        // Status bar at the bottom
        statusLabel = new JLabel("Birds running...");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("next")) {
            cardLayout.show(cardPanel, "screen2");
        } else if (command.equals("back")) {
            cardLayout.show(cardPanel, "screen1");
        } else if (command.equals("check")) {
            String answer = answerField.getText().trim().toLowerCase();
            if (answer.equals("long bill") || answer.equals("longbill")) { // I'm like 99% sure its long bill
                statusLabel.setText("Correct! The missing bird is the Long Bill.");
            } else {
                statusLabel.setText("Incorrect! Try again.");
            }
        }
    }

    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = BirdsPuzzle.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
