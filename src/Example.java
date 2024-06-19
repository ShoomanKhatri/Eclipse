import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Example {
  public static void main(String[] args) {
   JFrame frame = new JFrame("Example");
   JLabel name = new JLabel("Name");
   JLabel age = new JLabel("age");
   JLabel address = new JLabel("Address");

   JTextField txt1 = new JTextField(20);
   JTextField txt2 = new JTextField(20);
   JTextField txt3 = new JTextField(20);

   JButton btn = new JButton("Submit");

    frame.setLayout(new FlowLayout());
    frame.add(name);
    frame.add(txt1);
    frame.add(age);
    frame.add(txt2);
    frame.add(address);
    frame.add(txt3);
    frame.add(btn);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}