/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Klijent;
import zavrsnirad.model.Termin;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaTermin extends Obrada<Termin>{

    @Override
    public List<Termin> read() {
      return sesssion.createQuery("from Termin", Termin.class).list();
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
     //   if(!entitet.getKlijent().isEmpty()) {
      //  throw new KozmetickiSalonException("Nije moguće unijeti termin bez klijenta");
   // }
        if(entitet.getVrijeme()==null) {
            throw new KozmetickiSalonException("Nije moguće unijeti termin bez vremenske oznake");
        }
        
        if(entitet.getDatum()==null) {
            throw new KozmetickiSalonException("Nije moguće unijeti termin bez oznake datuma");
        }
        
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
        
    }

    public void setEntitet(Klijent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}