import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingHello2 implements ActionListener {
    static JFrame frame;
    static JButton btn1, btn2, btn3;
    
    //Using constructor is best coding  practice.
    
   public SwingHello2() {
	   frame = new JFrame();
       btn1 = new JButton("Hi");
       btn2 = new JButton("Hello");
       btn3 = new JButton("Bye");

       frame.setLayout(new FlowLayout());
       frame.add(btn1);
       frame.add(btn2);
       frame.add(btn3);

       frame.setSize(300, 200);
       frame.setVisible(true);

       btn2.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e) {
       System.out.println("Clicked hello");
   }

   

    public static void main(String[] args) {
    	new SwingHello2();
       }
}
