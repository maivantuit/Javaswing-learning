package Cop7_TextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class TextFieldExample1 extends JFrame implements ActionListener {
    private JTextField tfName;
    private JButton bHit;

    public TextFieldExample1() {
        this.setSize(400, 250);// size của Frame
        setLocation(400, 300); // vị trí của Frame trên màn hình
        setResizable(false);// không cho kéo kích thước cửa sổ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tfName = new JTextField();
        add(tfName, "North", 0);

        bHit = new JButton("Hit me");
        add(bHit, "South", 0);
        bHit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if ((JButton) e.getSource() == bHit) {
            //JOptionPane.showConfirmDialog(null, tfName.getText()); // tự nhập vào, khi click vào button thì hiển thị ra dialog dòng chữ đã nhập
            tfName.setText("Bạn vui lòng quay lại");// khi click thì hiển thị dialog dòng chữ này        
        }
    }
    public static void main(String[] args) {
        TextFieldExample1 t = new TextFieldExample1();
        t.setVisible(true);
    }

}
