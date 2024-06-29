
//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx {
	JFrame frame;
	JButton btn1, btn2, btn3;
	
	GridLayoutEx(){
		
		frame = new JFrame("Hello");
		btn1 = new JButton("Add");
		btn2 = new JButton("Mul");
		btn3 = new JButton("Sub");
		
	    frame.add(btn1);
	    frame.add(btn2);
	    frame.add(btn3);
		
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(2,2));
		frame.setVisible(true);
		
	}



public static void main(String[] args) {
	
	new GridLayoutEx();
}
}
