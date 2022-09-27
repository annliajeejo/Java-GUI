import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sumgui extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1;
	Sumgui()
	{
		setTitle("GUI pgm for sum");
		l1=new JLabel("1st no");
		l2=new JLabel("2nd no");
		l3=new JLabel("sum");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("Add");
		setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		b1.addActionListener(this);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		int x=Integer.parseInt(t1.getText());
		int y= Integer.parseInt(t2.getText());
		int sum=x+y;
		t3.setText(String.valueOf(sum));
	}
	public static void main(String args[])
	{
		new Sumgui();
	}
}
