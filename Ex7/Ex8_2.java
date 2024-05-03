package Ex7;
import javax.swing.*;
import java.awt.*;


public class Ex8_2 extends JFrame{
    public Ex8_2() {
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);

    }

    public static void main(String[] args){
        new Ex8_2();
    }
    
}
