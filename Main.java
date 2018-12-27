package predavanje4.zad1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


	static Firma firma = new Firma("Java", 500000);
	
	public static void main(String[] args) {

		new ArrayList<>();
	
		Proizvod proizvod1 = new MlecniProizvodi("kravica", 135, "07.11.2019", "kravlje");
		Proizvod proizvod2 = new Meso("but", 469, "30.12.2018", "svinjetina");
		Proizvod proizvod3 = new Kafe("grand", 356, "08.2.2020", VrstaKafe.MLEVENA);
		Proizvod proizvod4 = new Sokovi("next", 160, "05.05.2019", "jabuka");
		
	/*	System.out.println(proizvod1);
		System.out.println(proizvod2);
		System.out.println(proizvod3);
		System.out.println(proizvod4);
*/
	 System.out.println("Spisak proizvoda sa kolicinama");

		firma.lista = new HashMap<>();
        firma.lista.put(proizvod1, 55);
        firma.lista.put(proizvod2, 85);
        firma.lista.put(proizvod3, 155);
        firma.lista.put(proizvod4, 505); 

        System.out.println( firma.lista );
       

        System.out.println("Spisak proizvoda sa kolicinama nakon porudzbine");
        
        

                           
	}
}