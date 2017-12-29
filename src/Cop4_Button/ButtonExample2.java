package Cop4_Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ButtonExample2 extends JFrame implements ActionListener{ // thừa kế 1 interface: ActionListener
    private JLabel label;
    private JButton button1;
    public ButtonExample2() {
        this.setSize(400, 250);
        setLocation(500, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cách khắc phục output chức nhiều lượt run.
        label = new JLabel("Study and Share");
        label.setSize(30, 50);
        add(label);
        JButton button = new JButton("Hit me");// "text", có thể thay vào icon, html lên đấy
        add(button, "North", 1);
        //add(bt,"West",1);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    changeText();
            }
        });
        button1 = new JButton("Hit me 1");
        add(button1, "South", 1);
        button1.addActionListener(this);// bản thân this là Frame:ButtonExample2, mà nó là 1 ActionListener vì implements
    }
     @Override
    public void actionPerformed(ActionEvent e) {// method được implements từ ActionListener
        JButton b2 =(JButton) e.getSource(); //ép kiểu, getSource: trả về object-> ép kiểu về JButton
        if(b2==button1){
            label.setText("Study and Share");
        }
    }
    public void changeText(){
        label.setText("Tutorial Java Swing");
    }
    public static void main(String[] args) {
        ButtonExample1 b = new ButtonExample1();
        b.setVisible(true);
    }
   
}
