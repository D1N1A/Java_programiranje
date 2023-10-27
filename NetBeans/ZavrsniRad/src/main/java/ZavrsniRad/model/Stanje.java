package zavrsnirad.model;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Stanje extends Entitet{
	private String naziv;
	private String opis;
        
        
        @ManyToMany(mappedBy = "stanja")
    private List<Klijent> klijenti = new ArrayList<>();

    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
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

        public String toString () {
         
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
            

            
            return sb.toString();
    }

    public void getSifra(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        
  
}

    