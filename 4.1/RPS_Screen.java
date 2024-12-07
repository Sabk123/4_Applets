import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RockPaperScissors implements ActionListener
{
    public static void main(String[]args){
        init();
    }
    public static void init ()
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Rock Paper Scissors");

        JLabel RPS = new JLabel("* * * * * Rock Paper Scissors * * * * *", SwingConstants.CENTER);
        RPS.setFont(new Font("Arial", Font.BOLD, 13)); // Slightly enlarges RPS, also shows that the default font is bold.
        JLabel inputname = new JLabel("Your name:", SwingConstants.CENTER);
        JLabel choose = new JLabel("Choose one. Click on Rock, Paper, or Scissors:", SwingConstants.CENTER);
        JLabel outro = new JLabel("When you are done, the computer will pick.");

        JTextField name = new JTextField(SwingConstants.RIGHT);

        JButton Rock = new JButton("Rock");
        JButton Scissors = new JButton("Scissors");
        JButton Paper = new JButton("Paper");

        JLabel statusBar = new JLabel("Rock Paper Scissors running...", SwingConstants.LEFT);
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        statusBar.setFont(new Font("Arial", Font.PLAIN, 12));
        statusBar.setOpaque(true);
        statusBar.setBackground(Color.lightGray);
        statusBar.setForeground(Color.black);

        panel.add(RPS); // Add all the widgets to the panel
        panel.add(inputname);
        panel.add(name);
        panel.add(choose);
        panel.add(Rock);
        panel.add(Paper);
        panel.add(Scissors);
        panel.add(outro);

        frame.add(statusBar, BorderLayout.PAGE_END); // Moves status bar to the bottom
        frame.add(panel);
        frame.setSize(285,190); // Changes the size (for a 1920x1080p screen)
        frame.setVisible(true);

    }

    public void actionPerformed (ActionEvent e)
    {}
}
