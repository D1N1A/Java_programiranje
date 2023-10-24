/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaTretman;
import zavrsnirad.model.Klijent;
import zavrsnirad.model.Tretman;
import zavrsnirad.util.Alati;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ProzorTretman extends javax.swing.JFrame implements KozmetickiSalonViewSucelje {
    
    private ObradaTretman obrada;
    private DecimalFormat df;

    /**
     * Creates new form ProzorTretman
     */
    public ProzorTretman() {
         initComponents();
         setTitle(Alati.KOZMETICKI_SALON + " | TRETMANI");
         
                  obrada = new ObradaTretman();
                   DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.of("hr", "HR"));
                    df = new DecimalFormat("###,##0.00", dfs);
                  ucitaj();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTretmani = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Popis tretmana");

        lstTretmani.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstTretmani.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTretmaniValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTretmani);

        jLabel2.setText("Naziv");

        jLabel3.setText("Cijena");

        txtCijena.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCijena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCijenaKeyPressed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjeni");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnObrisi)
                                    .addComponent(btnPromjena))
                                .addGap(56, 56, 56))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi)
                        .addGap(28, 28, 28))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstTretmaniValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTretmaniValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstTretmani.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstTretmani.getSelectedValue());

        popuniView();
    }//GEN-LAST:event_lstTretmaniValueChanged

    private void txtCijenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCijenaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaKeyPressed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        obrada.setEntitet(new Tretman());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (KozmetickiSalonException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        if(lstTretmani.getSelectedValue()==null){
            return;
        }

        var e = lstTretmani.getSelectedValue();

        obrada.setEntitet(e);
        popuniModel();

        try {
            obrada.update();
            ucitaj();
        } catch (KozmetickiSalonException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
            obrada.refresh();
        }

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstTretmani.getSelectedValue()==null){
            return;
        }

        var e = lstTretmani.getSelectedValue();

        if (JOptionPane.showConfirmDialog(getRootPane(), e.getNaziv() , "Sigurno obrisati?",
            JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION){
        return;
        }

        obrada.setEntitet(e);

        try {
            obrada.delete();
            ucitaj();
        } catch (KozmetickiSalonException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnObrisiActionPerformed

    @Override
    public void ucitaj() {
        DefaultListModel<Tretman> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstTretmani.setModel(m);
        lstTretmani.repaint();
       
    }

    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        try {
            e.setCijena(BigDecimal.valueOf(df.parse(txtCijena.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setCijena(null);
        }
        
    }

    @Override
    public void popuniView() {
        var e = obrada.getEntitet();
        txtNaziv.setText(e.getNaziv());
          try {
            txtCijena.setText(df.format(e.getCijena()));
        } catch (Exception ex) {
            txtCijena.setText(df.format(0));
        }
         
        
    }
    /**
     * @param args the command line arguments
     */

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Tretman> lstTretmani;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
