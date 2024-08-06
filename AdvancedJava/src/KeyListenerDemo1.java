//package com.swing.demo;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyListenerDemo1 implements KeyListener{
	JFrame frame;
	JTextField txt;
	JTextField txt1;
	KeyListenerDemo1(){
		frame=new JFrame();
		txt=new JTextField(20);
		txt1=new JTextField(20);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.add(txt);
		frame.add(txt1);
		txt.addKeyListener(this);
	}
	public static void main(String[] args) {
		new KeyListenerDemo1();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Key pressed!!");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
