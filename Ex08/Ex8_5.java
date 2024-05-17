package Ex08;
import javax.swing.*;
import java.awt.*;

public class Ex8_5 extends JFrame {
    public Ex8_5() {
        setTitle("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= getContentPane();

        contentPane.setLayout(new GridLayout(4,3, 10, 10));

        for(int i=9; i>=0; i--){
            String text = Integer.toString(i);
            contentPane.add(new JButton(text));
        }
        contentPane.add(new JButton("*"));
        contentPane.add(new JButton("0"));

        setSize(300,200);
        setVisible(true);
    }
public static void main(String[] args) {
        new Ex8_5();
    }
}
