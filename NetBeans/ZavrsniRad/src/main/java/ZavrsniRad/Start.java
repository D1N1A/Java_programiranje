/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zavrsnirad;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.model.Operater;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.PocetniInsert;
import zavrsnirad.view.SplashScreen;

/**
 *
 * @author Ana
 */
public class Start {

    public static void main(String[] args) {
        
      
     //  HibernateUtil.getSession();
      //new PocetniInsert();
     
        
      
      new SplashScreen().setVisible(true);
      //  new Start();
      /*
       ObradaOperater oo = new ObradaOperater();
       
       Operater o = oo.autoriziraj("vlasnik", "Sanja");
       
        System.out.println(o==null ? "Neispravno" : o.getIme());
        */
    }

    
    
    private static void lozinka(){
         // factory pattern
        Argon2 argon2 = Argon2Factory.create();
        
        String hash = argon2.hash(10, 65536, 1, "Sanja".toCharArray());
        
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
   
    
    
        
  

    
  
    
    
   
    
    
 
    
 

    
    
