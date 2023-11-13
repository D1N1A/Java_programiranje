package Edunova08;

public class Riba extends Zivotinja {
	
	private boolean slatkovodna;

	public boolean isSlatkovodna() {
		return slatkovodna;
	}

	public void setSlatkovodna(boolean slatkovodna) {
		this.slatkovodna = slatkovodna;
	}

	public Riba(String vrsta, boolean slatkovodna) {
		super(vrsta);
		this.slatkovodna = slatkovodna;
	}

	public Riba(String vrsta) {
		super(vrsta);
	}
	
	

}
