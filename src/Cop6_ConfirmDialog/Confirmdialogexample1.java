
package Cop6_ConfirmDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Confirmdialogexample1  extends JFrame{
    public Confirmdialogexample1(){
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
                /*
               int click =JOptionPane.showConfirmDialog(null,"Bạn vui lòng quay lại");
               if(click==JOptionPane.YES_OPTION){
                   JOptionPane.showMessageDialog(null, "Click Yes");
               }
               if(click==JOptionPane.NO_OPTION){
                   JOptionPane.showMessageDialog(null, "Click No");
               }
               if(click==JOptionPane.CANCEL_OPTION){
                   JOptionPane.showMessageDialog(null, "Click Cancel");
               }
               if(click==JOptionPane.CLOSED_OPTION){
                   JOptionPane.showMessageDialog(null, "Click Closed");
               }   
               */
                int click = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa dữ liệu không","Question", JOptionPane.YES_NO_OPTION);
            }
        });
    }
    public static void main(String[] args) {
        Confirmdialogexample1 m = new Confirmdialogexample1();
        m.setVisible(true);
    }
}
