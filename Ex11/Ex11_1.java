package Ex11;
import javax.swing.*;
import java.awt.*;

public class Ex11_1 extends JFrame{
    public Ex11_1() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(250,200);
        setVisible(true);
    }

    /**
     * MyPanel extends JPanel
 
 public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLUE);
    g.drawRect(10,10,500,50);
    g.
 }    */
    public class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10,10,50,50);
            g.drawRect(50,50,50,50);

            g.setColor(Color.MAGENTA);
            g.drawRect(90,90,50,50);
        }
    }

    public static void main(String [] args) {
        new Ex11_1();
        
    }
    

}
