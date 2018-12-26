package predavanje3.zad2;

public class Stan extends Nekretnina {

	private int terasa;
	private int podrum;

	public Stan() {

	}

	public Stan(String adresa, Zona zona, int kvadratura, Vlasnik vlasnik, int terasa, int podrum) {
		super.adresa = adresa;
		super.zona = zona;
		super.kvadratura = kvadratura;
		super.vlasnik = vlasnik;
		this.terasa = terasa;
		this.podrum = podrum;
	}

	public Stan(Stan s) {
		adresa = s.adresa;
		zona = s.zona;
		kvadratura = s.kvadratura;
		vlasnik = s.vlasnik;
		terasa = s.terasa;
		podrum = s.podrum;

	}

	@Override
	protected double izracunajCenuDodatka() {
		return (terasa + podrum) * zona.getVrednost() * 0.33;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTerasa: " + terasa + "\nPodrum: " + podrum + "\n";
	}
}
