/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaBiljeska;
import zavrsnirad.controller.ObradaKlijent;
import zavrsnirad.controller.ObradaTermin;
import zavrsnirad.model.Biljeska;
import zavrsnirad.model.Klijent;
import zavrsnirad.model.Termin;
import zavrsnirad.util.Alati;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ProzorTermin extends javax.swing.JFrame implements KozmetickiSalonViewSucelje {

    private ObradaTermin obrada;
    private ObradaBiljeska obradaBiljeska;
    
    
  
    /**
     * Creates new form ProzorTermin
     */
  public ProzorTermin() {
        initComponents();
         setTitle(Alati.KOZMETICKI_SALON + " | TERMINI");
         
         obrada = new ObradaTermin();
         obradaBiljeska = new ObradaBiljeska();
         ucitajKlijente();
         definirajDatum();
         ucitaj();
         
        
         
    }
  
  public ObradaTermin getObradaTermin(){
        return obrada;
    }
    
    
    private void definirajDatum(){
         DatePickerSettings dps = new DatePickerSettings(Locale.of("hr","HR"));
         dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
         dps.setTranslationClear("Očisti");
         dps.setTranslationToday("Danas");
         dtpDatumPocetka.datePicker.setSettings(dps);
         
         TimePickerSettings tps = dtpDatumPocetka.timePicker.getSettings();
    
         tps.setFormatForDisplayTime("HH:mm");
         tps.use24HourClockFormat();
         
         ArrayList<LocalTime> lista = new ArrayList<>();
         for(int i =0;i<24;i++){
             for(int j = 0;j<60;j=j+10){
                 lista.add(LocalTime.of(i,j));
             }
         }
         
         tps.generatePotentialMenuTimes(lista);
         
         
         
     }
    
   
    
    private void ucitajKlijente () {
        DefaultComboBoxModel<Klijent> m = new DefaultComboBoxModel <> ();
        Klijent k = new Klijent ();
        k.setSifra(0);
        k.setIme("Odaberite");
        k.setPrezime("klijenta");
        m.addElement(k);
        
        m.addAll(new ObradaKlijent().read());
        
        cmbKlijenti.setModel(m);
        cmbKlijenti.repaint();
        
        
        
    }
   

         
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTermini = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbKlijenti = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTermini = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBiljeske = new javax.swing.JList<>();
        lblBiljeska = new javax.swing.JLabel();
        btnUpravljajBiješkama = new javax.swing.JButton();
        dtpDatumPocetka = new com.github.lgooddatepicker.components.DateTimePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTermini.setText("Zakazani termini");

        jLabel1.setText("Datum i vrijeme");

        jLabel2.setText("Klijent");

        lstTermini.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTerminiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstTermini);

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

        lstBiljeske.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstBiljeske);

        lblBiljeska.setText("Bilješka");

        btnUpravljajBiješkama.setText("Upravljaj bilješkama");
        btnUpravljajBiješkama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravljajBiješkamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTermini, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbKlijenti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPromjena))
                    .addComponent(dtpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBiljeska)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnUpravljajBiješkama, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTermini, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBiljeska, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbKlijenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dtpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnPromjena)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnObrisi)
                            .addComponent(btnUpravljajBiješkama)))
                    .addComponent(jScrollPane1))
                .addGap(74, 74, 74))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        obrada.setEntitet(new Termin());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (KozmetickiSalonException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());

        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        if(lstTermini.getSelectedValue()==null){
            return;
        }

        var e = lstTermini.getSelectedValue();

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
        if(lstTermini.getSelectedValue()==null){
            return;
        }

        var e = lstTermini.getSelectedValue();

        if (JOptionPane.showConfirmDialog(getRootPane(), e , "Sigurno obrisati?",
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

    private void btnUpravljajBiješkamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravljajBiješkamaActionPerformed

       new ProzorUpravljanjeBiljeskama(this).setVisible(true); 
    }//GEN-LAST:event_btnUpravljajBiješkamaActionPerformed

    private void lstTerminiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTerminiValueChanged
        
            if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstTermini.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstTermini.getSelectedValue());

        popuniView();
       
               
    }//GEN-LAST:event_lstTerminiValueChanged
    
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JButton btnUpravljajBiješkama;
    private javax.swing.JComboBox<Klijent> cmbKlijenti;
    private com.github.lgooddatepicker.components.DateTimePicker dtpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBiljeska;
    private javax.swing.JLabel lblTermini;
    private javax.swing.JList<Biljeska> lstBiljeske;
    private javax.swing.JList<Termin> lstTermini;
    // End of variables declaration//GEN-END:variables

     @Override
    public void ucitaj() {
         DefaultListModel<Termin> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstTermini.setModel(m);
        lstTermini.repaint();
       
    }

    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        
        e.setKlijent((Klijent)cmbKlijenti.getSelectedItem());
 
  
    
     LocalDate ld = dtpDatumPocetka.datePicker.getDate();
        LocalTime lt = dtpDatumPocetka.timePicker.getTime();
        
        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        
        e.setDatum(java.sql.Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));
    }
    
    @Override
    public void popuniView() {
        var e = obrada.getEntitet();
        
   
       cmbKlijenti.setSelectedItem(e.getKlijent());
       
       
       
        if(e.getKlijent()==null){
            cmbKlijenti.setSelectedIndex(0);
        }else{
            cmbKlijenti.setSelectedItem(e.getKlijent());
        }
        
        
        
       if(e.getDatum()==null){
            dtpDatumPocetka.datePicker.setDate(null);
            dtpDatumPocetka.timePicker.setTime(null);
        }else{
            LocalDate ld = e.getDatum().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            dtpDatumPocetka.datePicker.setDate(ld);
            
            LocalTime lt = e.getDatum().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalTime();
            dtpDatumPocetka.timePicker.setTime(lt);
        }
        
   
        
        DefaultListModel<Biljeska> m = new DefaultListModel<>();
        m.addAll(e.getBiljeske());
        lstBiljeske.setModel(m);
        lstBiljeske.repaint();
        }
        
}
