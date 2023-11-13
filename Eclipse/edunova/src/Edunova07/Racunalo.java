package Edunova07;

public class Racunalo {
	
	
	private String korisnik;
	private int godinaProizvodnje;
	public String getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(String korisnik) {
		this.korisnik = korisnik;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public Racunalo(String korisnik, int godinaProizvodnje) {
		super();
		this.korisnik = korisnik;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public Racunalo() {
		super();
	}
	

}
