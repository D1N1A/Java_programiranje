/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import org.hibernate.Session;
import zavrsni_rad.model.Tretman;
import zavrsni_rad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaTretman extends Obrada<Tretman>{

    @Override
    public List<Tretman> read() {
        return sesssion.createQuery("from Tretman", Tretman.class).list();
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
      
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
       
    }

    
    
}
