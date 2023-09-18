/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import zavrsni_rad.model.Stanje;
import zavrsni_rad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaStanje extends Obrada<Stanje>{

    @Override
    public List<Stanje> read() {
       return sesssion.createQuery("from Stanje", Stanje.class).list();
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
        if (!entitet.getKlijent().isEmpty()) {
            throw new KozmetickiSalonException("Nije moguće unijeti stanje nepostojećeg klijenta");
        }
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
    }
    
}
