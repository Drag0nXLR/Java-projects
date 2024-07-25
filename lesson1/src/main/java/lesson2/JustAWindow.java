package lesson2;
import javax.swing.JFrame;

public class JustAWindow {
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Just A Window");
        wnd.setSize(300, 200);
        wnd.setLocation(250, 250);
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
}
