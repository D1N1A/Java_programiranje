package kozmeticki_salon_m;

public class Klijent extends Entitet{

	private String ime;
	private String prezime;
	private String kontaktTel;
	private String eMail;
	
	
	public Klijent () {
		
	}
	
	public Klijent (int sifra, String ime, String prezime, String kontaktTel, String email) {
		super (sifra);
		this.ime =  ime;
		this.prezime = prezime;
		this.kontaktTel  = kontaktTel;
		this.eMail = eMail;
	}

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

	public String getKontaktTel() {
		return kontaktTel;
	}

	public void setKontaktTel(String kontaktTel) {
		this.kontaktTel = kontaktTel;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



		
	
	


}
