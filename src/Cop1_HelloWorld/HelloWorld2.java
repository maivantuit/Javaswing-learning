
package Cop1_HelloWorld;

import javax.swing.JButton;
import javax.swing.JFrame;
public class HelloWorld2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();// khởi tạo đối tượng JFrame
        JButton jb = new JButton("click");//khởi tạo đối tượng JButton
        jf.add(jb);// thêm button vào trong Jframe
        jf.setSize(400,500);// độ rộng là 400 và chiều cao là 500
        jf.setLayout(null);//không sử dụng Layout Manager
        jf.setVisible(true);//tạo Frame là có thể nhìn thấy (visible)        
    }
}
