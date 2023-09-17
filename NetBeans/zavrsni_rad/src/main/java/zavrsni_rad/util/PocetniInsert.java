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
import org.checkerframework.checker.units.qual.t;
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
        
        Termin t;
        List<Klijent> k;
        List <Tretman> tr;
        for (int i = 0; i < BROJ_TERMINA; i++) {
            k=new ArrayList<>();
            tr = new ArrayList <>();
            t = new Termin(); 
            t.setKlijent((String) k.getClass().arrayType().cast(k));
            t.setTretman((String) tr.getClass().arrayType().cast(tr));
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
            t.setNaziv(faker.superhero().power());
            t.setCijena(faker.number().numberBetween(50, 250));
            session.persist(t);
            tretmani.add(t);
            
        }
    }
    
    private void kreirajBiljeske() {
        
        Biljeska b;
        List <Termin> t; 
        List <Tretman> tr;
        for (int i = 0; i < BROJ_BILJESKI; i++) {
            b = new Biljeska();
            t= new ArrayList<>();
            t = (List<Termin>) new Termin ();
            tr = (List<Tretman>) new Tretman ();
            b.setOpazanje(faker.app().version());
            b.setPreporuka(faker.business().toString());
            b.setTermin((String) t.getClass().arrayType().cast(t));
            b.setTretman((String) t.getClass().arrayType().cast(tr));
            
        }
        
   
        
    }
    

    private void kreirajStanja() {
        Stanje s;
        List<Biljeska> b;
        for (int i = 0; i < BROJ_STANJA; i++) {
            s = new Stanje ();
            s.setNaziv(faker.friends().character());
            s.setOpis(faker.artist().name());
            b =new ArrayList<>();
            for (int j = 0; j < faker.number().numberBetween(0, s.getMaxbiljeski()); j++) {
                b.add(biljeske.get(faker.number().numberBetween(0, BROJ_BILJESKI - 1)));
            }
            s.setBiljeske(b);
            
           session.persist(s);
                
           
        }
        
    }

    
    
}
