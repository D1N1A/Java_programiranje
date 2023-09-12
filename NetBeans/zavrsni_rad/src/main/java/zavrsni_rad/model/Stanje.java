package zavrsni_rad.model;



import jakarta.persistence.OneToMany;



public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        private String klijent;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getKlijent() {
        return klijent;
    }

    public void setKlijent(String klijent) {
        this.klijent = klijent;
    }


}