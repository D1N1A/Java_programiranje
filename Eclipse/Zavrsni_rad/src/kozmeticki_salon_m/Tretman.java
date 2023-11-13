package kozmeticki_salon_m;

public class Tretman extends Entitet {
	private String naziv;
	public static float cijena;
	
	public Tretman () {
	}
	
	

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



	public Tretman(int sifra, String naziv) {
		super(sifra);
		this.naziv = naziv;
	}



	public Tretman(int sifra) {
		super(sifra);
	}
	
	

	
	
	
	
	

}
