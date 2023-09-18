package zavrsni_rad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;


@Entity
public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        private String klijent;
        @ManyToOne
        private String biljeska;
        
        private Integer maxbiljeski;
        
  
 

        @ManyToMany 
        private List<Biljeska> biljeske;
        
       

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKlijent() {
        return klijent;
    }

    public void setKlijent(String klijent) {
        this.klijent = klijent;
    }

    public String getBiljeska() {
        return biljeska;
    }

    public void setBiljeska(String biljeska) {
        this.biljeska = biljeska;
    }

    public Integer getMaxbiljeski() {
        return maxbiljeski;
    }

    public void setMaxbiljeski(Integer maxbiljeski) {
        this.maxbiljeski = maxbiljeski;
    }

    public List<Biljeska> getBiljeske() {
        return biljeske;
    }

    public void setBiljeske(List<Biljeska> biljeske) {
        this.biljeske = biljeske;
    }


        
        
        
        
        
}

    