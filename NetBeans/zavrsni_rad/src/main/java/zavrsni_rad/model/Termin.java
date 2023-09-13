package zavrsni_rad.model;

import jakarta.persistence.OneToMany;
import java.sql.Time;
import java.util.Date;

public class Termin extends Entitet{
	private Date datum;
	private Time vrijeme;
        private String tretman;
         @OneToMany
         private String klijent;

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

    public String getTretman() {
        return tretman;
    }

    public void setTretman(String tretman) {
        this.tretman = tretman;
    }

    public String getKlijent() {
        return klijent;
    }

    public void setKlijent(String klijent) {
        this.klijent = klijent;
    }
         
         

}