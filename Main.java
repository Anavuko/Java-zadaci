package Predavanje4Zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Firma firma = new Firma("MediGroup", new ArrayList<>());

		System.out.println(firma + "\n");

		Zaposleni zaposleni1 = new Osoblje("Slavica ", "Slavkovic", "Miloja Milojeivca 44", "011/5555-555",
				"01.01.1965.");
		Zaposleni zaposleni2 = new MedSestre("Sestra", "Antonija", "Srecnih ljudi 55", "066/8888-888", "14.02.1957",
				"Visa medicinska", 3);
		Zaposleni zaposleni3 = new Lekari("Doktor", "Popac", "Srecnih ljudi 55", "065/9999-999", "10.12.1981.",
				"Medicinski");
		Zaposleni zaposleni4 = new MedSestre("Jelena", "Jankovic", "Desno od Endave 1", "061/2222-222", "05.06.1987.",
				"Visa medicinska", 2);
		Zaposleni zaposleni5 = new Osoblje("Mileva", "Milojevic", "Levo od Endave 2", "066/1234-567", "06.02.1955.");
		Zaposleni zaposleni6 = new MedSestre("Ana", "Jankovic", "Desno od Endave 1", "065/5555-555", "05.06.1987.",
				"Visa medicinska", 1);
		Zaposleni zaposleni7 = new Lekari("Doktor", "Ljubinkovic", "Desno od Endave 1", "065/5555-555", "21.12.1968.",
				"Medicinski");
		Zaposleni zaposleni8 = new MedSestre("Suzana", "Peric", "Desno od Endave 5", "065/5555-555", "08.09.1987.",
				"Visa medicinska", 3);
		Zaposleni zaposleni9 = new Osoblje("Ljubica", "Ljubinkovic", "Levo od Endave 1", "061/1234-567", "01.02.1953.");
		Zaposleni zaposleni10 = new MedSestre("Irena", "Grahovac", "Desno od Endave 9", "065/5555-555", "12.07.1981.",
				"Visa medicinska", 3);
		Zaposleni zaposleni11 = new MedSestre("Verica", "Rakocevic", "Desno od Endave 6", "065/5555-555", "30.11.1978.",
				"Visa medicinska", 1);
		Zaposleni zaposleni12 = new Lekari("Doktor", "Subotic", "Desno od Endave 13", "065/5555-555", "08.01.1957.",
				"Medicinski");

		List<Zaposleni> listaB1 = new ArrayList<>();
		listaB1.add(zaposleni1);
		listaB1.add(zaposleni2);
		listaB1.add(zaposleni3);
		listaB1.add(zaposleni4);

		List<Zaposleni> listaB2 = new ArrayList<>();
		listaB2.add(zaposleni5);
		listaB2.add(zaposleni6);
		listaB2.add(zaposleni7);
		listaB2.add(zaposleni8);

		List<Zaposleni> listaB3 = new ArrayList<>();
		listaB3.add(zaposleni9);
		listaB3.add(zaposleni10);
		listaB3.add(zaposleni11);
		listaB3.add(zaposleni12);

		Bolnica bolnica1 = new Bolnica("Ristic", "Doktor Ristic", listaB1);
		Bolnica bolnica2 = new Bolnica("Biomedic", "Doktor Bio", listaB2);
		Bolnica bolnica3 = new Bolnica("Vizim", "Doktor Viza", listaB3);

		firma.getListaBolnica().add((Bolnica) bolnica1);
		firma.getListaBolnica().add((Bolnica) bolnica2);
		firma.getListaBolnica().add((Bolnica) bolnica3);

		System.out.println(firma);
		System.out.println(bolnica1.getPodaciOZaposlenima());
		bolnica2.ispisiPodatkeOZaposlenim();

	}

}
