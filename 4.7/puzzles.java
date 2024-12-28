import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleGame {

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = PuzzleGame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("TextGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 710);
        frame.setLayout(null);

        // Load images
        JLabel thiefLabel = new JLabel(createImageIcon("Puzzle_paintThief.jpg"));
        thiefLabel.setBounds(10, 10, 400, 240);
        frame.add(thiefLabel);

        JLabel orderLabel = new JLabel(createImageIcon("Puzzle_mealOrder.jpg"));
        orderLabel.setBounds(10, 235, 400, 200);
        frame.add(orderLabel);

        JLabel wildwestLabel = new JLabel(createImageIcon("Puzzle_wildwest.jpg"));
        wildwestLabel.setBounds(10, 415, 400, 235);
        frame.add(wildwestLabel);

        // Thief's color section
        JLabel thiefPrompt = new JLabel("Thief's colour:");
        thiefPrompt.setBounds(410, 100, 100, 20);
        frame.add(thiefPrompt);

        JTextField thiefInput = new JTextField();
        thiefInput.setBounds(495, 100, 100, 20);
        frame.add(thiefInput);

        JButton thiefButton = new JButton("Done");
        thiefButton.setBackground(new Color(47, 41, 41));
        thiefButton.setForeground(Color.yellow);
        thiefButton.setBounds(600, 100, 80, 20);
        frame.add(thiefButton);

        thiefButton.addActionListener(e -> {
            if (thiefInput.getText().equalsIgnoreCase("Red")) {
                JOptionPane.showMessageDialog(frame, "You got it! Great Work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "You are incorrect, please try again", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Order section
        JLabel orderPrompt = new JLabel("Order (ABC):");
        orderPrompt.setBounds(420, 320, 100, 20);
        frame.add(orderPrompt);

        JTextField orderInput = new JTextField();
        orderInput.setBounds(495, 320, 100, 20);
        frame.add(orderInput);

        JButton orderButton = new JButton("Done");
        orderButton.setBackground(Color.orange);
        orderButton.setBounds(600, 320, 80, 20);
        frame.add(orderButton);

        orderButton.addActionListener(e -> {
            if (orderInput.getText().equalsIgnoreCase("BCA")) { // I have zero idea what this is depicting... this will change the answer
                JOptionPane.showMessageDialog(frame, "You got it! Great Work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "You are incorrect, please try again", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Wild West section
        JLabel piecePrompt = new JLabel("Missing Piece Letter:");
        piecePrompt.setBounds(370, 500, 150, 20);
        frame.add(piecePrompt);

        JTextField pieceInput = new JTextField();
        pieceInput.setBounds(520, 500, 100, 20);
        frame.add(pieceInput);

        JButton pieceButton = new JButton("Done");
        pieceButton.setBackground(Color.CYAN);
        pieceButton.setBounds(630, 500, 80, 20);
        frame.add(pieceButton);

        pieceButton.addActionListener(e -> {
            if (pieceInput.getText().equalsIgnoreCase("D")) {
                JOptionPane.showMessageDialog(frame, "You got it! Great Work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "You are incorrect, please try again", "Incorrect", JOptionPane.ERROR_MESSAGE);
            }
        });
        frame.setVisible(true);
    }
}
