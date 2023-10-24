/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import zavrsnirad.model.Klijent;
import zavrsnirad.util.KozmetickiSalonException;

/**
 *
 * @author Ana
 */
public class ObradaKlijent extends Obrada<Klijent>{
    
    @Override
    public List<Klijent> read() {
        return sesssion.createQuery("from Klijent k order by k.sifra desc",Klijent.class)
               .setMaxResults(20)
               .list();
       
    }

    public List<Klijent> read(String uvjet) {
        return read(uvjet, 20);
    }
    
    public List<Klijent> read(String uvjet, int brojRezultata) {
        uvjet = uvjet==null ? "" : uvjet;
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        
        List<Klijent> lista = sesssion.createQuery("from Polaznik p "
               + " where concat(p.ime,' ', p.prezime,' ',p.ime,) like :uvjet"
               + " order by p.prezime, p.ime",Klijent.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(brojRezultata)
               .list();
        
        // sloganje po hrvatskoj abecedi
        Collator spCollator = Collator.getInstance(Locale.of("hr", "HR"));
        
        lista.sort((e1, e2)-> spCollator.compare(e1.getPrezime(), e2.getPrezime()));
        
       return lista;
    }
    
   
    
    public Klijent readBySifra(int sifra){
        return sesssion.get(Klijent.class, sifra);
    }
    
    


    

    @Override
    protected void kontrolaUnos() throws KozmetickiSalonException {
        if(!entitet.getIme().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez upisa imena");
        }
        if (!entitet.getPrezime().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez upisa prezimena");
        }
        
        if (!entitet.getKontaktTel().isEmpty()) {
          throw new KozmetickiSalonException("Nije moguće unijeti klijenta bez kontakta");
        }
    
    }

    @Override
    protected void kontrolaPromjena() throws KozmetickiSalonException {
     
    }

    @Override
    protected void kontrolaBrisanje() throws KozmetickiSalonException {
       // if (!entitet.getTermini().isEmpty()) {
       //     throw new KozmetickiSalonException("Ne može se obrisati klijent koji ima zakazan tretman");
       // }
    }

}


    

