package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.sql.Time;
import java.util.Collection;
import java.util.Date;


@Entity
public class Termin extends Entitet{
	private Date datum;
	private Time vrijeme;

         @ManyToOne
         private Klijent klijent;

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

    public Collection<? extends Biljeska> getBiljeske() {
        return getBiljeske();
    }

    
         
         

}