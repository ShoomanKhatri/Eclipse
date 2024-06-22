import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KeyListenerDemo implements KeyListener {
    JFrame frame;
    JTextField txt1;

    KeyListenerDemo() {
        frame = new JFrame("KeyListener Demo");
        txt1 = new JTextField(20);

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter a number:"));
        frame.add(txt1);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        txt1.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    	 int Num = Integer.parseInt(txt1.getText());
         System.out.println(Num);
         
//          syso ctrl+ space shorcut key
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Not used
    	
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//            String input = txt1.getText();
//            System.out.println("Inputted value: " + input);
//        }
    	
    	
    }
}
