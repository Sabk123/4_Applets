import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Zoo extends JFrame implements ActionListener {
    private JPanel p_card; // to hold all of the screens
    private CardLayout cdLayout = new CardLayout();

    public Zoo() {
        p_card = new JPanel();
        p_card.setLayout(cdLayout);

        zoogate();
        chooseWhere();
        reptileHouse();
        boa();
        alligator();
        smallMammals();
        wombat();
        skunk();
        pangolin();
        outdoorPens();
        moose();
        okapi();

        setTitle("Zoo Application");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(p_card, BorderLayout.CENTER);
        setVisible(true);
    }

    public void zoogate() {
        JPanel card1 = new JPanel();
        card1.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("zoogate.png"));
        JButton next = new JButton("Enter");
        next.setPreferredSize(new Dimension(400, 50));
        next.setActionCommand("2");
        next.addActionListener(this);
        card1.add(title);
        card1.add(next);
        p_card.add("1", card1);
    }

    public void chooseWhere() {
        JPanel card2 = new JPanel();
        card2.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("chooseWhere.png"));
        JButton rept = new JButton("Reptile House");
        rept.setActionCommand("3");
        rept.addActionListener(this);
        rept.setPreferredSize(new Dimension(400, 50));
        JButton small = new JButton("Small Mammals");
        small.setActionCommand("4");
        small.addActionListener(this);
        small.setPreferredSize(new Dimension(400, 50));
        JButton out = new JButton("Outdoor Pens");
        out.setActionCommand("5");
        out.addActionListener(this);
        out.setPreferredSize(new Dimension(400, 50));
        card2.add(title);
        card2.add(rept);
        card2.add(small);
        card2.add(out);
        p_card.add("2", card2);
    }

    public void reptileHouse() {
        JPanel card3 = new JPanel();
        card3.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("reptileHouse.png"));
        JButton boa = new JButton("Boa Constrictor");
        boa.setActionCommand("6");
        boa.addActionListener(this);
        boa.setPreferredSize(new Dimension(400, 50));
        JButton ali = new JButton("Alligator");
        ali.setActionCommand("7");
        ali.addActionListener(this);
        ali.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card3.add(title);
        card3.add(boa);
        card3.add(ali);
        card3.add(entrance);
        p_card.add("3", card3);
    }

    public void smallMammals() {
        JPanel card4 = new JPanel();
        card4.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("smallMammals.png"));
        JButton wombat = new JButton("Wombat");
        wombat.setActionCommand("8");
        wombat.addActionListener(this);
        wombat.setPreferredSize(new Dimension(400, 50));
        JButton skunk = new JButton("Skunk");
        skunk.setActionCommand("9");
        skunk.addActionListener(this);
        skunk.setPreferredSize(new Dimension(400, 50));
        JButton pangolin = new JButton("Pangolin");
        pangolin.setActionCommand("10");
        pangolin.addActionListener(this);
        pangolin.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card4.add(title);
        card4.add(wombat);
        card4.add(skunk);
        card4.add(pangolin);
        card4.add(entrance);
        p_card.add("4", card4);
    }

    public void outdoorPens() {
        JPanel card5 = new JPanel();
        card5.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("outdoorPens.png"));
        JButton moose = new JButton("Moose");
        moose.setActionCommand("11");
        moose.addActionListener(this);
        moose.setPreferredSize(new Dimension(400, 50));
        JButton okapi = new JButton("Okapi");
        okapi.setActionCommand("12");
        okapi.addActionListener(this);
        okapi.setPreferredSize(new Dimension(400, 50));
        JButton entrance = new JButton("Back to the entrance");
        entrance.setActionCommand("2");
        entrance.addActionListener(this);
        entrance.setPreferredSize(new Dimension(400, 50));
        card5.add(title);
        card5.add(moose);
        card5.add(okapi);
        card5.add(entrance);
        p_card.add("5", card5);
    }

    public void boa() {
        JPanel card6 = new JPanel();
        card6.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("boa.png"));
        JButton returnBack = new JButton("Return to Reptile House");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("3");
        returnBack.addActionListener(this);
        card6.add(title);
        card6.add(returnBack);
        p_card.add("6", card6);
    }

    public void alligator() {
        JPanel card7 = new JPanel();
        card7.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("alligator.png"));
        JButton returnBack = new JButton("Return to Reptile House");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("3");
        returnBack.addActionListener(this);
        card7.add(title);
        card7.add(returnBack);
        p_card.add("7", card7);
    }

    public void wombat() {
        JPanel card8 = new JPanel();
        card8.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("wombat.png"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card8.add(title);
        card8.add(returnBack);
        p_card.add("8", card8);
    }

    public void skunk() {
        JPanel card9 = new JPanel();
        card9.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("skunk.png"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card9.add(title);
        card9.add(returnBack);
        p_card.add("9", card9);
    }

    public void pangolin() {
        JPanel card10 = new JPanel();
        card10.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("pangolin.png"));
        JButton returnBack = new JButton("Return to Small Mammals");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("4");
        returnBack.addActionListener(this);
        card10.add(title);
        card10.add(returnBack);
        p_card.add("10", card10);
    }

    public void moose() {
        JPanel card11 = new JPanel();
        card11.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("moose.png"));
        JButton returnBack = new JButton("Return to Outdoor Pens");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("5");
        returnBack.addActionListener(this);
        card11.add(title);
        card11.add(returnBack);
        p_card.add("11", card11);
    }

    public void okapi() {
        JPanel card12 = new JPanel();
        card12.setBackground(Color.white);
        JLabel title = new JLabel(createImageIcon("okapi.png"));
        JButton returnBack = new JButton("Return to Outdoor Pens");
        returnBack.setPreferredSize(new Dimension(400, 50));
        returnBack.setActionCommand("5");
        returnBack.addActionListener(this);
        card12.add(title);
        card12.add(returnBack);
        p_card.add("12", card12);
    }

    public void actionPerformed(ActionEvent e) {
        cdLayout.show(p_card, e.getActionCommand());
    }

    public static void main(String[] args) {
        new Zoo();
    }
    protected static ImageIcon createImageIcon (String path)
    {
        java.net.URL imgURL = Zoo.class.getResource (path);
        if (imgURL != null)
        {
            return new ImageIcon (imgURL);
        }
        else
        {
            System.err.println ("Couldn't find file: " + path);
            return null;
        }
        }
}
