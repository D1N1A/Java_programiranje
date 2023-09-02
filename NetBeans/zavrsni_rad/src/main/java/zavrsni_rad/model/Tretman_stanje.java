package zavrsni_rad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity

public interface Tretman_stanje {
    @OneToMany
    private String Tretman;
    @OneToMany
     public String Stanje;

    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);

    @Override
    public int hashCode();


}
