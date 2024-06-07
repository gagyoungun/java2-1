package Ex11;
import javax.swing.*;
import java.awt.*;

public class Ex11_2 extends JFrame {
    public Ex11_2(){
    setTitle("문자열, color, 폰트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    /**
     * InnerEx11_2
     */
    public class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawString("자바는 재밌다.ㅠㅠ", 30, 30);

            g.setColor(new Color(250,0,0));
            g.setFont(new Font("Arial", Font.ITALIC,30));
            g.drawString("How much?", 30, 70);
            g.setColor(new Color(0x00ff00ff));

            for(int i=1; i<=4; i++) {
                g.setFont(new Font("JOkerman", Font.ITALIC, i*10));
                g.drawString("This much!!", 30 , 60+i*40);
            }
        }
    }
    public static void main(String [] args) {
        new Ex11_2();
    }
}

