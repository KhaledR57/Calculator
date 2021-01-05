import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Calculator extends JFrame implements ActionListener {
    String s0, s1, s2;
    public JFrame frame;
    public JTextField l;
    public JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
            ba, bs, bd, bm, be, beq, beq1;
    public JRadioButton ON, OFF;
    public ButtonGroup G;
    public JPanel p;

    public Calculator() {
        s0 = s1 = s2 = "";
        l = new JTextField();

        //to make on/off radio buttons
        ON = new JRadioButton("ON");
        OFF = new JRadioButton("OFF");
        G = new ButtonGroup();
        G.add(ON);
        G.add(OFF);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        beq1 = new JButton("=");
        beq = new JButton("C");
        be = new JButton(".");

        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");

        frame = new JFrame();
        p = new JPanel();
        frame.setTitle("Calculator");
        frame.setSize(625, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocation(500, 80);
        frame.setResizable(false);

        p.setSize(710, 600);
        p.setLayout(null);

        ON.setBounds(30, 130, 60, 20);
        ON.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        ON.setForeground(Color.red);
        ON.addActionListener(this);

        OFF.setBounds(90, 130, 60, 20);
        OFF.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        OFF.setForeground(Color.red);
        OFF.addActionListener(this);

        l.setBounds(30, 50, 550, 40);
        l.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));

        beq.setBounds(175, 120, 260, 45);
        beq.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        beq.setBackground(new Color(240, 186, 51));
        beq.addActionListener(this);

        ba.setBounds(465, 120, 115, 45);
        ba.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        ba.setBackground(Color.gray);
        ba.addActionListener(this);

        b1.setBounds(30, 185, 115, 45);
        b1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b1.setBackground(new Color(39, 149, 149));
        b1.addActionListener(this);

        b2.setBounds(175, 185, 115, 45);
        b2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b2.setBackground(new Color(39, 149, 149));
        b2.addActionListener(this);

        b3.setBounds(320, 185, 115, 45);
        b3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b3.setBackground(new Color(39, 149, 149));
        b3.addActionListener(this);

        bs.setBounds(465, 185, 115, 45);
        bs.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        bs.setBackground(Color.gray);
        bs.addActionListener(this);

        b4.setBounds(30, 250, 115, 45);
        b4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b4.setBackground(new Color(39, 149, 149));
        b4.addActionListener(this);

        b5.setBounds(175, 250, 115, 45);
        b5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b5.setBackground(new Color(39, 149, 149));
        b5.addActionListener(this);

        b6.setBounds(320, 250, 115, 45);
        b6.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b6.setBackground(new Color(39, 149, 149));
        b6.addActionListener(this);

        bm.setBounds(465, 250, 115, 45);
        bm.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        bm.setBackground(Color.gray);
        bm.addActionListener(this);

        b7.setBounds(30, 315, 115, 45);
        b7.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b7.setBackground(new Color(39, 149, 149));
        b7.addActionListener(this);

        b8.setBounds(175, 315, 115, 45);
        b8.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b8.setBackground(new Color(39, 149, 149));
        b8.addActionListener(this);

        b9.setBounds(320, 315, 115, 45);
        b9.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b9.setBackground(new Color(39, 149, 149));
        b9.addActionListener(this);

        bd.setBounds(465, 315, 115, 45);
        bd.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        bd.setBackground(Color.gray);
        bd.addActionListener(this);

        be.setBounds(30, 380, 115, 45);
        be.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        be.setBackground(Color.gray);
        be.addActionListener(this);

        b0.setBounds(175, 380, 115, 45);
        b0.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        b0.setBackground(new Color(39, 149, 149));
        b0.addActionListener(this);

        beq1.setBounds(320, 380, 260, 45);
        beq1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        beq1.setBackground(Color.gray);
        beq1.addActionListener(this);

        frame.add(p);

        p.add(ON);
        p.add(OFF);
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);
        ON.setEnabled(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("ON")) {
            open_calc();
        } else if (s.equals("OFF")) {
            close_calc();
        } else {

            // if the value is a number
            if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                // if operand is present then add to second no
                if (!s1.equals(""))
                    s2 = s2 + s;
                else
                    s0 = s0 + s;

                // set the value of text

                l.setText(s0 + s1 + s2);
            } else if (s.charAt(0) == 'C') {
                // clear the one letter
                s0 = s1 = s2 = "";
                // set the value of text
                l.setText(s0 + s1 + s2);
            } else if (s.charAt(0) == '=') {
                try {
                    double ans = switch (s1) {
                        case "+" -> (Double.parseDouble(s0) + Double.parseDouble(s2));
                        case "-" -> (Double.parseDouble(s0) - Double.parseDouble(s2));
                        case "/" -> (Double.parseDouble(s0) / Double.parseDouble(s2));
                        default -> (Double.parseDouble(s0) * Double.parseDouble(s2));
                    };
                    // set the value of text
                    l.setText(s0 + s1 + s2 + "=" + ans);

                    // convert it to string
                    s0 = Double.toString(ans);
                    s1 = s2 = "";
                } catch (Exception ex) {
                    System.out.println(Arrays.toString(ex.getStackTrace()));
                }
            } else {
                // if there was no operand
                if (s1.equals("") || s2.equals(""))
                    s1 = s;

                    // else evaluate
                else {
                    double ans = switch (s1) {
                        case "+" -> (Double.parseDouble(s0) + Double.parseDouble(s2));
                        case "-" -> (Double.parseDouble(s0) - Double.parseDouble(s2));
                        case "/" -> (Double.parseDouble(s0) / Double.parseDouble(s2));
                        default -> (Double.parseDouble(s0) * Double.parseDouble(s2));
                    };
                    // convert it to string
                    s0 = Double.toString(ans);
                    // place the operator
                    s1 = s;
                    // make the operand blank
                    s2 = "";
                }
                // set the value of text
                l.setText(s0 + s1 + s2);
            }
        }
    }

    public void open_calc() {
        l.setEnabled(true);
        ON.setEnabled(false);
        OFF.setEnabled(true);
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        ba.setEnabled(true);
        bs.setEnabled(true);
        beq1.setEnabled(true);
        beq.setEnabled(true);
        bm.setEnabled(true);
        be.setEnabled(true);
        bd.setEnabled(true);
    }

    public void close_calc() {
        s0 = s1 = s2 = "";
        l.setText(s0 + s1 + s2);
        l.setEnabled(false);
        ON.setEnabled(true);
        OFF.setEnabled(false);
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        ba.setEnabled(false);
        bs.setEnabled(false);
        beq1.setEnabled(false);
        beq.setEnabled(false);
        bm.setEnabled(false);
        be.setEnabled(false);
        bd.setEnabled(false);
    }
}

