
package Cop5_MessageDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Messagedialogexample1  extends JFrame{
    public Messagedialogexample1(){
        this.setSize(400,250);
        setLocation(400,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Message Demo");
        add(label);
        JButton button = new JButton("Hit me");
        add(button,"North",1);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = "Bạn vui lòng quay lại";
               // JOptionPane.showMessageDialog(null, "This is a message dialog","Title",JOptionPane.QUESTION_MESSAGE);// sử dụng Joption để thể hiện thông báo
                JOptionPane.showMessageDialog(null, name,"Title",JOptionPane.QUESTION_MESSAGE);// sử dụng Joption để thể hiện thông báo, hiển thị trên form.
                System.out.println("Tên thông báo: "+name);// hiển thị trên màn hình console
                //1: null, 2: this is a mesage dialog: in ra dòng thông báo, 3: Tên tiêu đề trên thanh, 4: .Nhiều icon khác nhau. error, warring...ect
            }
        });
    }
    public static void main(String[] args) {
        Messagedialogexample1 m = new Messagedialogexample1();
        m.setVisible(true);
    }
}
