
package Cop2_JLable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableExample1 extends JFrame {
        public LableExample1(){
            this.setSize(400, 500);
            setLocation(500, 300);
            setResizable(false);
            JLabel label = new JLabel("Stydy and Share");
            add(label);            
            label.setText("Việt Nam"); // chỉ hiện thị Việt Nam.
            label.setToolTipText("a beautiful country"); // khi rê con chuột đến Việt Nam thì hiển thị dòng chữ a beautiful country.
            label.setForeground(Color.blue);// thay đổi màu cho label.
        }
        public static void main(String[] args) {
            LableExample1 le= new LableExample1();
            le.setVisible(true);
        }
    
}
