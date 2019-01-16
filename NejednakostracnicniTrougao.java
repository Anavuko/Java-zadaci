package predavanje3.zad1;

public class NejednakostracnicniTrougao extends Trougao {
	
	protected int a;
	protected int b;
	protected int c;
	
	public NejednakostracnicniTrougao() {
	}
	
	public NejednakostracnicniTrougao(NejednakostracnicniTrougao t) {
		a = t.a;
		b = t.b;
		c = t.c;
	}
	
	public NejednakostracnicniTrougao(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double izracunajPovrsinu() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public int izracunajObim() {
		return a + b + c;
	}
	
	@Override
	public String toString() {
		return "Obim trougla je: " + izracunajObim() + ", a njegova povrsina je: " + izracunajPovrsinu() + ".";
	}
}
