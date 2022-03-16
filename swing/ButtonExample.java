import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame mainWindowFrame = new JFrame("Button Example");
        JButton demoButton1 = new JButton("Click Here");

        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindowFrame.setSize(300, 200);

        mainWindowFrame.add(demoButton1);
        mainWindowFrame.setVisible(true); // start mainloop
    }
}
