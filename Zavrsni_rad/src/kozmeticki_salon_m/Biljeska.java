package kozmeticki_salon_m;

public class Biljeska extends Entitet {
	private String opažanje;
	private String preporuka;
	
	public Biljeska (int sifra, String opazanje, String preporuka, int termin, int tretman) {
		this.opažanje = opazanje;
		this.preporuka = preporuka;
	}
	

	public String getOpažanje() {
		return opažanje;
	}

	public void setOpažanje(String opažanje) {
		this.opažanje = opažanje;
	}

	public String getPreporuka() {
		return preporuka;
	}

	public void setPreporuka(String preporuka) {
		this.preporuka = preporuka;
	}

	public Biljeska(int sifra, String opažanje, String preporuka) {
		super(sifra);
		this.opažanje = opažanje;
		this.preporuka = preporuka;
	}

	public Biljeska(int sifra) {
		super(sifra);
	}


	
	
	

}
