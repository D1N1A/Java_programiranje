package kozmeticki_salon_m;

public class Stanje extends Entitet{
	private String naziv;
	private String opis;
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
	public Stanje(int sifra, String naziv, String opis) {
		super(sifra);
		this.naziv = naziv;
		this.opis = opis;
	}
	public Stanje(int sifra) {
		super(sifra);
	}

	

}
