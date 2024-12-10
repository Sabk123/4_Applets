import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Knitting extends JPanel implements ActionListener {

    public Knitting() {
        setBackground(Color.pink);
        JLabel title = new JLabel("Knitting");
        title.setFont (new Font ("Arial", Font.BOLD, 30));
        JLabel a = new JLabel("A:", SwingConstants.CENTER);
        JLabel b = new JLabel("B:", SwingConstants.CENTER);
        JLabel c = new JLabel("C:", SwingConstants.CENTER);
        JLabel d = new JLabel("D", SwingConstants.CENTER);
        JLabel pic = new JLabel(createImageIcon("knitting.png"), SwingConstants.CENTER);
        a.setFont(new Font("Arial", Font.BOLD, 20)); // I'm unsure of the font in the picture
        b.setFont(new Font("Arial", Font.BOLD, 20));
        c.setFont(new Font("Arial", Font.BOLD, 20));
        d.setFont(new Font("Arial", Font.BOLD, 20));


        JTextField aText = new JTextField();
        JTextField bText = new JTextField();
        JTextField cText = new JTextField();
        JTextField dText = new JTextField();
        aText.setPreferredSize(new Dimension(30, 20));
        bText.setPreferredSize(new Dimension(30, 20));
        cText.setPreferredSize(new Dimension(30, 20));
        dText.setPreferredSize(new Dimension(30, 20));


        JButton click = new JButton("Click");
        click.setBackground(Color.blue);
        click.setForeground(Color.YELLOW);
        add(title);
        add(pic);
        add(a);
        add(aText);
        add(b);
        add(bText);
        add(c);
        add(cText);
        add(d);
        add(dText);
        add(click);
    }
    public void actionPerformed(ActionEvent e) {
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Knitting.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
        public static void main(String[] args) {
            JFrame frame = new JFrame("Knitting");
            frame.setSize(560, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JComponent newContentPane = new Knitting();
            newContentPane.setOpaque(true);
            frame.setContentPane(newContentPane);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
