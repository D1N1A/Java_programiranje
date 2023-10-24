package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.sql.Time;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
public class Termin extends Entitet{
	private Date datum;
	private Time vrijeme;

         @ManyToOne
         private Klijent klijent;
         
         @OneToMany(mappedBy = "termin")
         private List<Biljeska> biljeske;

    public List<Biljeska> getBiljeske() {
        return biljeske;
    }

    public void setBiljeske(List<Biljeska> biljeske) {
        this.biljeske = biljeske;
    }
         
         

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Time getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Time vrijeme) {
        this.vrijeme = vrijeme;
    }



    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    @Override
    public String toString() {
        return klijent+ " "+ datum + " " + vrijeme;
    }

    public void setKlijent(String odaberite) {
        
    }



    
         
         

}