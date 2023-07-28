package kozmeticki_salon_m;

public class Klijent extends Entitet {
	
	private String ime;
	private String prezime;
	private String kontakt_tel;
	private String e_mail;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getKontakt_tel() {
		return kontakt_tel;
	}
	public void setKontakt_tel(String kontakt_tel) {
		this.kontakt_tel = kontakt_tel;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Klijent(int sifra, String ime, String prezime, String kontakt_tel, String e_mail) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.kontakt_tel = kontakt_tel;
		this.e_mail = e_mail;
	}
	public Klijent(int sifra) {
		super(sifra);
	}
	public Klijent() {
		// TODO Auto-generated constructor stub
	}

	

}
