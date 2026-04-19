import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing_Vowel_Consonant_Checker_KeyListener {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Vowel or Consonant Checker");

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Type a letter: ");
        JTextField textField = new JTextField(5);

        JLabel resultLabel = new JLabel("");

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String text = textField.getText();

                if (text.length() == 1) {

                    char ch = Character.toLowerCase(text.charAt(0));

                    if (ch >= 'a' && ch <= 'z') {

                        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                            ch == 'o' || ch == 'u') {

                            resultLabel.setText("Vowel");

                        } else {
                            resultLabel.setText("Consonant");
                        }

                    } else {
                        resultLabel.setText("Not a letter");
                    }

                } else if (text.length() == 0) {
                    resultLabel.setText("");
                } else {
                    resultLabel.setText("Type only one letter");
                }
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(350, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}