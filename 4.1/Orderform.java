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
        JFrame frame = new JFrame("Welcome");
        JLabel welcome = new JLabel("Welcome to the order menu!", SwingConstants.CENTER);
        JLabel fries = new JLabel("Fries @ $1.50 each\n", SwingConstants.CENTER);
        JLabel burgers = new JLabel("Burgers @ $3.50 each\n", SwingConstants.CENTER);
        JLabel sodas = new JLabel("Soda's @ $1.50 each\n", SwingConstants.CENTER);
        JTextField FText = new JTextField(SwingConstants.RIGHT);
        JTextField BText = new JTextField(SwingConstants.RIGHT);
        JTextField SText = new JTextField(SwingConstants.RIGHT);
        JButton button = new JButton("Order Now!");
        panel.add(welcome);
        panel.add(fries);
        panel.add(FText);
        panel.add(burgers);
        panel.add(BText);
        panel.add(sodas);
        panel.add(SText);
        panel.add(button);
        frame.setSize(250,200); // Resize but using swing
        frame.add(panel);
        frame.show();

    }
    public void actionPerformed (ActionEvent e) { } }
