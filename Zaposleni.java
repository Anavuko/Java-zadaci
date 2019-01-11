package Predavanje4Zad2;

public abstract class Zaposleni {
	
	protected String ime;
	protected String prezime;
	protected String adresa;
	protected String telefon;
	protected String datumRodjenja;

	public Zaposleni () {
		
	}
	public Zaposleni(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
		this.datumRodjenja = datumRodjenja;

	}
	public Zaposleni(Zaposleni z) {
		
		ime = z.ime;
		prezime = z.prezime;
		adresa = z.adresa;
		telefon = z.telefon;
		datumRodjenja = z.datumRodjenja;
	
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

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	@Override
	public String toString() {
		return "\nime: " + ime + "\nprezime: " + prezime + "\nadresa: " + adresa + "\ntelefon: " + telefon
				+ "\ndatum rodjenja: " + datumRodjenja;
	}

}
