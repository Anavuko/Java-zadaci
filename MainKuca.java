package predavanje3.zad2;

public class MainKuca {

	public static void main(String args[]) {
		Nekretnina stanUBeograduNaVodi = new Stan("BG Voda 1", Zona.ZONA1, 120, new Vlasnik(), 20, 30);
		Nekretnina kucaNaSenjaku = new Kuca("Ruska 30", Zona.ZONA2, 500,
				new Vlasnik("pera", "peric", "1234567891234", "123456789"), 200);
		Vlasnik vlasnik = new Vlasnik("Vojislav", "Seki", "6666666666666", "999999999");
		Nekretnina stanUZemunu = new Stan("Glavna 13", Zona.ZONA3, 70, vlasnik, 5, 150);
		Nekretnina kucaUSopotu = new Kuca("Sopot 1", Zona.ZONA4, 100, new Vlasnik(), 50);

		System.out.println(stanUBeograduNaVodi);
		System.out.println(kucaNaSenjaku);
		System.out.println(stanUZemunu);
		System.out.println(kucaUSopotu);

	}
}
