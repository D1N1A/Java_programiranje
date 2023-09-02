package zavrsni_rad.model;

public class Biljeska extends Tretman {
	private String opis;
	private String preporuka;

    public Biljeska(String opis, String preporuka, int sifra, String naziv, float cijena) {
        super(sifra, naziv, cijena);
        this.opis = opis;
        this.preporuka = preporuka;
    }

    public Biljeska(String opis, String preporuka) {
        this.opis = opis;
        this.preporuka = preporuka;
    }

    public Biljeska() {
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
