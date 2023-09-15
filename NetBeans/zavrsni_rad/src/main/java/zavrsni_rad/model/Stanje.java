package zavrsni_rad.model;



import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;



public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        private String klijent;
        @ManyToOne
        private String biljeska;
        
  
        

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

    public List<Biljeska> getBiljeske() {
        return biljeske;
    }

    public void setBiljeske(List<Biljeska> biljeske) {
        this.biljeske = biljeske;
    }
        



        
        
}

    