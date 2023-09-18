/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import zavrsni_rad.model.Termin;
import zavrsni_rad.util.KozmetickiSalonException;

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
        if(!entitet.getKlijent().isEmpty()) {
        throw new KozmetickiSalonException("Nije moguće unijeti termin bez klijenta");
    }
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

}