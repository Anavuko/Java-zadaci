package predavanje3.zad2;

public abstract class Nekretnina {

	protected String adresa;
	protected Zona zona;
	protected int kvadratura;
	protected Vlasnik vlasnik;

	protected abstract double izracunajCenuDodatka();

	protected int izracunajCenuOsnovice() {
		return kvadratura * zona.getVrednost();

	}

	public double izracunajCenu() {
		return izracunajCenuOsnovice() + izracunajCenuDodatka();
	}

	@Override
	public String toString() {
		return "Adresa: " + adresa + "\nZona: " + zona + "\nKvadratura: " + kvadratura + "\nVlasnik: " + vlasnik
				+ "\nCena: " + izracunajCenu() + "€";
	}

}
