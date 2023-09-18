/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import java.util.List;
import zavrsni_rad.model.Biljeska;
import zavrsni_rad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaBiljeska extends Obrada<Biljeska>{
    
    @Override
    public List<Biljeska> read () {
        return sesssion.createQuery("from Biljeska", Biljeska.class).list();
    }

   

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
        
    }

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
       
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
        
    }


}
