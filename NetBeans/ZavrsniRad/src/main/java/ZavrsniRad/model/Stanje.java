package zavrsnirad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        
    @ManyToOne
        private Termin termin;

    @ManyToMany(mappedBy = "stanja")
         public List<Klijent> klijenti = new ArrayList<>();

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }



       

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

        @Override
        public String toString () {
        return naziv  + " " + opis;
  

}
}