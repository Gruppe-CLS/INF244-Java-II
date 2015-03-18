package kap4.stakk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 


/**
 *
 * @author Christian
 */
public class StakkView extends javax.swing.JFrame {

    /**
     * Creates new form StakkView
     */
    public StakkView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStakk = new javax.swing.JTextField();
        btnPush = new javax.swing.JButton();
        cboPush = new javax.swing.JComboBox();
        btnPeep = new javax.swing.JButton();
        lblPeep = new javax.swing.JLabel();
        btnPop = new javax.swing.JButton();
        lblPop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtStakk.setText("jTextField1");

        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });

        cboPush.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barn", "Biler", "Båter", "Hus" }));

        btnPeep.setText("Vis øverste");
        btnPeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeepActionPerformed(evt);
            }
        });

        lblPeep.setText("jLabel1");

        btnPop.setText("Hent øverste");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });

        lblPop.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStakk, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboPush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPush))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPeep)
                            .addComponent(btnPop))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPop)
                            .addComponent(lblPeep))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(cboPush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPeep)
                    .addComponent(lblPeep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPop)
                    .addComponent(lblPop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(txtStakk, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Legg til ny i stack'en og skriv ut
    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        // TODO add your handling code here:
        Kontroll.kontroll.pushTallerken(new Tallerken(cboPush.getSelectedItem().toString()));
        visKøen();
    }//GEN-LAST:event_btnPushActionPerformed

    
    
    // Viser frem øverste, uten å slette
    private void btnPeepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeepActionPerformed
        // TODO add your handling code here:
        Tallerken øverst = Kontroll.kontroll.peepTallerken();
        if (øverst != null){
            lblPeep.setText(øverst.getDekor());
        }
        else {
            lblPeep.setText("Ingen tallerkner igjen");
        }
    }//GEN-LAST:event_btnPeepActionPerformed

    // Henter ut øverste og sletter den
    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Tallerken øverst = Kontroll.kontroll.popTallerken();
        if (øverst != null){
            lblPop.setText(øverst.getDekor());
        }
        else {
            lblPop.setText("Ingen tallerkner igjen");
        }
        visKøen();
    }//GEN-LAST:event_btnPopActionPerformed

    
    // Skriver ut alle på textFeltet
    public void visKøen(){
        txtStakk.setText("");
        for (Tallerken tallerken : Kontroll.kontroll.hentAlle()) {
            txtStakk.setText(tallerken.getDekor()+"\n");
            //txtStakk.append(tallerken.getDekor()+"\n");
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
            java.util.logging.Logger.getLogger(StakkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StakkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StakkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StakkView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StakkView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeep;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JComboBox cboPush;
    private javax.swing.JLabel lblPeep;
    private javax.swing.JLabel lblPop;
    private javax.swing.JTextField txtStakk;
    // End of variables declaration//GEN-END:variables
}
