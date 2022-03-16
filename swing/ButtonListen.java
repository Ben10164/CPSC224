import javax.swing.*;
import java.awt.event.*;

public class ButtonListen {
    public static void main(String[] args) {
        JFrame mainWindowFrame = new JFrame("Button Example");

        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        JButton button = new JButton("No click here");
        button.setBounds(50, 100, 200, 30);

        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // note: e contains information about *what* action was performed
                        textField.setText("You clicked it!");
                        button.setText("Why did you do that!?!");
                        button.setVisible(false);
                    }
                });

        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindowFrame.setSize(300, 200);

        mainWindowFrame.add(textField);
        mainWindowFrame.add(button);
        mainWindowFrame.setVisible(true); // start mainloop

    }
}
