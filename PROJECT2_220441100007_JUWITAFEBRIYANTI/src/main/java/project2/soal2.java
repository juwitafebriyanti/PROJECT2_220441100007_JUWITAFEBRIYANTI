/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author juwit
 */
public class soal2 extends javax.swing.JFrame {

    /**
     * Creates new form soal2
     */
    public soal2() {
        initComponents();
        eJumlah.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        nasicampur = new javax.swing.JRadioButton();
        nasipecel = new javax.swing.JRadioButton();
        sotoayam = new javax.swing.JRadioButton();
        rawon = new javax.swing.JRadioButton();
        nasikuning = new javax.swing.JRadioButton();
        esteh = new javax.swing.JRadioButton();
        popice = new javax.swing.JRadioButton();
        jusbuah = new javax.swing.JRadioButton();
        lemontea = new javax.swing.JRadioButton();
        escampur = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bTambah = new javax.swing.JButton();
        bKurang = new javax.swing.JButton();
        eJumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbPesan = new javax.swing.JLabel();
        lbJumlah = new javax.swing.JLabel();
        bBeli = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 24)); // NOI18N
        jLabel2.setText("SELAMAT DATANG DI WARUNGKU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        menu.add(nasicampur);
        nasicampur.setText("Nasi Campur");
        getContentPane().add(nasicampur, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        menu.add(nasipecel);
        nasipecel.setText("Nasi Pecel");
        nasipecel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasipecelActionPerformed(evt);
            }
        });
        getContentPane().add(nasipecel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        menu.add(sotoayam);
        sotoayam.setText("Soto Ayam");
        getContentPane().add(sotoayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        menu.add(rawon);
        rawon.setText("Rawon");
        getContentPane().add(rawon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        menu.add(nasikuning);
        nasikuning.setText("Nasi Kuning");
        getContentPane().add(nasikuning, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        menu.add(esteh);
        esteh.setText("Es Teh");
        esteh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estehActionPerformed(evt);
            }
        });
        getContentPane().add(esteh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        menu.add(popice);
        popice.setText("Pop Ice");
        getContentPane().add(popice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        menu.add(jusbuah);
        jusbuah.setText("Jus Buah");
        getContentPane().add(jusbuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        menu.add(lemontea);
        lemontea.setText("Lemon Tea");
        getContentPane().add(lemontea, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        menu.add(escampur);
        escampur.setText("Es Campur");
        getContentPane().add(escampur, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Jumlah Beli");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 6, -1, -1));

        bTambah.setText("+");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });
        jPanel1.add(bTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 33, -1, -1));

        bKurang.setText("-");
        bKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKurangActionPerformed(evt);
            }
        });
        jPanel1.add(bKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 33, -1, -1));

        eJumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eJumlah.setToolTipText("");
        jPanel1.add(eJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 77, 34));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Informasi Pesanan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 145, -1, -1));

        jLabel5.setText("Pesanan Anda");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 172, 81, -1));

        jLabel6.setText("Jumlah Pesanan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 210, 100, 22));

        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 10, -1));

        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 10, 20));
        jPanel1.add(lbPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 172, 150, 16));
        jPanel1.add(lbJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 216, 150, 16));

        bBeli.setText("Beli");
        bBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBeliActionPerformed(evt);
            }
        });
        jPanel1.add(bBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 108, -1, -1));

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        jPanel1.add(bHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 108, -1, -1));

        jLabel9.setText("Harga");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, -1, -1));

        jLabel10.setText(":");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 10, 20));

        jLabel11.setText("Total");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 238, -1, -1));

        jLabel12.setText(":");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 10, 30));
        jPanel1.add(lbHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 194, 150, 16));
        jPanel1.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 238, 152, 16));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 280, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Praktikum\\menu2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nasipecelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasipecelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nasipecelActionPerformed

    private void estehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estehActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        int jumlah = Integer.parseInt(eJumlah.getText());
            jumlah++;
            eJumlah.setText(Integer.toString(jumlah));
    }//GEN-LAST:event_bTambahActionPerformed

    private void bKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKurangActionPerformed
        int jumlah = Integer.parseInt(eJumlah.getText());
        if (jumlah > 0) {
            jumlah--;
            eJumlah.setText(Integer.toString(jumlah));
        }
    }//GEN-LAST:event_bKurangActionPerformed

    private void bBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBeliActionPerformed
       String pesanan = "";
        int harga = 0;

        if (nasicampur.isSelected()) {
            pesanan = "Nasi Campur";
            harga = 8000;
        } else if (nasipecel.isSelected()) {
            pesanan = "Nasi Pecel";
            harga = 8000;
        }else if (sotoayam.isSelected()) {
            pesanan = "Soto Ayam";
            harga = 10000;
        }else if (rawon.isSelected()) {
            pesanan = "Rawon";
            harga = 10000;
        }else if (nasikuning.isSelected()) {
            pesanan = "Nasi Kuning";
            harga = 8000;
        }else if (esteh.isSelected()) {
            pesanan = "Es Teh";
            harga = 3000;
        }else if (popice.isSelected()) {
            pesanan = "Pop Ice";
            harga = 3000;
        }else if (jusbuah.isSelected()) {
            pesanan = "Jus Buah";
            harga = 7000;
        }else if (lemontea.isSelected()) {
            pesanan = "Lemon Tea";
            harga = 5000;
        }else if (escampur.isSelected()) {
            pesanan = "Es Campur";
            harga = 5000;
        }
        
        int jumlah = Integer.parseInt(eJumlah.getText());

        int totalHarga = harga * jumlah;
        lbTotal.setText("Rp" + totalHarga);
  
        if (pesanan != null && jumlah > 0) {
            lbPesan.setText(pesanan);
            lbHarga.setText("Rp" + Integer.toString(harga));
            lbJumlah.setText(Integer.toString(jumlah));
        } else {
            JOptionPane.showMessageDialog(null, "Pilih menu dan pastikan jumlah beli lebih dari 0.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bBeliActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        menu.clearSelection();
    eJumlah.setText("0");
    lbPesan.setText("");
    lbJumlah.setText("");
    lbTotal.setText("");
    lbHarga.setText("");
    }//GEN-LAST:event_bHapusActionPerformed

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
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(soal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new soal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBeli;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKurang;
    private javax.swing.JButton bTambah;
    private javax.swing.JTextField eJumlah;
    private javax.swing.JRadioButton escampur;
    private javax.swing.JRadioButton esteh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jusbuah;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbJumlah;
    private javax.swing.JLabel lbPesan;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JRadioButton lemontea;
    private javax.swing.ButtonGroup menu;
    private javax.swing.JRadioButton nasicampur;
    private javax.swing.JRadioButton nasikuning;
    private javax.swing.JRadioButton nasipecel;
    private javax.swing.JRadioButton popice;
    private javax.swing.JRadioButton rawon;
    private javax.swing.JRadioButton sotoayam;
    // End of variables declaration//GEN-END:variables
}
