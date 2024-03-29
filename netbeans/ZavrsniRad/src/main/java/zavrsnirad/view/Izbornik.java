/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import zavrsnirad.util.Alati;

/**
 *
 * @author Ana
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(Alati.KOZMETICKI_SALON + "| IZBORNIK");
      lblOperater.setText(Alati.getOperater());
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        cp = new com.github.lgooddatepicker.components.CalendarPanel();
        jToolBar1 = new javax.swing.JToolBar();
        lblOperater = new javax.swing.JLabel();
        btnTermini = new javax.swing.JButton();
        btnKlijenti = new javax.swing.JButton();
        btnTretmani = new javax.swing.JButton();
        btnStanja = new javax.swing.JButton();
        btnBiljeska = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cp.setOpaque(false);

        jToolBar1.setRollover(true);
        jToolBar1.add(lblOperater);

        btnTermini.setText("Termini");
        btnTermini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminiActionPerformed(evt);
            }
        });

        btnKlijenti.setText("Klijenti");
        btnKlijenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKlijentiActionPerformed(evt);
            }
        });

        btnTretmani.setText("Tretmani");
        btnTretmani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTretmaniActionPerformed(evt);
            }
        });

        btnStanja.setText("Stanja");
        btnStanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStanjaActionPerformed(evt);
            }
        });

        btnBiljeska.setText("Bilješke");
        btnBiljeska.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiljeskaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnKlijenti, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTermini, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTretmani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBiljeska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnTermini)
                .addGap(18, 18, 18)
                .addComponent(btnKlijenti)
                .addGap(18, 18, 18)
                .addComponent(btnTretmani)
                .addGap(18, 18, 18)
                .addComponent(btnStanja)
                .addGap(18, 18, 18)
                .addComponent(btnBiljeska)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminiActionPerformed
  new ProzorTermin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminiActionPerformed

    private void btnKlijentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKlijentiActionPerformed
  new ProzorKlijent().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnKlijentiActionPerformed

    private void btnTretmaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTretmaniActionPerformed
  new ProzorTretman().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTretmaniActionPerformed

    private void btnBiljeskaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiljeskaActionPerformed
  new ProzorBiljeska().setVisible(true);
    }//GEN-LAST:event_btnBiljeskaActionPerformed

    private void btnStanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStanjaActionPerformed
 new ProzorStanje().setVisible(true);//new ProzorStanje().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnStanjaActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiljeska;
    private javax.swing.JButton btnKlijenti;
    private javax.swing.JButton btnStanja;
    private javax.swing.JButton btnTermini;
    private javax.swing.JButton btnTretmani;
    private com.github.lgooddatepicker.components.CalendarPanel cp;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblOperater;
    // End of variables declaration//GEN-END:variables
}
