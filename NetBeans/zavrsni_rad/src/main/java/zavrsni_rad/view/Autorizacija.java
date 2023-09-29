/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsni_rad.view;


import zavrsni_rad.controller.ObradaOperater;
import zavrsni_rad.model.Operater;
import zavrsni_rad.util.Alati;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;


/**
 *
 * @author Ana
 */
public class Autorizacija extends javax.swing.JFrame {

    /**
     * Creates new form Autorizacija
     */
        
        private ObradaOperater obrada;

       public Autorizacija() {
           initComponents();
           obrada = new ObradaOperater();
           setTitle(Alati.KOZMETICKI_SALON);
       }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        btnAutoriziraj = new javax.swing.JButton();
        btnLozinka = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("oper");
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        txtEmail.setText("oper@edunova.hr");
        jScrollPane1.setViewportView(txtEmail);

        jLabel2.setText("Lozinka");

        btnAutoriziraj.setText("Autoriziraj");
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        btnLozinka.setText("oper");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnLozinka)
                            .addComponent(btnAutoriziraj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addContainerGap(254, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
        // TODO addreset();
        
        var email = txtEmail.getText().trim();
        
        if(email.isEmpty()){
            lblEmailPoruka.setText("Email obavezno");
            postaviGresku(txtEmail);
            return;
        }
        
        if(!EmailValidator.getInstance().isValid(email)){
             lblEmailPoruka.setText("Upisani tekst nije email");
             postaviGresku(txtEmail);
             return;
        }
        
        if(txtLozinka.getPassword().length==0){
            postaviGresku(txtLozinka);
            return;
        }
        
        
        Operater o = obrada.autoriziraj(email, new String(txtLozinka.getPassword()));
        
        if(o==null){
            JOptionPane.showMessageDialog(getRootPane(), 
                    "Neispravna kombinacija email i lozinka");
            return;
        }
        
        //ja sam sigran da si logiran i onda idemo dalje
        Operater logiran = new Operater();
        logiran.setIme(o.getIme());
        logiran.setPrezime(o.getPrezime());
        logiran.setUloga(o.getUloga());
        
        Alati.OPERATER=logiran;
        
        new Izbornik().setVisible(true);
        dispose();
         your handling code here:
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    /**
     * @param args the command line arguments
     */

 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JPasswordField btnLozinka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane txtEmail;
    // End of variables declaration//GEN-END:variables
}