package Edunova08;

public class Sisavac extends Zivotinja {
	
	private String staniste;

	
	
	public Sisavac() {
		super();
	}

	public String getStaniste() {
		return staniste;
	}

	public void setStaniste(String staniste) {
		this.staniste = staniste;
	}

	public Sisavac(String vrsta, String staniste) {
		super(vrsta);
		this.staniste = staniste;
	}

	public Sisavac(String vrsta) {
		super(vrsta);
	}
	
	

}
