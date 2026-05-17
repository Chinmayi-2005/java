import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Temperature implements ActionListener
{
JFrame f;
JTextField t1;
JTextField t2;
JButton b1;
JLabel l1;
JLabel l2;
Temperature()
{

f=new JFrame("CHINMAYI VS\nROLL NO : 63");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("convert");
l1=new JLabel("celsius");
l2=new JLabel("Faranheit");
f.setSize(600, 600);
        t1.setBounds(60, 50, 180, 25);
        t2.setBounds(60, 100, 180, 25); // Changed bounds for t2
        b1.setBounds(100, 150, 100, 30); // Added bounds for b1
l1.setBounds(250, 50, 100, 25);
l2.setBounds(250, 100, 100, 25);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
b1.addActionListener(this);


f.add(t1);
f.add(t2);
f.add(b1);
f.add(l1);
f.add(l2);
t1.add(l1);
t2.add(l2);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent e)
{
try
{
JButton b=(JButton)e.getSource();
int temp=Integer.parseInt(t1.getText());
if(b==b1)
{
int far=(temp*9/5)+32;
t2.setText(String.valueOf(far));
}
}
catch(ArithmeticException ae)
{
System.out.println("exception caught");
}
}


}
class P1
{
public static void main(String args[])
{
Temperature t=new Temperature();
}
}