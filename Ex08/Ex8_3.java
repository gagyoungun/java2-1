package Ex08;
import javax.swing.*;
import java.awt.*;

public class Ex8_3 extends JFrame {
    public Ex8_3() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= getContentPane();

        contentPane.setLayout((new FlowLayout(FlowLayout.LEFT, 30, 40)));

        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("diw"));
        contentPane.add(new JButton("Calculate"));

        setSize(300,200);
        setVisible(true);
    }
public static void main(String[] args) {
        new Ex8_3();
    }
}
