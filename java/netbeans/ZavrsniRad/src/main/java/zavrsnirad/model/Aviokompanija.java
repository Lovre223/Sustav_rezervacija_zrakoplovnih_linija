package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Aviokompanija extends Entitet {

    private String naziv;

    @OneToMany(mappedBy = "aviokompanija")
    private List<Let> letovi;

    public Aviokompanija() {
        super();
    }

    public Aviokompanija(int sifra, String naziv, List<Let> letovi) {
        super(sifra);
        this.naziv = naziv;
        this.letovi = letovi;
    }

    public List<Let> getLetovi() {
        return letovi;
    }

    public void setLetovi(List<Let> letovi) {
        this.letovi = letovi;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {

        return naziv;
    }

}
