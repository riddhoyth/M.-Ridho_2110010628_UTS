/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ryelozn
 */
import javax.swing.*;
import java.awt.*;

public class CatatanHarianFrame extends javax.swing.JFrame {

    public CatatanHarianFrame() {
        initComponents();
        addButton.addActionListener(e -> tambahCatatan());
        deleteButton.addActionListener(e -> hapusCatatan());
    }

    private void tambahCatatan() {
        String catatanBaru = JOptionPane.showInputDialog(this, "Masukkan catatan harian:");
        if (catatanBaru != null && !catatanBaru.isEmpty()) {
            jTextArea1.append(catatanBaru + "\n");
        }
    }

    private void hapusCatatan() {
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus semua catatan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            jTextArea1.setText("");
        }
    }
    // </editor-fold>


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        catatanTextArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        catatanTextArea.setViewportView(jTextArea1);

        addButton.setText("jButton1");
        addButton.setActionCommand("addButton");

        deleteButton.setText("jButton2");
        deleteButton.setActionCommand("deleteButton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton)
                    .addComponent(addButton)
                    .addComponent(catatanTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(catatanTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatatanHarianFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new CatatanHarianFrame().setVisible(true));
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JScrollPane catatanTextArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
