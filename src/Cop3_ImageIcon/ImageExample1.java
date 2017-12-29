
package Cop3_ImageIcon;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageExample1 extends JFrame {
    public ImageExample1(){
        this.setSize(400,250);
        setLocation(500,300);
        setResizable(true);
        JLabel label = new JLabel();
        add(label);
        label.setSize(350,200);
        System.out.println("x: "+label.getSize().width+ " y: "+label.getSize().height);// thử setsize của bức hình
        
        setPicture(label, "quynhdien.jpg");
    }
    public void setPicture(JLabel label, String filename){
        try {
            BufferedImage image = ImageIO.read(new File(filename));
            int x =label.getSize().width;
            int y =label.getSize().height;
            int ix= image.getWidth();
            int iy= image.getHeight();
            int dx= 0;
            int dy= 0;       
            if(x/y > ix/iy){
                dy=y;
                dx=dy* ix/iy;
            }else{
                dx=x;
                dy=dx * iy/ix;
            }                  
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy,image.SCALE_SMOOTH));
        label.setIcon(icon);
                    } catch (IOException ex) {
            Logger.getLogger(ImageExample1.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    public static void main(String[] args) {
        ImageExample1 ie= new ImageExample1();
        ie.setVisible(true);
    }
}
