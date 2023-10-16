/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.util;

import com.github.javafaker.Faker;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.sql.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;
import zavrsni_rad.controller.ObradaOperater;
import zavrsni_rad.model.Biljeska;
import zavrsni_rad.model.Klijent;
import zavrsni_rad.model.Operater;
import zavrsni_rad.model.Stanje;
import zavrsni_rad.model.Termin;
import zavrsni_rad.model.Tretman;

/**
 *
 * @author Ana
 */
public class PocetniInsert {
    
    private static final int BROJ_BILJESKI = 12;
    private static final int BROJ_KLIJENATA = 11256;
    private static final int BROJ_TERMINA = 25769;
    private static final int BROJ_TRETMANA = 50237;
    private static final int BROJ_STANJA= 10345;
    
    private Faker faker;
    private Session session;
    private List<Biljeska> biljeske;
    private List<Klijent> klijenti;
    private List<Termin> termini;
    private List<Tretman> tretmani;
    private List<Stanje> stanja;
    
    
    public PocetniInsert() {
        faker = new Faker();
        session = HibernateUtil.getSession();
        biljeske = new ArrayList<>();
        klijenti = new ArrayList<>();
        stanja = new ArrayList<>();
        termini = new ArrayList<>();
        tretmani = new ArrayList<>();
        session.getTransaction().begin();
        
        kreirajKlijente();
        kreirajBiljeske();
        kreirajStanja();
        kreirajTermine();
        kreirajTretmane();
        session.getTransaction().commit();
        lozinka();
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
    
    private void kreirajKlijente() {
        Klijent k;
        for (int i = 0; i < BROJ_KLIJENATA; i++) {
            k = new Klijent();
            k.setIme(faker.name().firstName());
            k.setPrezime(faker.name().lastName());
            k.setKontaktTel(faker.number().digits(8));
            k.seteMail(faker.internet().emailAddress());
            session.persist(k);
            klijenti.add(k);
        }
    }
    
    private void kreirajTermine() {
        
      
        
    }
    
    private void kreirajTretmane() {
        Tretman t;
       
        for (int i = 0; i < BROJ_TRETMANA; i++) {
            t = new Tretman();
            t.setNaziv(faker.superhero().power());
            t.setCijena(faker.number().numberBetween(50, 250));
            session.persist(t);
            tretmani.add(t);
            
        }
    }
    
    private void kreirajBiljeske() {
      
        
   
        
    }
    

    private void kreirajStanja() {
     
        
    }

    
    
}
