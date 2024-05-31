package Ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_4 extends JFrame {
    public Ex10_4() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c =getContentPane();
        c.setLayout(new FlowLayout());

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배",true);
        JCheckBox cherry = new JCheckBox("체리");
        
        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new Ex10_4();
    }
    
}
