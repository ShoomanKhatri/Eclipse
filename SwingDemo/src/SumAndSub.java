import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SumAndSub implements ActionListener {
	
	//Declaring all the components for GUI
	JFrame frame;
	
	//components
	JLabel firstNum,secondNum;
	JTextField txtFirstNum, txtSecondNum;
	JButton btnAdd, btnSub;
	
	//Initialize Components
	SumAndSub(){
		frame = new JFrame();
		firstNum = new JLabel("First Number");
		secondNum = new JLabel("Second Number");
		txtFirstNum = new JTextField(20);
		txtSecondNum = new JTextField(20);
		btnAdd = new JButton("ADD");
		btnSub = new JButton("SUB");
		
		frame.setLayout(new FlowLayout());
		frame.add(firstNum);
		frame.add(secondNum);
		frame.add(txtFirstNum);
		frame.add(txtSecondNum);
		frame.add(btnAdd);
		frame.add(btnSub);
		frame.setSize(300, 200);
        frame.setVisible(true);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
        int firstNum = Integer.parseInt(txtFirstNum.getText());
        int secondNum = Integer.parseInt(txtSecondNum.getText());
        int sum = firstNum + secondNum;
        System.out.println(sum);
		}
		
		else if(e.getSource()==btnSub){
			int firstNum = Integer.parseInt(txtFirstNum.getText());
	        int secondNum = Integer.parseInt(txtSecondNum.getText());
	        int sum = firstNum - secondNum;
	        System.out.println(sum);
			
		}
		}
	
	 public static void main(String[] args) {
	        new SumAndSub();
	    }
}
