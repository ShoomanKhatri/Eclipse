import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class SwingExample {

  static JFrame frame;
  static JLabel name, address;
  static JTextField txt1, txt2;
  static JButton btn1, btn2;

  public static void main(String[] args) {
    frame = new JFrame("Swing Example");
    name = new JLabel("Name");
    address = new JLabel("Address");

    txt1 = new JTextField(20);
    txt2 = new JTextField(20);

    btn1 = new JButton("Submit");
    btn2 = new JButton("Cancel");

    frame.setLayout(new FlowLayout());
    frame.add(name);
    frame.add(txt1);
    frame.add(address);
    frame.add(txt2);
    frame.add(btn1);
    frame.add(btn2);

    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}