package zavrsni_rad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;



@Entity
public class Klijent extends Entitet{
	private String ime;
	private String prezime;
	private String kontaktTel;
	private String eMail;
        
        @ManyToMany
        private List<Stanje> stanja;
        
      
        
        public Klijent () {
        
        }
        
        public Klijent (int sifra, String ime, String prezime, String kontaktTel, String eMail) {
            super (sifra);
            this.ime = ime;
            this.prezime = prezime;
            this.kontaktTel = kontaktTel;
            this.eMail = eMail;

     
}

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKontaktTel() {
        return kontaktTel;
    }

    public void setKontaktTel(String kontaktTel) {
        this.kontaktTel = kontaktTel;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
        
}
