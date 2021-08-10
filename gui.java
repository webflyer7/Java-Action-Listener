package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class gui{
	public static void main(String[] args) {
		Addition add=new Addition();
	}
}
class Addition extends JFrame implements ActionListener{
	JTextField jt1,jt2;
	JButton  jb;
	JLabel jl;
	public Addition() {
		jt1=new JTextField(10);
		jt2=new JTextField(10);
		jb = new JButton("ADD");
		jl = new JLabel("Result");
		add(jt1);
		add(jt2);
		add(jb);
		add(jl);
		
		jb.addActionListener(this);
		setLayout(new FlowLayout());
		setTitle("JLabel Demo");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=Integer.parseInt(jt1.getText());
		int num2=Integer.parseInt(jt2.getText());
		int value=num1+num2;
		jl.setText(value + "");
}
}