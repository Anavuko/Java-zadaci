package Predavanje4Zad2;

public class Osoblje extends Zaposleni {

	public Osoblje () {
		
	}
	public Osoblje(String ime, String prezime, String adresa, String telefon, String datumRodjenja) {
		super.ime = ime;
		super.prezime = prezime;
		super.adresa = adresa;
		super.telefon = telefon;
		super.datumRodjenja = datumRodjenja;
	}
	public Osoblje(Osoblje o) {
		ime = o.ime;
		prezime = o.prezime;
		adresa = o.adresa;
		telefon = o.telefon;
		datumRodjenja = o.datumRodjenja;
	}

	@Override
	public String toString() {
		return "Osoblje: " + super.toString();
	}
}
