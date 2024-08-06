import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class KeyTypedDemo implements KeyListener {
    JFrame frame;
    JTextField txt1;

    KeyTypedDemo() {
        frame = new JFrame("KeyListener Demo");
        txt1 = new JTextField(20);

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter a value:"));
        frame.add(txt1);

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        txt1.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyTypedDemo();
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        System.out.println("Key Typed: " + keyChar);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }
}
