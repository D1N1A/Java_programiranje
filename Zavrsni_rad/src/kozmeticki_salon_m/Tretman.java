package kozmeticki_salon_m;

public class Tretman extends Entitet {
	private String naziv;
	private float cijena;
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
		this.cijena = cijena;
	}
	public Tretman(int sifra, String naziv, float cijena) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
	}
	public Tretman(int sifra) {
		super(sifra);
	}
	
	

	

}
