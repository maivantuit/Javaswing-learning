
package Cop1_HelloWorld;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorld extends JFrame{
    public HelloWorld (){
        //setSize(400,250);// chiều rộng và chiều cao
        this.setSize(400,250);// hoặc viết setSize ra như thế này
        setVisible(true);// k thể thiếu, để hiển thị frame.
        setLocation(700,300);//điều chỉnh cửa số frame theo chiều rộng và chiều cao.
        setResizable(true);// nếu false: không thể di chuyển độ rộng của sổ, true: kéo được 
        JLabel label = new JLabel ("Hello World");
        add(label);
    }
    public static void main(String[] args) {
         HelloWorld hl = new HelloWorld();
         //hl.setVisible(true); hoặc viết setVisible ở đây
    }
}
