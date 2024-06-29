package test;
//import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
	JFrame frame;
	JButton btn1, btn2, btn3;
	
	Test1(){
		
		frame = new JFrame("Hello");
		btn1 = new JButton("Add");
		btn2 = new JButton("Mul");
		btn3 = new JButton("Sub");
		
	    frame.add(btn1);
	    frame.add(btn2);
	    frame.add(btn3);
		
		frame.setSize(200,200);
		frame.setLayout(null);
		btn1.setBounds(100,50,80,20);
		btn2.setBounds(100,90,80,20);
		btn3.setBounds(100,130,80,20);
		frame.setVisible(true);
		
	}



public static void main(String[] args) {
	
	new Test1();
}
}
