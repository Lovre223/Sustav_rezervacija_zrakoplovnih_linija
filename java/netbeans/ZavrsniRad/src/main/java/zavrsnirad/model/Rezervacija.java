package zavrsnirad.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;



@Entity
public class Rezervacija extends Entitet {
        
        @ManyToOne
	private Let let;
        
        @ManyToOne
	private Korisnik korisnik;
        
       
	private String klasa;

	public Rezervacija() {
		super();
	}

	public Rezervacija(Let let, Korisnik korisnik, String klasa) {
		this.let = let;
		this.korisnik = korisnik;
		this.klasa = klasa;
	}

	public Let getLet() {
		return let;
	}

	public void setLet(Let let) {
		this.let = let;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

    @Override
    public String toString() {
        return getKorisnik().getPrezime();

    }
	
        

}
