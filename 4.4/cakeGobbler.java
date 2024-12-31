import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    static JLabel statusBar;
    static JFrame frame;

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        frame = new JFrame("CakeGobbler");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); // Main panel with BorderLayout

        JLabel sequence = new JLabel("Which comes next in this Sequence? A, B, or C", SwingConstants.CENTER);

        // Image label
        JLabel pic = new JLabel(createImageIcon("cake.png"), SwingConstants.CENTER);

        // Button panel (for horizontal layout)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // Arrange buttons horizontally

        JButton a = new JButton("A");
        a.setBackground(Color.RED);
        a.setActionCommand("A");
        a.addActionListener(new Main());

        JButton b = new JButton("B");
        b.setBackground(Color.red);
        b.setActionCommand("B");
        b.addActionListener(new Main());

        JButton c = new JButton("C");
        c.setBackground(Color.red);
        c.setActionCommand("C");
        c.addActionListener(new Main());

        buttonPanel.add(a);
        buttonPanel.add(b);
        buttonPanel.add(c);

        statusBar = new JLabel("Rock Paper Scissors running...", SwingConstants.LEFT);
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        statusBar.setOpaque(true);
        statusBar.setBackground(Color.lightGray);
        statusBar.setForeground(Color.black);

        // Add components to the main panel
        mainPanel.add(pic, BorderLayout.NORTH);
        mainPanel.add(sequence, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Frame settings
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(statusBar, BorderLayout.PAGE_END);

        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("C")) { // I have no idea which one is correct
            statusBar.setText("Correct!");
        } else {
            statusBar.setText("Try again!");
        }
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Main.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
