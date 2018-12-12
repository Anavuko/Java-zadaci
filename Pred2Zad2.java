package predavanje2;

import java.util.Scanner;

public class Pred2Zad2 {

	public static void main(String[] args) {
		int n;
		String max_ime = "";
		int max_ocena = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite broj studenata: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + ": Unesite ime i ocenu studenta: ");
			String ime = sc.next();
			int ocena = sc.nextInt();
			if (max_ocena < ocena) {
				max_ocena = ocena;
				max_ime = ime;
			}
		}

		System.out.println("Ime studenta sa najvecom ocenom: " + max_ime + "(" + max_ocena + ")");
		sc.close();
	}
}
