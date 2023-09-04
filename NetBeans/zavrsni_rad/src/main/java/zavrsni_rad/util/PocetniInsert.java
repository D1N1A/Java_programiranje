/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni_rad.util;

import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import zavrsni_rad.model.Klijent;

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
    private List<Stanje> stanja;
    private List<Termin> termini;
    private List<Tretman> tretmani;
    
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
        
        Termini t;
        for (int i = 0; i < BROJ_TERMINA; i++) {
            t = new Termin();
            t.set
            p.setPrezime(faker.name().lastName());
            p.setOib(Alati.getOib());
            p.setBrojUgovora(faker.business().creditCardNumber());
            p.setEmail(faker.internet().emailAddress());
            
            session.persist(p);
            polaznici.add(p);
            
        }
        
    }
    
    private void kreirajPredavace() {
        Predavac p;
        for (int i = 0; i < BROJ_PREDAVACA; i++) {
            p = new Predavac();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setOib(Alati.getOib());
            p.setIban(faker.business().creditCardNumber());
            p.setEmail(faker.internet().emailAddress());
            
            session.persist(p);
            predavaci.add(p);
            
        }
    }
    
    private void kreirajGrupe() {
        
        Grupa g;
        List<Polaznik> p;
        for (int i = 0; i < BROJ_GRUPA; i++) {
            g = new Grupa();
            g.setNaziv(faker.chuckNorris().fact());
            g.setDatumPocetka(faker.date().birthday(1, 10));
            g.setPredavac(predavaci.get(faker.number().numberBetween(0, BROJ_PREDAVACA - 1)));
            g.setSmjer(smjerovi.get(faker.number().numberBetween(0, BROJ_SMJEROVA - 1)));
            g.setMaxpolaznika(faker.number().numberBetween(5, 30));
            p = new ArrayList<>();
            // DZ: Osigurati da jedan polaznik može biti samo jednom na jednoj grupi
            for (int j = 0; j < faker.number().numberBetween(5, g.getMaxpolaznika()); j++) {
                p.add(polaznici.get(faker.number().numberBetween(0, BROJ_POLAZNIKA - 1)));
            }
            g.setPolaznici(p);
            
            session.persist(g);
            
        }
        
   
        
    }
    
}
