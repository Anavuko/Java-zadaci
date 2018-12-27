package predavanje4.zad1;

public class Kafe extends Proizvod {
	
	private static final float PDV_KAFE = 0.08f;
	private VrstaKafe vrstaKafe;

	public Kafe(String ime, double cena, String rokUpotrebe, VrstaKafe vrstaKafe) {
		super(ime, cena, rokUpotrebe);
		this.vrstaKafe = vrstaKafe;
	}

	public VrstaKafe getVrstaKafe() {
		return vrstaKafe;
	}

	public void setTipKafe(VrstaKafe vrstaKafe) {
		this.vrstaKafe = vrstaKafe;
	}

	public static double getPdvKafe() {
		return PDV_KAFE;
	}

	@Override
	public String toString() {
		return "Kafa" + super.toString() + "[vrstaKafe=" + vrstaKafe + "]";
	}

	@Override
	public double cenaSaPDV() {
		return getCena() + (getCena() * PDV_KAFE);
	}

}

