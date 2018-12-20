package predavanje3.zad2;

public class Vlasnik {

	private String ime;
	private String prezime;
	private String jmbg;
	private String brLicneKarte;

	public Vlasnik() {
		ime = "Homer";
		prezime = "Simpson";
		jmbg = "1205956710001";
		brLicneKarte = "000000001";
	}

	public Vlasnik(String ime, String prezime, String jmbg, String brLicneKarte) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brLicneKarte = brLicneKarte;

	}

	public Vlasnik(Vlasnik v) {
		ime = v.ime;
		prezime = v.prezime;
		jmbg = v.jmbg;
		brLicneKarte = v.brLicneKarte;

	}

	@Override
	public String toString() {
		return ime + "," + prezime + ", JMBG: " + jmbg + ", Broj licne karte: " + brLicneKarte;
	}
}
