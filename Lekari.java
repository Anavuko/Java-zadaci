package Predavanje4Zad2;

public class Lekari extends MedicinskoOsoblje{

	
	public Lekari() {
		
	}
	
	public Lekari(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet) {
		super.ime = ime;
		super.prezime = prezime;
		super.adresa = adresa;
		super.telefon = telefon;
		super.datumRodjenja = datumRodjenja;
		super.fakultet = fakultet;
 
}
	public Lekari (Lekari l) {
		ime = l.ime;
		prezime =l.prezime;
		adresa = l.adresa;
		telefon = l.telefon;
		datumRodjenja = l.datumRodjenja;
		fakultet = l.fakultet;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}
	@Override
	public String toString() {
		return "Lekari: " + super.toString();
	}
}