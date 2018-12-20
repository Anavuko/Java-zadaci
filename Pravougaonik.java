package predavanje3.zad1;

public class Pravougaonik extends Kvadrat {
	
	protected int a;
	protected int b;

	
	public Pravougaonik() {
	}
	
	public Pravougaonik(Pravougaonik p) {
		a = p.a;
		b = p.b;
		
	}
	
	public Pravougaonik (int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public double izracunajPovrsinu() {
		return a * b;
	}
	
	public int izracunajObim() {
		return 2 * (a + b);
	}
	
	@Override
	public String toString() {
		return "Obim pravougaonika je: " + izracunajObim() + ", a njegova povrsina je: " + izracunajPovrsinu() + ".";
	}
}

