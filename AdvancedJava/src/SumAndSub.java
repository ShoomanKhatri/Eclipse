//package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumAndSub implements ActionListener{
	JFrame frame;
	JLabel lnum1,lnum2;
	JTextField txtnum1,txtnum2;
	JButton subbtn,addbtn;
	 JLabel result;
	
	
	SumAndSub(){
		frame=new JFrame();
		lnum1=new JLabel("First Num");
		lnum2=new JLabel("Second Num");
		result=new JLabel("");
		txtnum1=new JTextField(20);
		txtnum2=new JTextField(20);
		addbtn=new JButton("Add");
		subbtn=new JButton("Subtract");
		frame.add(result);
		frame.setLayout(new FlowLayout());
		//adding components to the container
		//since we using flowlayout,we should mind
		//the way we add components
		frame.add(lnum1);  
		frame.add(txtnum1);
		
		frame.add(lnum2);  
		frame.add(txtnum2);
		frame.add(addbtn);
		frame.add(subbtn);
		frame.setSize(400, 400);
		frame.setVisible(true);
		addbtn.addActionListener(this);
		subbtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
	new SumAndSub();	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addbtn) {
			int a=Integer.parseInt(txtnum1.getText());
			int b=Integer.parseInt(txtnum2.getText());
			int sum=a+b;
			System.out.println(sum);
		}
		else if(e.getSource()==subbtn){
			int a=Integer.parseInt(txtnum1.getText());
			int b=Integer.parseInt(txtnum2.getText());
			System.out.println(a-b);
		}
		
	}

	
	
	

}
