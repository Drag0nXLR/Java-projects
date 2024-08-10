package lesson2;
import javax.swing.*;
public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setBounds(100, 100, 450, 300);
        frame.show();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
