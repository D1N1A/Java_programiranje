/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import zavrsnirad.model.Operater;
import zavrsnirad.util.KozmetickiSalonException;


/**
 *
 * @author Ana
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
        return sesssion.createQuery("from Operater", Operater.class).list();
    }
      
    
    public Operater autoriziraj(String uloga, String lozinka){
        Operater o;
        
        try {           
        
       
            o = sesssion.createQuery(
                    "from Operater o where o.uloga=:uloga", Operater.class)
                    .setParameter("uloga", uloga).getSingleResult();

            
              Argon2 argon2 = Argon2Factory.create();
              
              return argon2.verify(o.getLozinka(), lozinka.toCharArray()) ? o : null;
              
        } catch (Exception e) {
            return null;
        }
        
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


        
    

     
    
    