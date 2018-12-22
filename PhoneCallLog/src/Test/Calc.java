package Test;

import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;

class Calc implements ActionListener {

    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;
    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    Calc() {
        f = new JFrame("Calculator");
        JMenuBar menubar = new JMenuBar();

        JMenu option = new JMenu("Option");
        option.setMnemonic(KeyEvent.VK_O);
        JMenuItem standard = new JMenuItem("Standard");
        standard.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        option.add(standard);

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        option.add(exit);
        menubar.add(option);

        JMenu help = new JMenu("Help");
        help.setMnemonic(KeyEvent.VK_H);
        JMenuItem vhelp = new JMenuItem("View help");
        vhelp.setMnemonic(KeyEvent.VK_V);
        vhelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

            }
        });
        help.add(vhelp);

        JMenuItem abc = new JMenuItem("About Calculator");
        abc.setMnemonic(KeyEvent.VK_A);
        abc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

            }
        });
        help.add(abc);
        menubar.add(help);
        f.setJMenuBar(menubar);
        t = new JTextField();
        t.setBounds(30, 40, 280, 30);

        t.setForeground(java.awt.Color.blue);

        t.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));

        b1 = new JButton("1");
        b1.setBounds(40, 240, 50, 40);
        b2 = new JButton("2");
        b2.setBounds(110, 240, 50, 40);
        b3 = new JButton("3");
        b3.setBounds(180, 240, 50, 40);
        b4 = new JButton("4");
        b4.setBounds(40, 170, 50, 40);
        b5 = new JButton("5");
        b5.setBounds(110, 170, 50, 40);
        b6 = new JButton("6");
        b6.setBounds(180, 170, 50, 40);
        b7 = new JButton("7");
        b7.setBounds(40, 100, 50, 40);
        b8 = new JButton("8");
        b8.setBounds(110, 100, 50, 40);
        b9 = new JButton("9");
        b9.setBounds(180, 100, 50, 40);
        b0 = new JButton("0");
        b0.setBounds(110, 310, 50, 40);
        bdiv = new JButton("/");
        bdiv.setBounds(250, 100, 50, 40);
        bmul = new JButton("*");
        bmul.setBounds(250, 170, 50, 40);
        bsub = new JButton("-");
        bsub.setBounds(250, 240, 50, 40);
        badd = new JButton("+");
        badd.setBounds(250, 310, 50, 40);
        bdec = new JButton(".");
        bdec.setBounds(40, 310, 50, 40);
        beq = new JButton("=");
        beq.setBounds(180, 310, 50, 40);
        bdel = new JButton("Delete");
        bdel.setBounds(60, 380, 100, 40);
        bclr = new JButton("Clear");
        bclr.setBounds(180, 380, 100, 40);

        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
    }

    //{ what responses each button
    public void actionPerformed(ActionEvent e) {
        if (b1 == e.getSource()) {
            t.setText(t.getText().concat("1"));
        }
        if (b2 == e.getSource()) {
            t.setText(t.getText().concat("2"));
        }
        if (b3 == e.getSource()) {
            t.setText(t.getText().concat("3"));
        }

        if (e.getSource() == b4) {

            t.setText(t.getText().concat("4"));
        }

        if (e.getSource() == b5) {

            t.setText(t.getText().concat("5"));
        }

        if (e.getSource() == b6) {

            t.setText(t.getText().concat("6"));
        }

        if (e.getSource() == b7) {

            t.setText(t.getText().concat("7"));
        }

        if (e.getSource() == b8) {

            t.setText(t.getText().concat("8"));
        }

        if (e.getSource() == b9) {

            t.setText(t.getText().concat("9"));
        }

        if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));
        }

        if (e.getSource() == bdec) {
            t.setText(t.getText().concat("."));
        }

        if (e.getSource() == badd) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }

        if (e.getSource() == bsub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }

        if (e.getSource() == bmul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }

        if (e.getSource() == bdiv) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }

        if (e.getSource() == beq) {
            b = Double.parseDouble(t.getText());

            switch (operator) {
                case 1:
                    result = a + b;
                    break;

                case 2:
                    result = a - b;
                    break;

                case 3:
                    result = a * b;
                    break;

                case 4:
                    result = a / b;
                    break;

                default:
                    result = 0;
            }
            if (result % 1 == 0) {
                t.setText("" + (int) result);
            } else {
                t.setText("" + result);
            }

        }

        if (e.getSource() == bclr) {
            t.setText("");
        }

        if (e.getSource() == bdel) {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                t.setText(t.getText() + s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        new Calc();
    }
}
