package endava;

import java.util.Random;
import java.util.Scanner;

public class Pred1Zad1 {

	
	public static void main(String[] args) {
		
		// slučajno generisanog broja u opsegu od 1 do 50
		int rndBroj = getRandomNum(50);
		//System.out.println("Broj: " + rndBroj);
		
		Scanner sc = new Scanner(System.in);
		
		// uzimanje broja sa ulaza
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		sc.close();
		
		// ispitivanje tacnosti
		if (rndBroj == broj) {
			System.out.println("Neverovatno! Pogodili ste tačan broj!");
		} else if (Math.abs(rndBroj - broj) <= 5) {
			System.out.println("Dobar pokušaj, bili ste jako blizu! Broj je: " + rndBroj);
		} else {
			System.out.println("Više sreće sledeći put... Broj je: " + rndBroj);
		}
	}

	private static int getRandomNum(int limitValue) {
		Random rndGenerator = new Random();
		return rndGenerator.nextInt(limitValue+1);
	}

}
