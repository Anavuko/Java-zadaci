package predavanje3.zad1;

public class Elipsa extends Krug {

	protected int a;
	protected int b;

	public Elipsa() {
	}

	public Elipsa(Elipsa e) {
		a = e.a;
		b = e.b;

	}

	public Elipsa(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public double izracunajPovrsinu() {
		return a * b * Math.PI;
	}

	public double izracunajObim() {
		return a * Math.PI * ((9 - Math.sqrt(35)) / 2);
	}

	@Override
	public String toString() {
		return "Obim elipse je: " + izracunajObim() + ", a njegova povrsina je: " + izracunajPovrsinu() + ".";
	}
}
