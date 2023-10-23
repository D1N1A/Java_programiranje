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
        
        StringBuilder sb = new StringBuilder();
        if (getNaziv() != null) {
                if (getNaziv().length() > 20) {
                    sb.append(getNaziv().substring(0, 10));
                    sb.append("...");
                } else {
                    sb.append(getNaziv());
                }
            } else {
                sb.append(""); 
            }

            sb.append(" [");
            
            
            if (getOpis() != null) {
                if (getOpis().length() > 20) {
                    sb.append(getOpis().substring(0, 10));
                    sb.append("...");
                } else {
                    sb.append(getNaziv());
                }
            } else {
                sb.append(""); 
            }

            sb.append(" [");
            
        
            
           //Ovo napravi tako za opis, probaj pa javi ako zapnes;
          // probaj
            
            return sb.toString();
    }
}
    

    

        
        


    