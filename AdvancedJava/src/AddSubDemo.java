package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddSubDemo implements ActionListener{
	JFrame frame;
	JButton addbtn,subbtn;
	JLabel result;
	AddSubDemo(){
		frame=new JFrame();
		addbtn=new JButton("Add");
		subbtn=new JButton("Sub");
		result=new JLabel("");
		frame.add(addbtn);
		frame.add(subbtn);
		frame.add(result);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
		addbtn.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new AddSubDemo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addbtn) {
			result.setText("Add button clicked");
		}
		
		
	}
}
