import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.YELLOW);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Tic Tac Toe!");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);

        JLabel instructions = new JLabel("X has the next move. Click in");
        instructions.setFont(new Font("Serif", Font.PLAIN, 14));
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(instructions);

        // Added for better adjustment and readability
        JLabel instructions2 = new JLabel("the WORST place they could go");
        instructions2.setFont(new Font("Serif", Font.PLAIN, 14));
        instructions2.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(instructions2);

        // Create the button grid panel
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3, 5, 5)); // 5 pixel gaps between buttons
        gridPanel.setBackground(Color.YELLOW);
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // "Padding" around the grid

        JButton button1 = new JButton("1");
        button1.setBackground(Color.LIGHT_GRAY);
        button1.setForeground(Color.BLACK);
        button1.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button1);

        JButton button2 = new JButton("2");
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setForeground(Color.BLACK);
        button2.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button2);

        JButton button3 = new JButton("3");
        button3.setBackground(Color.LIGHT_GRAY);
        button3.setForeground(Color.BLACK);
        button3.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button3);

        JButton button4 = new JButton("4");
        button4.setBackground(Color.LIGHT_GRAY);
        button4.setForeground(Color.BLACK);
        button4.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button4);

        JButton buttonO = new JButton("O");
        buttonO.setBackground(Color.RED);
        buttonO.setForeground(Color.YELLOW);
        buttonO.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(buttonO);

        JButton button5 = new JButton("5");
        button5.setBackground(Color.LIGHT_GRAY);
        button5.setForeground(Color.BLACK);
        button5.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button5);

        JButton button6 = new JButton("6");
        button6.setBackground(Color.LIGHT_GRAY);
        button6.setForeground(Color.BLACK);
        button6.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button6);

        JButton buttonX = new JButton("X");
        buttonX.setBackground(Color.BLUE);
        buttonX.setForeground(Color.GREEN);
        buttonX.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(buttonX);

        JButton button7 = new JButton("7");
        button7.setBackground(Color.LIGHT_GRAY);
        button7.setForeground(Color.BLACK);
        button7.setPreferredSize(new Dimension(40, 40));
        gridPanel.add(button7);

        mainPanel.add(gridPanel);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
