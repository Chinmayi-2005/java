import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Light implements ActionListener
{
	JRadioButton r1,r2,r3;
	JFrame f;
	JPanel p1,p2,p3;
	Light()
	{
		f=new JFrame();
		f.setSize(600,600);
		f.setLayout(new GridLayout(3,3));
		r1=new JRadioButton("STOP");
		r2=new JRadioButton("WAIT");
		r3=new JRadioButton("GO");
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		ButtonGroup bg=new ButtonGroup();
		p1.setBackground(Color.BLACK);
		p2.setBackground(Color.BLACK);
		p3.setBackground(Color.BLACK);
		p1.add(r1);
		p2.add(r2);
		p3.add(r3);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		r1.setBackground(Color.WHITE);
		r2.setBackground(Color.WHITE);
		r3.setBackground(Color.WHITE);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		JRadioButton r=(JRadioButton)e.getSource();
		if(r==r1)
		{
			r1.setBackground(Color.RED);
			r2.setBackground(Color.WHITE);
			r3.setBackground(Color.WHITE);
		}
		if(r==r2)
		{
			r1.setBackground(Color.WHITE);
			r2.setBackground(Color.YELLOW);
			r3.setBackground(Color.WHITE);
		}
		if(r==r3)
		{
			r1.setBackground(Color.WHITE);
			r2.setBackground(Color.WHITE);
			r3.setBackground(Color.GREEN);
		}
	}
	
}
class Traffic
{
	public static void main(String args[])
	{
		Light l=new Light();
	}
}
