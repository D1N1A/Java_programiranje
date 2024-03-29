package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Biljeska extends Entitet {
	private String opazanje;
	private String preporuka;
        
        @ManyToOne
        private Termin termin;
        @ManyToOne
        private Tretman tretman;
        
        
         @ManyToMany(mappedBy = "biljeske")
         public List<Tretman> tretmani = new ArrayList<>();

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
          
         
  public String toString () {
        StringBuilder sb = new StringBuilder();

            if (getOpazanje() != null) {
                if (getOpazanje().length() > 20) {
                    sb.append(getOpazanje().substring(0, 10));
                    sb.append("...");
                } else {
                    sb.append(getOpazanje());
                }
            } else {
                sb.append(""); 
            }

            sb.append(" [");
            sb.append(" ]");
            
          

            if (getPreporuka() != null) {
                if (getPreporuka().length() > 20) {
                    sb.append(getOpazanje().substring(0, 10));
                    sb.append("...");
                } else {
                    sb.append(getOpazanje());
                }
            } else {
                sb.append(""); 
            }

            sb.append(" [");
            sb.append(" ]");

           

            return sb.toString(); 
	

}

    public void setTermini(List<Termin> te) {
       
    }
}