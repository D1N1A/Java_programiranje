/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.controller;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import zavrsni_rad.model.Operater;
import zavrsni_rad.util.KozmetickiSalonException;


/**
 *
 * @author Ana
 */
public class ObradaOperater extends Obrada<Operater>{

    @Override
    public List<Operater> read() {
        return sesssion.createQuery("from Operater", Operater.class).list();
    }
      
    
    public Operater autoriziraj(String email, String lozinka){
        Operater o;
        
        try {           
        
       
            o = sesssion.createQuery(
                    "from Operater o where o.email=:email", Operater.class)
                    .setParameter("email", email).getSingleResult();

            
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


        
    

     
    
    