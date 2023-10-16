package zavrsni_rad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Tretman extends Entitet {
       
	private String naziv;
	public static float cijena;
      

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

        
        
}