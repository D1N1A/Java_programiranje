package Edunova08;

public class Som extends Riba {
	
	private String duzinaBrkova;

	public String getDuzinaBrkova() {
		return duzinaBrkova;
	}

	public void setDuzinaBrkova(String duzinaBrkova) {
		this.duzinaBrkova = duzinaBrkova;
	}

	public Som(String vrsta, boolean slatkovodna, String duzinaBrkova) {
		super(vrsta, slatkovodna);
		this.duzinaBrkova = duzinaBrkova;
	}

	public Som(String vrsta, boolean slatkovodna) {
		super(vrsta, slatkovodna);
	}
	
	

}
