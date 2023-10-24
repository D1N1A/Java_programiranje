package zavrsnirad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;


@Entity
public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        @ManyToMany
        private List<Tretman> tretmani;

    public List<Tretman> getTretmani() {
        return tretmani;
    }

    public void setTretmani(List<Tretman> tretmani) {
        this.tretmani = tretmani;
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

    @Override
    public String toString() {
        return naziv + " " + opis;
    
            
    }
    

}
    

    

        
        


    