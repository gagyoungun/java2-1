package Ex10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_5 extends JFrame {
    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] name = {"사과", "배", "체리"};
    private JLabel sumLabel;

    public Ex10_5() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 2000"));

        MyItemListener listener = new MyItemListener();
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new JCheckBox(name[i]);
            fruits[i].setBorderPainted(true);
            c.add(fruits[i]);
            fruits[i].addItemListener(listener);
        }

        sumLabel = new JLabel("현재는 0원 입니다.");
        c.add(sumLabel);

        setSize(250, 200);
        setVisible(true);
    }

    public class MyItemListener implements ItemListener {
        private int sum = 0;

        public void itemStateChanged(ItemEvent e) {
            JCheckBox checkBox = (JCheckBox) e.getItem();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (checkBox == fruits[0])
                    sum += 100;
                else if (checkBox == fruits[1])
                    sum += 500;
                else if (checkBox == fruits[2])
                    sum += 2000;
            } else {
                if (checkBox == fruits[0])
                    sum -= 100;
                else if (checkBox == fruits[1])
                    sum -= 500;
                else if (checkBox == fruits[2])
                    sum -= 2000;
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args) {
        new Ex10_5();
    }
}

