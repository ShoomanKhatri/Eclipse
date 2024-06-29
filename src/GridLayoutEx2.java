
//import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx2 {
	JFrame frame;
	JButton btn1, btn2, btn3;
	
	GridLayoutEx2(){
		
		frame = new JFrame("Hello");
		btn1 = new JButton("Add");
		btn2 = new JButton("Mul");
		btn3 = new JButton("Sub");
		
	    frame.add(btn1);
	    frame.add(btn2);
	    frame.add(btn3);
		
		frame.setSize(800,600);
		
//		adding gap between.
		GridLayout layout = new GridLayout(4,2);
		layout.setHgap(20);
		layout.setVgap(20);
		
		frame.setLayout(layout);
		frame.setVisible(true);
		
	}



public static void main(String[] args) {
	
	new GridLayoutEx2();
}
}
