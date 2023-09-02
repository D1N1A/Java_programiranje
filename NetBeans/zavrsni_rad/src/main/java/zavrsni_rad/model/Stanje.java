package zavrsni_rad.model;



import jakarta.persistence.OneToMany;



public class Stanje extends Klijent{
        @OneToMany
	private String naziv;
	private String opis;

    public Stanje(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
    }

    public Stanje() {
    }

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

        
        

	

}
