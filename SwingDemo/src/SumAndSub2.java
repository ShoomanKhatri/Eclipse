import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumAndSub2 implements ActionListener {
    JFrame frame;
    JLabel lnum1, lnum2;
    JTextField txtnum1, txtnum2, resultField;
    JButton subbtn, addbtn;
    
    SumAndSub2() {
        frame = new JFrame();
        lnum1 = new JLabel("First Num");
        lnum2 = new JLabel("Second Num");
        txtnum1 = new JTextField(20);
        txtnum2 = new JTextField(20);
        resultField = new JTextField(20); // Result JTextField
        resultField.setEditable(false); // Make it non-editable
        
        addbtn = new JButton("Add");
        subbtn = new JButton("Subtract");
        
        frame.setLayout(new FlowLayout());
        // Adding components to the container
        frame.add(lnum1);
        frame.add(txtnum1);
        frame.add(lnum2);
        frame.add(txtnum2);
        frame.add(addbtn);
        frame.add(subbtn);
        frame.add(resultField); // Adding the result field
        
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        addbtn.addActionListener(this);
        subbtn.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new SumAndSub2();    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(txtnum1.getText());
        int b = Integer.parseInt(txtnum2.getText());
        int result = 0;
        
        if (e.getSource() == addbtn) {
            result = a + b;
        } else if (e.getSource() == subbtn) {
            result = a - b;
        }
        
        resultField.setText(String.valueOf(result)); // Display result in JTextField
    }
}
