package zavrsni_rad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Biljeska extends Entitet {
	private String opazanje;
	private String preporuka;
        
        @ManyToOne
        private Termin termin;
        @ManyToOne
        private Tretman tretman;

    public String getOpazanje() {
        return opazanje;
    }

    public void setOpazanje(String opazanje) {
        this.opazanje = opazanje;
    }

    public String getPreporuka() {
        return preporuka;
    }

    public void setPreporuka(String preporuka) {
        this.preporuka = preporuka;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public Tretman getTretman() {
        return tretman;
    }

    public void setTretman(Tretman tretman) {
        this.tretman = tretman;
    }
          
         
  
	

}
