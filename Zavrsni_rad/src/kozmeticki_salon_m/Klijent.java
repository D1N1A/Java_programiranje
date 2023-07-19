package kozmeticki_salon_m;

public class Klijent {
	
	private String ime;
	private String prezime;
	private float kontakt_tel;
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
	public float getKontakt_tel() {
		return kontakt_tel;
	}
	public void setKontakt_tel(float kontakt_tel) {
		this.kontakt_tel = kontakt_tel;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public Klijent(String ime, String prezime, float kontakt_tel, String e_mail) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.kontakt_tel = kontakt_tel;
		this.e_mail = e_mail;
	}
	public Klijent() {
		super();
	}
	
	
	

}
