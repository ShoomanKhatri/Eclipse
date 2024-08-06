import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstSwing implements ActionListener {
     JFrame frame;
     JButton btnAdd;
    JLabel num1Label, num2Label;
     JTextField txt1, txt2;

    FirstSwing() {
        frame = new JFrame();
        btnAdd = new JButton("Add");
        num1Label = new JLabel("Num1:");
        num2Label = new JLabel("Num2:");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);

        frame.setLayout(new FlowLayout());
        frame.add(num1Label);
        frame.add(txt1);
        frame.add(num2Label);
        frame.add(txt2);
        frame.add(btnAdd);

        frame.setSize(300, 200);
        frame.setVisible(true);

        btnAdd.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        int firstNum = Integer.parseInt(txt1.getText());
        int secondNum = Integer.parseInt(txt2.getText());
        int sum = firstNum + secondNum;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new FirstSwing();
    }
}
