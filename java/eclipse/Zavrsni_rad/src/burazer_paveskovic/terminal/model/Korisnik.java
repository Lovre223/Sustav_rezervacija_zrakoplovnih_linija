package burazer_paveskovic.terminal.model;

public class Korisnik extends Entitet {

	private String ime;
	private String prezime;
	private String oib;
	private String adresa;
	private String email;

	public Korisnik() {
		super();
	}

	public Korisnik(int sifra, String ime, String prezime, String oib, String adresa, String email) {
		super(sifra);
		this.ime = ime;
		this.prezime = prezime;
		this.oib = oib;
		this.adresa = adresa;
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return ime;
	}
}
