package Ex09;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.RenderingHints.Key;
import java.awt.event.*;
import javax.swing.*;

public class Ex09_7 extends JFrame {
    private JLabel la = new JLabel("Hello");

    public Ex09_7() {
        super("상,하,좌,우 키 이용");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        la.setLocation(50,50);
        la.setSize(100,20);
        c.add(la);
        setSize(200,200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }
    
    /**
     * My
     */
    public class MyKeyListener extends KeyAdapter {
        public void KeyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                  la.setLocation(la.getX(), la.getY() -10); break;
                  case KeyEvent.VK_DOWN:
                  la.setLocation(la.getX(), la.getY() +10); break;
                  case KeyEvent.VK_LEFT:
                  la.setLocation(la.getX() -10, la.getY()); break;
                  case KeyEvent.VK_RIGHT:
                  la.setLocation(la.getX() +10, la.getY()); break;
            }
        }
    }
    public static void main(String [] args) {
        new Ex09_7();
    }


}
