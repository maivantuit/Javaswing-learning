
package Cop14_Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuDemoClass implements ActionListener{
    private JMenuItem miOpen;
    private JMenuItem miNew;
    private JMenuItem miSave;
    private JMenuItem miExit;
    public static void main(String[] args) {
        MenuDemoClass menu = new MenuDemoClass(); 
       
    }
    public MenuDemoClass(){
        //Ten title Frame----------
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Thanh menu ----------------------
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        //Menu 1 File ---------------------------
        JMenu file = new JMenu("File");
        menubar.add(file);
        file.setMnemonic(KeyEvent.VK_F); // tạo phím tắt Alt + F
        //Menu con New của File ---------------------------
        miNew = new JMenuItem("New");
        miNew.setMnemonic(KeyEvent.VK_N);
        miNew.addActionListener(this);
        file.add(miNew);
        //Menu con Open của File ---------------------------
        miOpen = new JMenuItem("Open");
        miOpen.setMnemonic(KeyEvent.VK_O);
        miOpen.addActionListener(this);
        file.add(miOpen);
        //Menu con Save của File ---------------------------
        miSave = new JMenuItem("Save");
        miSave.setMnemonic(KeyEvent.VK_S);
        miSave.addActionListener(this);
        file.add(miSave);
        //Menu con Save As ... của File ---------------------------
        JMenuItem miSaveAs = new JMenuItem("Save As ...");
        miSaveAs.setMnemonic(KeyEvent.VK_S);
        miSaveAs.addActionListener(this);        
        file.add(miSaveAs);    
        file.addSeparator();// đường kẻ ngang
        //Menu con Exit của File ---------------------------
        miExit = new JMenuItem("Exit");
        miExit.setMnemonic(KeyEvent.VK_E);
        miExit.addActionListener(this);        
        file.add(miExit);
        //Menu 2 Edit ---------------------------
        JMenu edit = new JMenu("Edit");        
        edit.setMnemonic(KeyEvent.VK_E);
        menubar.add(edit);        
        //Menu con Find của Edit có 2 sổ đó là Up Và Down ---------------------------
        JMenu miFind = new JMenu("Find");        
        miFind.setMnemonic(KeyEvent.VK_F);
        edit.add(miFind);// edit. nhé
        
        //Menu con Up của Dit mà Anh nó là Find ---------------------------
        JMenuItem miUp= new JMenuItem("Up");
        miUp.setMnemonic(KeyEvent.VK_U);
        miFind.add(miUp);  // miFind. nhé
        //Menu con Down của Dit mà Anh nó là Find ---------------------------
         JMenuItem miDown= new JMenuItem("Down");
        miDown.setMnemonic(KeyEvent.VK_D);
        miFind.add(miDown); // miFind . nhé        
        
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem)e.getSource();
        if(item==miOpen){
            // new event, bắt sự kiện
            JOptionPane.showConfirmDialog(null, "Open is cliked");
        }
        if(item==miNew){
            JOptionPane.showConfirmDialog(null, "New is newed");
        }
        if(item==miSave){
            JOptionPane.showConfirmDialog(null, "Save is saved");
        }
        if(item==miExit){
            JOptionPane.showConfirmDialog(null, "Exit is exited");
            System.exit(0);
        }
    }
}
