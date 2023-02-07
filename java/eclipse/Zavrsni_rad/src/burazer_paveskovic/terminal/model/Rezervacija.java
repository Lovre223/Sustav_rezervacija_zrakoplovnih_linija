package burazer_paveskovic.terminal.model;

public class Rezervacija extends Entitet {

	private Let let;
	private Korisnik korisnik;
	private String klasa;

	public Rezervacija() {
		super();
	}

	public Rezervacija(int sifra, Let let, Korisnik korisnik, String klasa) {
		super(sifra);
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

}
