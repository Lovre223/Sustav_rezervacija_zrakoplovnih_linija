package burazer_paveskovic.terminal.model;

public class Aviokompanija extends Entitet {

	private String naziv;

	public Aviokompanija() {
		super();
	}

	
	public Aviokompanija(int sifra, String naziv) {
		super(sifra);
		this.naziv = naziv;
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
