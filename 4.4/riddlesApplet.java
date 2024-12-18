import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Riddles implements ActionListener {
    public static void main(String[] args) {
        new Riddles();
    }
    JLabel text; // Label to display answers
    JFrame frame; // Main JFrame

    public Riddles() {
        // Create JFrame
        frame = new JFrame("Riddles");
        frame.setSize(360, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel title = new JLabel("Riddles", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(title);

        JLabel instruction = new JLabel("Press the buttons to find the answer to the riddle.");
        instruction.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(instruction);

        // Add buttons for riddles
        addRiddleButton("What is a polygon?", "1");
        addRiddleButton("Why are the cats good at video games?", "2");
        addRiddleButton("What came after the dinosaur?", "3");
        addRiddleButton("What did 0 say to 8?", "4");
        addRiddleButton("What time does a duck wake up?", "5");
        addRiddleButton("When does a horse talk?", "6");

        // Label for displaying the answer
        text = new JLabel("The answer to the riddles will appear here.");
        text.setFont(new Font("Arial", Font.PLAIN, 16));
        text.setPreferredSize(new Dimension(320, 30));
        frame.add(text);

        // Make the frame visible
        frame.setVisible(true);
    }

    // Helper method to add buttons with riddles
    private void addRiddleButton(String riddle, String actionCommand) {
        JButton button = new JButton(riddle);
        button.setActionCommand(actionCommand);
        button.addActionListener(this);
        button.setForeground(Color.blue);
        button.setBackground(Color.orange);
        button.setPreferredSize(new Dimension(320, 38));
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(button);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) {
            text.setText("Answer: A dead parrot."); // I don't get this joke
        } else if (e.getActionCommand().equals("2")) {
            text.setText("Answer: Because they have nine lives.");
        } else if (e.getActionCommand().equals("3")) {
            text.setText("Answer: It's tail.");
        } else if (e.getActionCommand().equals("4")) {
            text.setText("Answer: Nice belt."); // Nor this
        } else if (e.getActionCommand().equals("5")) {
            text.setText("Answer: At the quack of dawn!");
        } else {
            text.setText("Answer: Whinney wants to.");
        }
    }



}
