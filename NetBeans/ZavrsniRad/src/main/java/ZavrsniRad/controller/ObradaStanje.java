/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Stanje;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaStanje extends Obrada<Stanje>{

    @Override
    public List<Stanje> read() {
       return sesssion.createQuery("from Stanje s order by s.sifra desc",Stanje.class)
               .setMaxResults(20)
               .list();
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
      //  if (!entitet.getKlijent().isEmpty()) {
       //     throw new KozmetickiSalonException("Nije moguće unijeti stanje nepostojećeg klijenta");
      //  }
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
    }
    
}
