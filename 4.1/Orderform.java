import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// No applet due to deprecation
public class OrderForm implements ActionListener {
    public static void main(String[]args){
        init();
    }

    public static void init() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Orderform");
        
        JLabel welcome = new JLabel("Welcome to the order menu!", SwingConstants.CENTER); // These are the text labels
        JLabel fries = new JLabel("Fries @ $1.50 each\n", SwingConstants.CENTER);
        JLabel burgers = new JLabel("Burgers @ $3.50 each\n", SwingConstants.CENTER);
        JLabel sodas = new JLabel("Soda's @ $1.50 each\n", SwingConstants.CENTER);

        JTextField FText = new JTextField(SwingConstants.RIGHT); // These 3 lines create the user input
        JTextField BText = new JTextField(SwingConstants.RIGHT);
        JTextField SText = new JTextField(SwingConstants.RIGHT);

        JButton button = new JButton("Order Now!"); // Order now button

        JLabel statusBar = new JLabel("OrderForm running...", SwingConstants.LEFT); // Creates Status Bar
       statusBar.setBorder(BorderFactory.createEtchedBorder());
        statusBar.setFont(new Font("Arial", Font.PLAIN, 12));
        statusBar.setOpaque(true);
        statusBar.setBackground(Color.lightGray);
        statusBar.setForeground(Color.black); 

        panel.add(welcome);
        panel.add(fries);
        panel.add(FText);
        panel.add(burgers);
        panel.add(BText);
        panel.add(sodas);
        panel.add(SText);
        panel.add(button);
        panel.add(statusBar);

        frame.setSize(250,200); // Resize but using swing
        frame.add(panel);
        frame.add(statusBar, BorderLayout.PAGE_END);
        frame.setVisible(true);

    }
    public void actionPerformed (ActionEvent e) { } }
