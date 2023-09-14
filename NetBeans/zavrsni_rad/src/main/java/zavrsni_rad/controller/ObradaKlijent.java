/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import org.hibernate.Session;
import zavrsni_rad.model.Klijent;
import zavrsni_rad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaKlijent extends Obrada<Klijent>{
    
    public ObradaKlijent ()  {
        super();
    }
    
    public ObradaKlijent (Klijent k) {
        super(k);
    }

    public Klijent getEntitet() {
        return entitet;
    }

    public void setEntitet(Klijent entitet) {
        this.entitet = entitet;
    }

    public Session getSesssion() {
        return sesssion;
    }

    public void setSesssion(Session sesssion) {
        this.sesssion = sesssion;
    }

    
    
    
    private void kontrolaNaziv () throws KozmetickiSalonException {
        if(entitet.getIme()==null) {
            throw new KozmetickiSalonException("Ime klijenta mora biti upisano");
        }
        if(entitet.getPrezime()==null) {
            throw new KozmetickiSalonException("Prezime klijenta mora biti upisano");
        }
        if (entitet.getIme().isEmpty()) {
            throw new KozmetickiSalonException("Polje ime ne može ostati prazno");
        }
        if (entitet.getPrezime().isEmpty()) {
            throw new KozmetickiSalonException("Polje prezime ne može ostati prazno");
        }
        
    }

    @Override
    public List<Klijent> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


    

