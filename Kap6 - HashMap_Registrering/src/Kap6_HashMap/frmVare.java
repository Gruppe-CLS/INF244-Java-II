/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kap6_HashMap;

import java.awt.Component;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.awt.Dialog;

/**
 *
 * @author Christian
 */
public class frmVare extends javax.swing.JFrame {
    private DefaultListModel<Vare> listeModell = new DefaultListModel<>();
    private Component frame;

    /**
     * Creates new form frmVare
     */
    @SuppressWarnings("unchecked")
    public frmVare() {
        initComponents();
        lstListe.setModel(listeModell);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JTabbedPane();
        tabRegVare = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegNy = new javax.swing.JButton();
        txtVarenrRegNy = new javax.swing.JTextField();
        txtVarenavnRegNy = new javax.swing.JTextField();
        tabSlett = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSlett = new javax.swing.JButton();
        lblVarenr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tabEndre = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEndre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEndring = new javax.swing.JTextField();
        lblVarenrEndre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListe = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Varenr:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Varenavn:");

        btnRegNy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRegNy.setText("Registrer");
        btnRegNy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegNyActionPerformed(evt);
            }
        });

        txtVarenrRegNy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtVarenavnRegNy.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout tabRegVareLayout = new javax.swing.GroupLayout(tabRegVare);
        tabRegVare.setLayout(tabRegVareLayout);
        tabRegVareLayout.setHorizontalGroup(
            tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRegVareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegNy)
                    .addGroup(tabRegVareLayout.createSequentialGroup()
                        .addGroup(tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVarenavnRegNy, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVarenrRegNy, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(594, Short.MAX_VALUE))
        );
        tabRegVareLayout.setVerticalGroup(
            tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRegVareLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVarenrRegNy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(tabRegVareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVarenavnRegNy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnRegNy)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Panel.addTab("Registrer Vare", tabRegVare);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Vare som skal slettes:");

        btnSlett.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSlett.setText("Slett");
        btnSlett.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlettActionPerformed(evt);
            }
        });

        lblVarenr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setText("Velg vare som skal slettes fra listen nedenfor.");

        javax.swing.GroupLayout tabSlettLayout = new javax.swing.GroupLayout(tabSlett);
        tabSlett.setLayout(tabSlettLayout);
        tabSlettLayout.setHorizontalGroup(
            tabSlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSlettLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabSlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabSlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSlett)
                        .addGroup(tabSlettLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(lblVarenr, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addContainerGap(589, Short.MAX_VALUE))
        );
        tabSlettLayout.setVerticalGroup(
            tabSlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSlettLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(tabSlettLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblVarenr))
                .addGap(18, 18, 18)
                .addComponent(btnSlett)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        Panel.addTab("Slett Vare", tabSlett);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Varenr:");

        btnEndre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEndre.setText("Endre");
        btnEndre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Endring (+/-):");

        txtEndring.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblVarenrEndre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout tabEndreLayout = new javax.swing.GroupLayout(tabEndre);
        tabEndre.setLayout(tabEndreLayout);
        tabEndreLayout.setHorizontalGroup(
            tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEndreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEndre)
                    .addGroup(tabEndreLayout.createSequentialGroup()
                        .addGroup(tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndring, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(lblVarenrEndre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(137, 137, 137)))
                .addContainerGap(509, Short.MAX_VALUE))
        );
        tabEndreLayout.setVerticalGroup(
            tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEndreLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblVarenrEndre))
                .addGap(45, 45, 45)
                .addGroup(tabEndreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndring, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnEndre)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        Panel.addTab("Endre Vare", tabEndre);

        lstListe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstListe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegNyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegNyActionPerformed
        // TODO add your handling code here:
        int varenr;
        String varenavn;
        varenr = parseInt(txtVarenrRegNy.getText());
        varenavn = txtVarenavnRegNy.getText();
        
        Vare vare = new Vare(varenr, varenavn);
        Kontroll.kontroll.regNy(varenr, vare);
        visAlle();
        txtVarenavnRegNy.setText(null);
        txtVarenrRegNy.setText(null);
    }//GEN-LAST:event_btnRegNyActionPerformed

    private void btnSlettActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlettActionPerformed
        // TODO add your handling code here:
        Vare vare = (Vare)lstListe.getSelectedValue();
        int varenr = vare.getVarenr();
        Kontroll.kontroll.slett(varenr);
        visAlle();
        lblVarenr.setText(null);
    }//GEN-LAST:event_btnSlettActionPerformed

    private void lstListeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListeMouseClicked
        // TODO add your handling code here:
        Vare vare = (Vare)lstListe.getSelectedValue();
        String navn = vare.getVarenavn();
        int varenr = vare.getVarenr();
        String nr = Integer.toString(varenr);
        lblVarenr.setText(navn);
        lblVarenrEndre.setText(nr);
    }//GEN-LAST:event_lstListeMouseClicked

    private void btnEndreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndreActionPerformed
        Vare vare = (Vare)lstListe.getSelectedValue();
        int varenr = vare.getVarenr();
        int endring = parseInt(txtEndring.getText());
        Kontroll.kontroll.endre(varenr, endring);
        visAlle();
        lblVarenrEndre.setText(null);
        txtEndring.setText(null);
        
    }//GEN-LAST:event_btnEndreActionPerformed

    public void visAlle() {
        int i;
        HashMap<Integer, Vare> varer = Kontroll.kontroll.hentListe();
        listeModell.removeAllElements();
        /* Kan altså ikke loope igjennom som jeg trodde.
        for(i=0; i < list.size(); i++) {
            Vare vare = list.get(i);
            ut.add(vare);
        }
        Dette gikk ikke.. veit ikkje kvifor..
        */
        
        for(Vare vare:varer.values()) {
            listeModell.addElement(vare);
            // JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
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
            java.util.logging.Logger.getLogger(frmVare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Panel;
    private javax.swing.JButton btnEndre;
    private javax.swing.JButton btnRegNy;
    private javax.swing.JButton btnSlett;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblVarenr;
    private javax.swing.JLabel lblVarenrEndre;
    private javax.swing.JList lstListe;
    private javax.swing.JPanel tabEndre;
    private javax.swing.JPanel tabRegVare;
    private javax.swing.JPanel tabSlett;
    private javax.swing.JTextField txtEndring;
    private javax.swing.JTextField txtVarenavnRegNy;
    private javax.swing.JTextField txtVarenrRegNy;
    // End of variables declaration//GEN-END:variables
}
