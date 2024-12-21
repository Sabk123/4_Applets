import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountMeIn extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new CountMeIn();
    }
    int count = 0;
    JLabel numberLabel;
    JButton plusButton, minusButton;

    public CountMeIn() {
        setTitle("Count Me In");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Count Me In", SwingConstants.CENTER);
        titleLabel.setBounds(50, 10, 200, 30); // Positioning
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);

        numberLabel = new JLabel("0", SwingConstants.CENTER);
        numberLabel.setBounds(75, 60, 150, 50); // Increased width for double/triple digits
        numberLabel.setFont(new Font("Arial", Font.BOLD, 48));
        numberLabel.setForeground(Color.BLUE);
        add(numberLabel);

        plusButton = new JButton("+");
        plusButton.setBounds(80, 140, 60, 60); // Positioning
        plusButton.setBackground(Color.GREEN);
        plusButton.setFont(new Font("Arial", Font.BOLD, 20));
        plusButton.addActionListener(this);
        add(plusButton);

        minusButton = new JButton("-");
        minusButton.setBounds(160, 140, 60, 60); // Positioning
        minusButton.setBackground(Color.RED);
        minusButton.setFont(new Font("Arial", Font.BOLD, 20));
        minusButton.addActionListener(this);
        add(minusButton);

        JLabel instructionLabel = new JLabel("Press the button, we keep count for you!", SwingConstants.CENTER);
        instructionLabel.setBounds(10, 240, 260, 30); // Centered and bold
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 13));
        add(instructionLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plusButton) {
            count++;
        } else if (e.getSource() == minusButton) {
            count--;
        }
        numberLabel.setText(String.valueOf(count)); // Update counter display
    }
}
