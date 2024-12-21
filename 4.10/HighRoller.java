import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HighRoller extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new HighRoller();
    }
    JButton bmine, bcomp, next;
    JLabel action, score, pic, pic2;
    int dice1 = 0, dice2 = 0, cscore = 0, uscore = 0;

    public HighRoller() {
        // Frame setup
        setTitle("High Roller");
        setSize(335, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Title and instructions
        JLabel title = new JLabel("High Roller");
        title.setFont(new Font("Arial", Font.BOLD, 40));
        title.setForeground(Color.red);

        JLabel words = new JLabel("You roll. The computer rolls.");
        JLabel morewords = new JLabel("Higher roll wins.");

        JLabel mine = new JLabel("Your dice");
        mine.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel comp = new JLabel("Comp dice");
        comp.setFont(new Font("Arial", Font.BOLD, 18));

        // First dice images
        pic = new JLabel(createImageIcon("dice1.png")); // Placeholder for dice image
        pic2 = new JLabel(createImageIcon("dice1.png")); // Placeholder for dice image

        // Buttons
        bmine = new JButton("ROLL Mine");
        bmine.setActionCommand("1");
        bmine.addActionListener(this);

        bcomp = new JButton("ROLL Comp");
        bcomp.setActionCommand("2");
        bcomp.addActionListener(this);
        bcomp.setEnabled(false);

        next = new JButton("Play again.");
        next.setActionCommand("3");
        next.addActionListener(this);
        next.setEnabled(false);

        action = new JLabel("Roll your dice to begin.");
        action.setFont(new Font("Arial", Font.BOLD, 18));

        score = new JLabel("Score: You 0, Computer 0");

        Panel p = new Panel();
        p.add(mine);
        p.add(pic);
        p.add(bmine);
        p.setBackground(new Color(0, 128, 192));

        Panel p2 = new Panel();
        p2.add(comp);
        p2.add(pic2);
        p2.add(bcomp);
        p2.setBackground(new Color(136, 0, 21));

        add(title);
        add(words);
        add(morewords);
        add(p);
        add(p2);
        add(action);
        add(next);
        add(score);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("1")) { // Triggers user rolling
            dice1 = rollDice();
            pic.setIcon(createImageIcon("dice" + dice1 + ".png"));
            bmine.setEnabled(false);
            bcomp.setEnabled(true);
            action.setText("Now roll the computer's dice!");
        } else if (e.getActionCommand().equals("2")) { // Triggers computer rolling
            dice2 = rollDice();
            pic2.setIcon(createImageIcon("dice" + dice2 + ".png"));
            bcomp.setEnabled(false);
            next.setEnabled(true);

            if (dice1 == dice2) {
                action.setText("It's a tie!");
            } else if (dice1 > dice2) {
                action.setText("You win!");
                uscore++;
            } else {
                action.setText("Computer wins!");
                cscore++;
            }
            score.setText("Score: You " + uscore + ", Computer " + cscore);
        } else if (e.getActionCommand().equals("3")) { // Makes it play again
            dice1 = 0;
            dice2 = 0;
            pic.setIcon(createImageIcon("dice1.png"));
            pic2.setIcon(createImageIcon("dice1.png"));
            bmine.setEnabled(true);
            bcomp.setEnabled(false);
            next.setEnabled(false);
            action.setText("Roll your dice to begin.");
        }
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1; // Random number between 1 and 6
    }

    private ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

}
