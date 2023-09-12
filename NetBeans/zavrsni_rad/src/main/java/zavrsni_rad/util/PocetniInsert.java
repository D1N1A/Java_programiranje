/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.util;

import com.github.javafaker.Faker;
import java.sql.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;
import zavrsni_rad.model.Biljeska;
import zavrsni_rad.model.Klijent;
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
    private List<Stanja> stanja;
    
    
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
    }
    
    private void kreirajKlijente() {
        Klijent k;
        for (int i = 0; i < BROJ_KLIJENATA; i++) {
            k = new Klijent();
            k.setIme(faker.color().name());
            k.setPrezime(faker.name().lastName());
            k.setKontaktTel(faker.number().digits(8));
            k.seteMail(faker.internet().emailAddress());
            session.persist(k);
            klijenti.add(k);
        }
    }
    
    private void kreirajTermine() {
        
        Termin t;
        for (int i = 0; i < BROJ_TERMINA; i++) {
            t = new Termin();
            t.setKlijent(faker.name().title());
            t.setTretman(faker.name().fullName());
            t.setDatum(faker.date().birthday());
            t.setVrijeme((Time) faker.date().future(i, TimeUnit.DAYS));
            session.persist(t);
            termini.add(t);
            
        }
        
    }
    
    private void kreirajTretmane() {
        Tretman t;
       
        for (int i = 0; i < BROJ_TRETMANA; i++) {
            t = new Tretman();
            t.setNaziv(faker.name().fullName());
            t.setCijena(faker.number().numberBetween(50, 250));
            session.persist(t);
            tretmani.add(t);
            
        }
    }
    
    private void kreirajBiljeske() {
        
        Biljeska b;
  
        for (int i = 0; i < BROJ_BILJESKI; i++) {
            b = new Biljeska();
            b.setOpazanje(faker.app().version());
            b.setPreporuka(faker.business().toString());
            b.setTermin(faker.date().toString());
            b.setTretman(faker.name().fullName());
            
        }
        
   
        
    }
    

    private void kreirajStanja() {
        Stanje s;
        for (int i = 0; i < BROJ_STANJA; i++) {
            s = new Stanje ();
            s.setNaziv(faker.name().nameWithMiddle());
            s.getOpis(faker.artist().name());
            
        }
        
    }

    private static class Stanja {

        public Stanja() {
        }
    }

    private static class Termini {

        public Termini() {
        }
    }

    private static class Biljeske {

        public Biljeske() {
        }
    }

    private static class biljeske {

        public biljeske() {
        }
    }
    
}
