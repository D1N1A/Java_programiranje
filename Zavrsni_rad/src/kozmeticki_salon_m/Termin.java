package kozmeticki_salon_m;

import java.sql.Time;
import java.util.Date;

public class Termin {
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
	public Termin(Date datum, Time vrijeme) {
		super();
		this.datum = datum;
		this.vrijeme = vrijeme;
	}
	public Termin() {
		super();
	}
	

	
}
