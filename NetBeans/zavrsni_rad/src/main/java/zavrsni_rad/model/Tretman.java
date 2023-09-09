package zavrsni_rad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


@Entity
public class Tretman extends Entitet {
        @OneToMany
	private String naziv;
	public static float cijena;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public float getCijena() {
		return cijena;
	}
	public void setCijena(float cijena) {
		Tretman.cijena = cijena;
	}
	public Tretman(int sifra, String naziv, float cijena) {

		this.naziv = naziv;
		Tretman.cijena = cijena;
	}
	
	public Tretman() {
		// TODO Auto-generated constructor stub
	}
	
	

	

}
