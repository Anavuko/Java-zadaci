package Predavanje4Zad2;

public class MedSestre extends MedicinskoOsoblje {
	protected int smena;
	

	public MedSestre() {

	}

	public MedSestre(String ime, String prezime, String adresa, String telefon, String datumRodjenja, String fakultet,
			int smena) {
		super.ime = ime;
		super.prezime = prezime;
		super.adresa = adresa;
		super.telefon = telefon;
		super.datumRodjenja = datumRodjenja;
		this.fakultet = fakultet;
		this.smena = smena;
	}

	public MedSestre(MedSestre m) {
		ime = m.ime;
		prezime = m.prezime;
		adresa = m.adresa;
		telefon = m.telefon;
		datumRodjenja = m.datumRodjenja;
		fakultet = m.fakultet;
		smena = m.smena;

	}
	@Override
	public String toString() {
		return "Medicinske sestre: " + super.toString() + "] Smena(" + smena +")";
	}
}
