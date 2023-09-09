package zavrsni_rad.model;

import java.sql.Time;
import java.util.Date;

public class Termin extends Entitet{
	private Date datum;
	private Time vrijeme;

        private int maxtermina;

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

    public int getMaxtermina() {
        return maxtermina;
    }

    public void setMaxtermina(int maxtermina) {
        this.maxtermina = maxtermina;
    }
	
   

	
}
