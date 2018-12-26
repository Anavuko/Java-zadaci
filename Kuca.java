package predavanje3.zad2;

public class Kuca extends Nekretnina {

	private int povrsinaOkucnice;

	public Kuca() {

	}

	public Kuca(String adresa, Zona zona, int kvadratura, Vlasnik vlasnik, int povrsinaOkucnice) {
		super.adresa = adresa;
		super.zona = zona;
		super.kvadratura = kvadratura;
		super.vlasnik = vlasnik;
		this.povrsinaOkucnice = povrsinaOkucnice;

	}

	public Kuca(Kuca k) {
		adresa = k.adresa;
		zona = k.zona;
		kvadratura = k.kvadratura;
		vlasnik = k.vlasnik;
		povrsinaOkucnice = k.povrsinaOkucnice;
	}

	@Override
	protected double izracunajCenuDodatka() {
		return povrsinaOkucnice * zona.getVrednost() * 0.15;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOkucnica: " + povrsinaOkucnice + "\n";
	}
}