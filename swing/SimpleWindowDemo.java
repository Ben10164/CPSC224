import javax.swing.*;

public class SimpleWindowDemo {
    public static void main(String[] args) {
        JFrame mainWindowFrame = new JFrame();

        mainWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindowFrame.setTitle("Simple Window Demo");
        mainWindowFrame.setVisible(true);
    }
}