import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField screen;
    double total = -1;
    char sign = '+';

    public Calculator() {
        // Create the main frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(280, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create the display screen
        screen = new JTextField(20);
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(screen, BorderLayout.NORTH);

        // Create the grid panel for buttons
        JPanel grid = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "X",
                "1", "2", "3", "-",
                "0", "=", "CE", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setActionCommand(text);
            button.setFont(new Font("Arial", Font.BOLD, 16));

            // Set background colors based on the button type
            if ("/X-+".contains(text)) {
                button.setBackground(Color.MAGENTA); // Purple for operators
            } else if (text.equals("CE")) {
                button.setBackground(Color.YELLOW); // Yellow for "CE"
            } else if (text.equals("=")) {
                button.setBackground(Color.CYAN); // Aqua for "="
            } else {
                button.setBackground(Color.LIGHT_GRAY); // Light gray for numbers
            }

            button.setForeground(Color.BLACK); // Black text color
            button.addActionListener(this);
            grid.add(button);
        }

        frame.add(grid, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "CE" -> {
                screen.setText("");
                total = -1;
            }
            case "/" -> {
                signUpdate();
                sign = '/';
            }
            case "X" -> {
                signUpdate();
                sign = '*';
            }
            case "-" -> {
                signUpdate();
                sign = '-';
            }
            case "+" -> {
                signUpdate();
                sign = '+';
            }
            case "=" -> {
                calculate();
                screen.setText(String.valueOf(total));
                total = -1;
            }
            default -> screen.setText(screen.getText() + command);
        }
    }

    private void signUpdate() {
        if (total == -1) {
            total = Integer.parseInt(screen.getText());
        } else {
            calculate();
        }
        screen.setText("");
    }

    private void calculate() {
        double currentNumber = Integer.parseInt(screen.getText());
        switch (sign) {
            case '+' -> total += currentNumber;
            case '-' -> total -= currentNumber;
            case '*' -> total *= currentNumber;
            case '/' -> total /= currentNumber;
        }
    }
}
