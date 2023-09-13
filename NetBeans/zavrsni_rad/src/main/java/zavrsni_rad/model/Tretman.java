package zavrsni_rad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Tretman extends Entitet {
        @OneToMany
	private String naziv;
	public static float cijena;
        @OneToMany(mappedBy = "tretman")
        private List <Klijent> klijenti = new ArrayList<>();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public static float getCijena() {
        return cijena;
    }

    public static void setCijena(float cijena) {
        Tretman.cijena = cijena;
    }

    public List<Klijent> getKlijent() {
        return klijenti;
    }

    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }
        
        
        
}