/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Biljeska;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaBiljeska extends Obrada<Biljeska>{
    
    @Override
    public List<Biljeska> read () {
        return sesssion.createQuery("from Biljeska b order by b.sifra desc",Biljeska.class)
               .setMaxResults(20)
               .list();
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
