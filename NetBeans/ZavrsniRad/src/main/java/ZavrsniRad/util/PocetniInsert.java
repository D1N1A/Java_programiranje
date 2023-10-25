/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import com.github.javafaker.Faker;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.math.BigDecimal;
import java.sql.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;
import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.model.Biljeska;
import zavrsnirad.model.Klijent;
import zavrsnirad.model.Operater;
import zavrsnirad.model.Stanje;
import zavrsnirad.model.Termin;
import zavrsnirad.model.Tretman;

/**
 *
 * @author Ana
 */
public class PocetniInsert {
    
    private static final int BROJ_BILJESKI = 52;
    private static final int BROJ_KLIJENATA = 25;
    private static final int BROJ_TERMINA = 52;
    private static final int BROJ_TRETMANA = 52;
    private static final int BROJ_STANJA= 25;
    
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
          kreirajTretmane();
          kreirajStanja();
          
       kreirajTermine();
       kreirajBiljeske();
        
    
     
        
        session.getTransaction().commit();
        lozinka();
    }
    
     private void lozinka(){
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
                
        Termin te;
       
        for (int i = 0; i < BROJ_TERMINA; i++) {
            te = new Termin();
            te.setKlijent(klijenti.get(faker.number().numberBetween(0, BROJ_KLIJENATA-1)));
            te.setDatum(faker.date().birthday(0, 3));
            te.setVrijeme(new Time(System.currentTimeMillis()));
            
            session.persist(te);
            termini.add(te);
        }
      
        
    }
    
    private void kreirajTretmane() {
        Tretman t;
       
        for (int i = 0; i < BROJ_TRETMANA; i++) {
            t = new Tretman();
            t.setNaziv(faker.superhero().power());
            t.setCijena(new BigDecimal(faker.number().numberBetween(50, 250)));
            session.persist(t);
            tretmani.add(t);
            
        }
    }
    
    private void kreirajBiljeske() {
        Biljeska b;
        List<Termin> te;
        for (int i = 0; i < BROJ_BILJESKI; i++) {
            b = new Biljeska();
            b.setTermin(termini.get(faker.number().numberBetween(0, BROJ_TERMINA-1)));
            b.setTretman(tretmani.get(faker.number().numberBetween(0, BROJ_TRETMANA-1)));
            b.setOpazanje(faker.book().title());
            b.setPreporuka(faker.food().ingredient());
            te= new ArrayList<>();
            for (int j = 0; j < faker.number().numberBetween(0, 5); j++) {
                te.add(termini.get(faker.number().numberBetween(0, BROJ_TERMINA - 1)));
            }
            b.setTermini(te);
            
            
            
            session.persist(b);
           
         
        }
        
   
        
    }
    

    private void kreirajStanja() {
     
             Stanje s;
             List <Klijent> k;
             
        for (int i = 0; i < BROJ_STANJA; i++) {
            s = new Stanje();
            s.setNaziv(faker.medical().diseaseName());
            s.setOpis(faker.medical().medicineName());
            
            k = new ArrayList<>();
            
             for (int j = 0; j < faker.number().numberBetween(0, 5); j++) {
                k.add(klijenti.get(faker.number().numberBetween(0, BROJ_KLIJENATA - 1)));
            }
            s.setKlijenti(k);
            
            session.persist(s);
           
        }
    }

    
    
}
