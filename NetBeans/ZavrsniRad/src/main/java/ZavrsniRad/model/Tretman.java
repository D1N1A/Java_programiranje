package zavrsnirad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Tretman extends Entitet {
       
	private String naziv;
	public BigDecimal cijena;
        
        @OneToMany
        public List<Biljeska> biljeske;
        
         
        
        

    public List<Biljeska> getBiljeske() {
        return biljeske;
    }

    public void setBiljeske(List<Biljeska> biljeske) {
        this.biljeske = biljeske;
    }
        
        

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Tretman(String naziv, BigDecimal cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public Tretman() {
        
        
    }
    
    public String toString () {
        return naziv;
      

    
        
        
}
}