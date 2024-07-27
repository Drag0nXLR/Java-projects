package lesson2;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    public MyFrame() {
        super("Вікно з кнопкою");
        setBounds(250, 250, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(/*JFrame.*/EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel(
                "Натисніть кнопку щоб закрити вікно"
        );
        lbl.setBounds(10, 30, 280, 50);
        add(lbl);
        JButton btn = new JButton("Закрити вікно");
        btn.setBounds(50, 120, 200, 30);
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);
        add(btn);
        setVisible(true);
    }
}
class MyHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
public class WindowWithButtonDemo {
    public static void main(String[] args) {
        new MyFrame();
    }
}
