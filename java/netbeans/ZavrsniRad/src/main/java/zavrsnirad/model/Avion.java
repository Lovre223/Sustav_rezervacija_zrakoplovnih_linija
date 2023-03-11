package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity
public class Avion extends Entitet {

	private String naziv;
	private int kapacitet;
        
        @OneToMany(mappedBy = "avion")
        private List<Let> letovi;

	public Avion() {
		super();
	}

	public Avion(int sifra, String naziv, int kapacitet, List<Let> letovi) {
		super(sifra);
		this.naziv = naziv;
		this.kapacitet = kapacitet;
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

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	
	@Override
	public String toString() {
		
		return naziv;
	}

}
