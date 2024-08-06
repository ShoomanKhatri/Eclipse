package test;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SUM implements ActionListener {
    JFrame frame;
    JButton btnCompute;
    JLabel num1Label, num2Label, sumLabel;
    JTextField txt1, txt2, sumField;

    SUM() {
        frame = new JFrame("SUM");
        btnCompute = new JButton("Compute");
        num1Label = new JLabel("Num1:");
        num2Label = new JLabel("Num2:");
        sumLabel = new JLabel("Sum:");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        sumField = new JTextField(20);
        sumField.setEditable(false);

        frame.setLayout(new FlowLayout());
        frame.add(num1Label);
        frame.add(txt1);
        frame.add(num2Label);
        frame.add(txt2);
        frame.add(btnCompute);
        frame.add(sumLabel);
        frame.add(sumField);

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCompute.addActionListener(this);
    }

    public static void main(String[] args) {
        new SUM();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int firstNum = Integer.parseInt(txt1.getText());
            int secondNum = Integer.parseInt(txt2.getText());
            int sum = firstNum + secondNum;
            sumField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            sumField.setText("Invalid input");
        }
    }
}
