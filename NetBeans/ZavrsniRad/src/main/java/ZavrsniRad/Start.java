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

/**
 *
 * @author Ana
 */
public class Start {

    public static void main(String[] args) {
        
      
      //  HibernateUtil.getSession();
      new PocetniInsert();
        
    }
   
    
    
        
    }

    
  
    
    
   
    
    
 
    
 

    
    
