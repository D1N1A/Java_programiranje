package kozmeticki_salon_m;

import java.sql.Time;
import java.util.Date;

public class Termin extends Tretman{
	private Date datum;
	private Time vrijeme;
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
	public Termin(int sifra, String naziv, float cijena, Date datum, Time vrijeme) {
		super(sifra, naziv, cijena);
		this.datum = datum;
		this.vrijeme = vrijeme;
	}
	public Termin(int sifra, String naziv, float cijena) {
		super(sifra, naziv, cijena);
	}

	
}
