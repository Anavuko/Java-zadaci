package Predavanje4Zad2;

public abstract class MedicinskoOsoblje extends Zaposleni {
	
	protected String fakultet;
	
	public MedicinskoOsoblje () {
		
	}
	public MedicinskoOsoblje (String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet) {
		super.ime = ime;
		super.prezime = prezime;
		super.adresa = adresa;
		super.telefon = telefon;
		super.datumRodjenja = datumRodjenja;
		this.fakultet = fakultet;
		
		
	}public MedicinskoOsoblje (MedicinskoOsoblje m) {
		ime = m.ime;
		prezime = m.prezime;
		adresa = m.adresa;
		telefon = m.telefon;
		datumRodjenja = m.datumRodjenja;
		fakultet = m.fakultet;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "[Fakutet:" + fakultet + "]";
	}
}
