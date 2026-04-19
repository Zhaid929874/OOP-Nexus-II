import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing_GUI_Simple_Arithmetic_Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10));

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result will appear here");

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton mulBtn = new JButton("*");
        JButton divBtn = new JButton("/");
        JButton modBtn = new JButton("%");

        ActionListener operationListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    String op = e.getActionCommand();
                    double result = 0;

                    switch (op) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = (num2 != 0) ? num1 / num2 : 0;
                            break;
                        case "%":
                            result = num1 % num2;
                            break;
                    }

                    resultLabel.setText("Result: " + result);

                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        };

        addBtn.addActionListener(operationListener);
        subBtn.addActionListener(operationListener);
        mulBtn.addActionListener(operationListener);
        divBtn.addActionListener(operationListener);
        modBtn.addActionListener(operationListener);

        inputPanel.add(new JLabel("Number 1:"));
        inputPanel.add(num1Field);
        inputPanel.add(new JLabel("Number 2:"));
        inputPanel.add(num2Field);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addBtn);
        buttonPanel.add(subBtn);
        buttonPanel.add(mulBtn);
        buttonPanel.add(divBtn);
        buttonPanel.add(modBtn);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}