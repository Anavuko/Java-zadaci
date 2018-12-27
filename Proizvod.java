package predavanje4.zad1;

public abstract class Proizvod {
	private String ime;
	private double cena;
	private String rokTrajanja;

	protected Proizvod(String ime, double cena, String rokTrajanja) {
		this.ime = ime;
		this.cena = cena;
		this.rokTrajanja = rokTrajanja;
	}

	public String getIme() {
		return ime;
	}

	public void setImeProizvoda(String ime) {
		this.ime = ime;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokUpotrebe(String rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	public abstract double cenaSaPDV();

	@Override
	public String toString() {
		return " [ime=" + ime + ", cena=" + cena + "din, rok trajanja=" + rokTrajanja + "]";
	}

}
