package kozmeticki_salon_m;

public class Biljeska {
	private String opažanje;
	private String preporuka;
	
	
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
	public Biljeska(String opažanje, String preporuka) {
		super();
		this.opažanje = opažanje;
		this.preporuka = preporuka;
	}
	public Biljeska() {
		super();
	}
	
	

}
