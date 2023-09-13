package zavrsni_rad.model;

import jakarta.persistence.ManyToOne;

public class Biljeska extends Entitet {
	private String opazanje;
	private String preporuka;
         @ManyToOne
        private String termin;
          @ManyToOne
        private String tretman;
          
          
 

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

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public String getTretman() {
        return tretman;
    }

    public void setTretman(String tretman) {
        this.tretman = tretman;
    }
      

  
	

}
