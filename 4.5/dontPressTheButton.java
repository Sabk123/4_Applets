import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dontPressTheButton implements ActionListener {
    public static void main(String[] args) {
        new dontPressTheButton();
    }

    int count = 0;
    JLabel text;
    public static String[] MESSAGES = { // Array for the messages, it'll be easy to sort through it
            "*Ahem* Do NOT press the red button.",
            "Don't do it.",
            "Seriously.",
            "Not this again.",
            "...you pressed it again. Do NOT press the button.",
            "...this displeases me.",
            "Quick! What's that behind you.",
            "All right, press it again. See if I care.",
            "Again.",
            "Do it again.",
            "Click it!",
            "And again.",
            "OK, that's enough. You've got your fill.",
            "I mean it. It's time to stop pressing it.",
            "You see, this is why we can't be friends.",
            "You are just too selfish.",
            "Now you've asked for it. DoNoT pReSs It AgAiN!",
            "You seem immune to my mind control.",
            "Time for plan B. Press it. You know you want to.",
            "See that was reverse psychology! Oh wait, it didn't work.",
            "Really? aren't you getting bored yet?",
            "Don't you have anything else to do?"
    };

    public dontPressTheButton() {
        JFrame frame = new JFrame("Do Not Press the Red Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setLayout(new BorderLayout());

        // Create the button with the image
        JButton button = new JButton(createImageIcon("redButton.jpg"));
        button.addActionListener(this);
        frame.add(button, BorderLayout.CENTER);

        // Display the messages at bottom
        text = new JLabel(MESSAGES[0], SwingConstants.CENTER);
        text.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(text, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        if (count < MESSAGES.length) {
            text.setText(MESSAGES[count]);
        } else {
            text.setText("*Ahem* Do NOT press the red button.");
            count = 0; //
            System.out.println("Restarted"); // I added this to show in the terminal when it restarts for easier debugging
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = dontPressTheButton.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}

