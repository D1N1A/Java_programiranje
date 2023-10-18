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
    
    private static final int BROJ_BILJESKI = 12;
    private static final int BROJ_KLIJENATA = 11256;
    private static final int BROJ_TERMINA = 25769;
    private static final int BROJ_TRETMANA = 50237;
    private static final int BROJ_STANJA= 11256;
    
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
                
        Termin te;
       
        for (int i = 0; i < BROJ_TERMINA; i++) {
            te = new Termin();
            te.setKlijent(klijenti.get(faker.number().numberBetween(0, BROJ_KLIJENATA-1)));
            te.setDatum(faker.date().birthday(0, 3));
            te.setVrijeme((Time) faker.date().future(21, TimeUnit.HOURS,faker.date().future(59, TimeUnit.MINUTES)));
            
            session.persist(te);
            
        }
      
        
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
        Biljeska b;
        for (int i = 0; i < BROJ_BILJESKI; i++) {
            b = new Biljeska();
            b.setTermin(termini.get(faker.number().numberBetween(0, BROJ_TERMINA-1)));
            b.setTretman(tretmani.get(faker.number().numberBetween(0, BROJ_TRETMANA-1)));
            b.setOpazanje(faker.book().title());
            b.setPreporuka(faker.food().ingredient());
            session.persist(b);
            biljeske.add(b);
         
        }
        
   
        
    }
    

    private void kreirajStanja() {
     
             Stanje s;
        for (int i = 0; i < BROJ_STANJA; i++) {
            s = new Stanje();
            s.setNaziv(faker.medical().diseaseName());
            s.setOpis(faker.medical().medicineName());
            session.persist(s);
            stanja.add(s);
        }
    }

    
    
}
