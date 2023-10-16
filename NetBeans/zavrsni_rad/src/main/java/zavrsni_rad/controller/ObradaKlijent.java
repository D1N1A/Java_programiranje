/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import zavrsni_rad.model.Klijent;
import zavrsni_rad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaKlijent extends Obrada<Klijent>{
    
    @Override
    public List<Klijent> read() {
        return sesssion.createQuery("from Klijent", Klijent.class).list();
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
        if(!entitet.getIme().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez upisa imena");
        }
        if (!entitet.getPrezime().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez upisa prezimena");
        }
        
        if (!entitet.getKontaktTel().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez kontakta");
        }
    
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
     
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
       // if (!entitet.getTermini().isEmpty()) {
       //     throw new KozmetickiSalonException("Ne može se obrisati klijent koji ima zakazan tretman");
       // }
    }

}


    

