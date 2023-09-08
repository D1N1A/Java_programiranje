/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.util;

import com.github.javafaker.Faker;

import java.math.BigDecimal;
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
 * @author Katedra
 */
public class PocetniInsert {
    
    private static final int BROJ_BILJESKI = 12;
    private static final int BROJ_KLIJENATA = 11256;
    private static final int BROJ_STANJA = 7;
    private static final int BROJ_TERMINA = 25769;
    private static final int BROJ_TRETMANA = 50237;
    
    private Faker faker;
    private Session session;
    private List<Biljeska> biljeske;
    private List<Klijent> klijenti;
    private List<Termin> termini;
    private List<Tretman> tretmani;
    private Object g;
    private Object polaznici;
    
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
        kreirajTretmane
        session.getTransaction().commit();
    }
    
    private void kreirajKlijente() {
        Klijent k;
        for (int i = 0; i < BROJ_KLIJENATA; i++) {
            k = new Klijent();
            k.setIme(faker.name.firstName());
            k.setPrezime(faker.name().lastName());
            k.setKontakt_tel(faker.internet().emailAddress());
            k.setKontakt_tel(faker.phoneNumber());
            session.persist(k);
            klijenti.add(k);
        }
    }
    
    private void kreirajTermine() {
        
        Termin t;
         List<Termini> t;
        for (int i = 0; i < BROJ_TERMINA; i++) {
            t = new Termin();
            t.setIme(faker.name().title();
            t.setCijena(faker.number().numberBetween(50, 200));
            t.setDatum(faker.date().future(i, TimeUnit.DAYS, referenceDate));
            t.setKontakt_tel(faker.phoneNumber();
            t.setMaxTermina(faker.number().numberBetween(5, 30));
            for (int j = 0; j < faker.number().numberBetween(5, t.getMaxtermina; j++) {
                t.add(termini.get(faker.number().numberBetween(0, BROJ_TERMINA - 1)));
            }
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
        List<Biljeske> b;
        for (int i = 0; i < BROJ_BILJESKI; i++) {
            b = new Biljeska();
            b.setMaxbiljeski(faker.number().numberBetween(5, 30));
            b = new ArrayList<>();
            // DZ: Osigurati da jedan polaznik može biti samo jednom na jednoj grupi
            for (int j = 0; j < faker.number().numberBetween(5, g.getMaxbiljeski()); j++) {
               b.add(faker.commerce().productName());
            }
            g.setBiljeske(b);
            
            session.persist(b);
            
        }
        
   
        
    }
    
    private void kreiranjeStanja() {
        Stanje s;
        
    }
    
}
