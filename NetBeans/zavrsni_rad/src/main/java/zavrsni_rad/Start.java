/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zavrsni_rad;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import zavrsni_rad.controller.ObradaOperater;
import zavrsni_rad.model.Operater;
import zavrsni_rad.util.HibernateUtil;
import zavrsni_rad.util.PocetniInsert;

/**
 *
 * @author Ana
 */
public class Start {

    public static void main(String[] args) {
        
       HibernateUtil.getSession();
      // new PocetniInsert();
        
    }
    private void lozinka(){
         // factory pattern
        Argon2 argon2 = Argon2Factory.create();
        
        String hash = argon2.hash(10, 65536, 1, "oper".toCharArray());
        
        ObradaOperater oo = new ObradaOperater();
        Operater o = new Operater();
        o.setUloga("vlasnik");
        o.setLozinka(hash);
       
        
        oo.setEntitet(o);
        
        try {
            oo.create();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
        
    }

