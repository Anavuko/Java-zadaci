package predavanje4.zad1;


import java.util.HashMap;



public class Main {

	static Firma firma = new Firma("Java", 500000);

	public static void main(String[] args) {
	System.out.println(firma);
		
		Proizvod proizvod1 = new MlecniProizvodi("kravica", 135, "07.11.2019", "kravlje");
		Proizvod proizvod2 = new Meso("but", 469, "30.12.2018", "svinjetina");
		Proizvod proizvod3 = new Kafe("grand", 356, "08.2.2020", VrstaKafe.MLEVENA);
		Proizvod proizvod4 = new Sokovi("next", 160, "05.05.2019", "jabuka");

		System.out.println("Spisak proizvoda sa kolicinama");

		firma.lista = new HashMap<>();
		firma.lista.put(proizvod1, 55);
		firma.lista.put(proizvod2, 85);
		firma.lista.put(proizvod3, 155);
		firma.lista.put(proizvod4, 505);

		firma.stampanjeListaProizvoda();
		firma.porudzbina(proizvod1,12);
		System.out.println("Spisak proizvoda sa kolicinama nakon porudzbine" );
		firma.stampanjeListaProizvoda();
		System.out.println(firma);
	}
	
}