package kozmeticki_salon_m;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Termin extends Entitet{
	private Date datum;
	private Time vrijeme;
	private List <Klijent> klijenti;
	private List <Tretman> tretmani;

	
	public Termin ()  {
	}
	
	
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Time getVrijeme() {
		return vrijeme;
	}
	public void setVrijeme(Time vrijeme) {
		this.vrijeme = vrijeme;
	}
	public List<Klijent> getKlijenti() {
		return klijenti;
	}
	public void setKlijenti(List<Klijent> klijenti) {
		this.klijenti = klijenti;
	}
	public List<Tretman> getTretmani() {
		return tretmani;
	}
	public void setTretmani(List<Tretman> string) {
		this.tretmani = string;
	}
	public Termin(int sifra, Date datum, Time vrijeme, List<Klijent> klijenti, List<Tretman> tretmani) {
		super(sifra);
		this.datum = datum;
		this.vrijeme = vrijeme;
		this.klijenti = klijenti;
		this.tretmani = tretmani;
	}
	public Termin(int sifra) {
		super(sifra);
	}





	

	
	
	
	
	


	
}
