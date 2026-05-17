import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculate implements ActionListener {
    JFrame f;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField t1;
    boolean isCalling;

    Calculate() {
        f = new JFrame();
        f.setSize(600, 600);
        f.setLayout(new GridLayout(7, 4, 2, 2));
        t1 = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("clear");
        b12 = new JButton("call");
        isCalling = false;

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(t1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == b1) {
            t1.setText(t1.getText() + "1");
        } else if (b == b2) {
            t1.setText(t1.getText() + "2");
        } else if (b == b3) {
            t1.setText(t1.getText() + "3");
        } else if (b == b4) {
            t1.setText(t1.getText() + "4");
        } else if (b == b5) {
            t1.setText(t1.getText() + "5");
        } else if (b == b6) {
            t1.setText(t1.getText() + "6");
        } else if (b == b7) {
            t1.setText(t1.getText() + "7");
        } else if (b == b8) {
            t1.setText(t1.getText() + "8");
        } else if (b == b9) {
            t1.setText(t1.getText() + "9");
        } else if (b == b10) {
            t1.setText(t1.getText() + "0");
        } else if (b == b11) {
            t1.setText(t1.getText() + " ");
        } else if (b == b12) {
            if (!isCalling) {
                b12.setText("Hang up");
                isCalling = true;
            } else {
                t1.setText("");
                b12.setText("call");
                isCalling = false;
            }
        }
    }
}

class GUI1 {
    public static void main(String args[]) {
        new Calculate();
    }
}
