package Cop17_FileChooser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ChooserDemo extends javax.swing.JFrame {

    private static final int FILE_OPEN = 1;
    private static final int FILE_SAVE = 2;
    private boolean changed = false;

    public ChooserDemo() {
        initComponents();
        setLocation(300, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taFile = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miwrapword = new javax.swing.JCheckBoxMenuItem();
        miwrapline = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taFile.setColumns(20);
        taFile.setLineWrap(true);
        taFile.setRows(5);
        taFile.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taFile);

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("File");
        jMenu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTyped(evt);
            }
        });

        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        jMenu1.add(miNew);

        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);
        jMenu1.add(jSeparator1);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miwrapword.setSelected(true);
        miwrapword.setText("Wrap Word");
        miwrapword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                miwrapwordItemStateChanged(evt);
            }
        });
        miwrapword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miwrapwordActionPerformed(evt);
            }
        });
        jMenu2.add(miwrapword);

        miwrapline.setSelected(true);
        miwrapline.setText("Wrap Line");
        miwrapline.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                miwraplineItemStateChanged(evt);
            }
        });
        jMenu2.add(miwrapline);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        //JOptionPane.showMessageDialog(null,"Open is updating"); 
        operateFile("Open a File", FILE_OPEN, 1);
           if (changed) {
            int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu file này không ?");
            if (result == JOptionPane.YES_OPTION) {
                operateFile("Save a File", FILE_SAVE, 1);
            }
        }
        operateFile("Open a file", FILE_OPEN, 2);
        changed = false;
        
    }//GEN-LAST:event_miOpenActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(2);
    }//GEN-LAST:event_miExitActionPerformed

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        //JOptionPane.showConfirmDialog(null,"New is updating"); 
        if (changed) {
            int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu file này không ?");
            if (result == JOptionPane.YES_OPTION) {
                operateFile("Save a File", FILE_SAVE, 1);
            }
        }
        taFile.setText("");
        taFile.requestFocus();
        this.setTitle("");
        changed = false;

    }//GEN-LAST:event_miNewActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        //JOptionPane.showMessageDialog(null,"Save is updating"); 
        operateFile("Open a File", FILE_SAVE, 2);
    }//GEN-LAST:event_miSaveActionPerformed

    private void KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_KeyTyped

    private void miwrapwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miwrapwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miwrapwordActionPerformed

    private void miwrapwordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_miwrapwordItemStateChanged
        taFile.setWrapStyleWord(miwrapword.isSelected());
        taFile.setText(taFile.getText());
    }//GEN-LAST:event_miwrapwordItemStateChanged

    private void miwraplineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_miwraplineItemStateChanged
        taFile.setLineWrap(miwrapline.isSelected());
        taFile.setText(taFile.getText());
    }//GEN-LAST:event_miwraplineItemStateChanged
    private void readFile(File file) {
        try {
            taFile.setText("");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                taFile.append(line + "\n");
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to Open file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void writeFile(File file) {
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String data = taFile.getText();
            bw.write(data);
            bw.close();
            fw.close();
            changed = false;
            readFile(file);
            changed = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error to save file: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void operateFile(String title, int type, int order) { // dung de phan biet hai loai open va save
        int choose = -1;
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        switch (type) {
            case FILE_OPEN:
                choose = chooser.showOpenDialog(null);
                break;
            case FILE_SAVE:
                choose = chooser.showSaveDialog(null);
                break;
        }
        if (choose == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            switch (type) {
                case FILE_OPEN:
                    JOptionPane.showMessageDialog(null, "Read a File");
                    readFile(file);
                    this.setTitle(file.getName());
                    break;
                case FILE_SAVE:
                    if (order == 2) {

                        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn lưu file này không ?");
                        if (result == JOptionPane.YES_OPTION) {
                            writeFile(file);
                            this.setTitle(file.getName());
                        }
                        JOptionPane.showMessageDialog(null, "Write a File");
                        writeFile(file);
                    } else {
                        writeFile(file);
                    }
                    break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JCheckBoxMenuItem miwrapline;
    private javax.swing.JCheckBoxMenuItem miwrapword;
    private javax.swing.JTextArea taFile;
    // End of variables declaration//GEN-END:variables
}
