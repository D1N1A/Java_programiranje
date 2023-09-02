package zavrsni_rad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;



@Entity
public class Klijent extends Entitet{
	@OneToMany
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
	public Klijent(int sifra, String naziv, String ime, String prezime, String kontakt_tel) {
		
		this.ime = ime;
		this.prezime = prezime;
		this.kontakt_tel = kontakt_tel;
		this.e_mail = e_mail;
	}
	public Klijent(int sifra, String naziv, float cijena) {
	
	}
	public Klijent() {
		// TODO Auto-generated constructor stub
	}

	
	

}
