package Ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_3 extends JFrame {
    public Ex10_3() {
        super("JComponentEx");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton("Disabled Button");
        JButton b3 = new JButton("getX(), getY()");

        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.MAGENTA);
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                setTitle(b.getX() + "," + b.getY());
            }
        });

        c.add(b1);
        c.add(b2);
        c.add(b3);

        setSize(260, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex10_3();
    }
}
