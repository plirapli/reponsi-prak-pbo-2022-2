/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
        initComponents();
        this.setVisible(true);
        controller.readAllData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableLomba = new javax.swing.JTable();
        inputJudul = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputAlur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputOrisinalitas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputPemilihanKata = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inputCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tableLomba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableLomba.setCellSelectionEnabled(false);
        tableLomba.setRowSelectionAllowed(true);
        tableLomba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLombaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLomba);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Judul");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Alur");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Orisinalitas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pemilihan Kata");

        btnTambah.setText("Tambah");
        btnTambah.setToolTipText("");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel5.setText("Cari Judul");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputJudul)
                    .addComponent(jLabel1)
                    .addComponent(inputAlur, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(inputOrisinalitas, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(inputPemilihanKata, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputAlur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputOrisinalitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPemilihanKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        controller.insertData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tableLombaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLombaMouseClicked
        // TODO add your handling code here:
        int row = tableLomba.getSelectedRow();
        controller.selectFieldData(row);
    }//GEN-LAST:event_tableLombaMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updateData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        controller.searchData();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        controller.clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    public JTextField getInputCari() {
        return inputCari;
    }

    public JTextField getInputAlur() {
        return inputAlur;
    }

    public JTextField getInputJudul() {
        return inputJudul;
    }

    public JTextField getInputOrisinalitas() {
        return inputOrisinalitas;
    }

    public JTextField getInputPemilihanKata() {
        return inputPemilihanKata;
    }

    public JTable getTableLomba() {
        return tableLomba;
    }

    public String getSelectedJudul() {
        return selectedJudul;
    }
    
    public void setSelectedJudul(String judul) {
        this.selectedJudul = judul;
    }
    
    private String selectedJudul;
    Controller controller = new Controller(this);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputAlur;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputJudul;
    private javax.swing.JTextField inputOrisinalitas;
    private javax.swing.JTextField inputPemilihanKata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLomba;
    // End of variables declaration//GEN-END:variables
}
