package zavrsni_rad.model;

public class Biljeska extends Entitet {
	private String opis;
	private String preporuka;

    public Biljeska(String opis, String preporuka) {
        this.opis = opis;
        this.preporuka = preporuka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getPreporuka() {
        return preporuka;
    }

    public void setPreporuka(String preporuka) {
        this.preporuka = preporuka;
    }

	
	

}
