/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uiAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import kasirapk.connectData;
import logging.logging.ActivityLogger;
/**
 *
 * @author muqta
 */
public class insertProduk extends javax.swing.JFrame {
    private String userName;
    /**
     * Creates new form insertProduk
     */
    public insertProduk(String userName) {
        this.userName = userName;
        initComponents();
    }

    private insertProduk() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbIdProduk = new javax.swing.JLabel();
        lbNamaProduk = new javax.swing.JLabel();
        InputIDProduk = new javax.swing.JTextField();
        InputNamaProduk = new javax.swing.JTextField();
        hargaBeli = new javax.swing.JLabel();
        SelectSatuan = new javax.swing.JComboBox<>();
        InputHargaBeli = new javax.swing.JTextField();
        lbHargaJual = new javax.swing.JLabel();
        lbStok = new javax.swing.JLabel();
        inputHargaJual = new javax.swing.JTextField();
        lbSatuan = new javax.swing.JLabel();
        InputStok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tambah Produk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lbIdProduk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbIdProduk.setText("Id");

        lbNamaProduk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNamaProduk.setText("Nama Produk");

        hargaBeli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hargaBeli.setText("Harga Beli");

        SelectSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- pilih satuan -", "Pcs", "Kg" }));
        SelectSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectSatuanActionPerformed(evt);
            }
        });

        lbHargaJual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHargaJual.setText("Harga Jual");

        lbStok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbStok.setText("Stok");

        lbSatuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSatuan.setText("Satuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbStok)
                                    .addComponent(lbIdProduk)
                                    .addComponent(InputIDProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(hargaBeli)
                                    .addComponent(InputHargaBeli, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(lbHargaJual)
                                    .addComponent(inputHargaJual, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(InputStok, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(lbSatuan)
                                    .addComponent(lbNamaProduk)
                                    .addComponent(InputNamaProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(SelectSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIdProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputIDProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNamaProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaBeli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHargaJual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbStok, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here
        // Mengambil data dari field input
        String IdProduk = InputIDProduk.getText();
        String namaProduk = InputNamaProduk.getText();
        String hargaBeli = InputHargaBeli.getText();
        String hargaJual = inputHargaJual.getText();
        String stok = InputStok.getText();
        String satuan = (String )SelectSatuan.getSelectedItem();

        // Cek apakah ada field yang kosong
        if (IdProduk.isEmpty() || namaProduk.isEmpty() || hargaBeli.isEmpty() || hargaJual.isEmpty() || stok.isEmpty() || satuan.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // SQL untuk menambahkan data user
        String sql = "INSERT INTO tb_produk (id_produk, nama_produk, harga_beli, harga_jual, stok, satuan) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // Koneksi ke database
            Connection conn = connectData.getConnection(); // Menggunakan koneksi dari class koneksi
            PreparedStatement pst = conn.prepareStatement(sql);

            // Mengisi parameter untuk statement SQL
            pst.setString(1, IdProduk);
            pst.setString(2, namaProduk);
            pst.setString(3, hargaBeli);
            pst.setString(4, hargaJual);
            pst.setString(5, stok);
            pst.setString(6, satuan);

            // Eksekusi statement
            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                ActivityLogger.logInsertProduk(this.userName, IdProduk);
                JOptionPane.showMessageDialog(this, "Produk berhasil ditambahkan!");
                // Kosongkan field setelah data berhasil disimpan
                InputIDProduk.setText("");
                InputNamaProduk.setText("");
                InputHargaBeli.setText("");
                inputHargaJual.setText("");
                InputStok.setText("");
                SelectSatuan.setSelectedIndex(0);
            }

            this.dispose(); // Tutup form setelah menyimpan

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void SelectSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectSatuanActionPerformed

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
            java.util.logging.Logger.getLogger(insertProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new insertProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputHargaBeli;
    private javax.swing.JTextField InputIDProduk;
    private javax.swing.JTextField InputNamaProduk;
    private javax.swing.JTextField InputStok;
    private javax.swing.JComboBox<String> SelectSatuan;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel hargaBeli;
    private javax.swing.JTextField inputHargaJual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHargaJual;
    private javax.swing.JLabel lbIdProduk;
    private javax.swing.JLabel lbNamaProduk;
    private javax.swing.JLabel lbSatuan;
    private javax.swing.JLabel lbStok;
    // End of variables declaration//GEN-END:variables
}
