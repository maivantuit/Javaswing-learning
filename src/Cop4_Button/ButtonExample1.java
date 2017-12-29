package Cop4_Button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonExample1 extends JFrame {
    private JLabel label;
    public ButtonExample1() {
        this.setSize(400, 250);
        setLocation(500, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cách khắc phục: mỗi lần chạy sẽ có 1 frame được run. Để tất cả các frame đã run
        label = new JLabel("Study and Share");
        label.setSize(20, 50);
        add(label);
        JButton button = new JButton("Hit me");
        add(button, "North", 1); // add đối tượng vào, nếu chỉ mỗi button thôi thì kích thước nó toàn bộ frame,"string": chỉ 4 hướng West,Đông,South,North số 1: cho button 1
        //add(bt,"West",1);
        button.addActionListener(new ActionListener() { // thiết lập action cho button trên
            public void actionPerformed(ActionEvent e) {
                    changeText();// khi click vào button thì "Study and share" đổi thành "Tutorial JavaSwing"
            }
        });
        JButton button2 = new JButton("Hit me 1"); // button này chưa thiết lập action
        add(button2, "South", 2);
    }
    public void changeText(){
        label.setText("Tutorial Java Swing");
    }
    public static void main(String[] args) {
        ButtonExample1 b = new ButtonExample1();
        b.setVisible(true);
    }
}
//tạo nhiều button vậy mỗi lần như vậy thì thiết lập action mất time, khắc phục => ví dụ 2:implements ActionListener