
package Cop14_Menu;


import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class PopupMenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPopupMenu popup = new JPopupMenu("Option");
        JMenuItem miCopy = new JMenuItem("Copy");
        JMenuItem miPaste = new JMenuItem("Paste");
        JMenuItem miDelete = new JMenuItem("Delete");
        
        popup.add(miCopy);
        popup.addSeparator();// dấu kẻ ngang, tạo cho nó có bố cục
        popup.add(miPaste);
        popup.addSeparator();
        popup.add(miDelete);
        JTextArea area = new JTextArea();
        area.setComponentPopupMenu(popup);
        frame.add(area);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    
}
