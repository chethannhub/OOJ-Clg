import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Num1:");
        label1.setBounds(20, 20, 50, 20);
        frame.add(label1);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(80, 20, 100, 20);
        frame.add(num1Field);

        JLabel label2 = new JLabel("Num2:");
        label2.setBounds(20, 60, 50, 20);
        frame.add(label2);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(80, 60, 100, 20);
        frame.add(num2Field);

        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(200, 40, 100, 30);
        frame.add(divideButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 250, 20);
        frame.add(resultLabel);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    int result = num1 / num2;

                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ae) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero!", "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
