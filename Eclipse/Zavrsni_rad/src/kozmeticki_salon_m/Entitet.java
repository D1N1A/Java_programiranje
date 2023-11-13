package kozmeticki_salon_m;

public abstract class Entitet {
	


	private int sifra;

	public int getSifra() {
		return sifra;
	}


	public Entitet (int sifra) {
		super ();
		this.sifra = sifra;
			

	}

	public Entitet() {
		super();
	}




	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	}


