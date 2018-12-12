package Predavanje2;

import java.util.Random;
import java.util.Scanner;

public class Pred2Zad3 {

	
	public static void main(String[] args) {
		
		// slučajno generisanog broja u opsegu od 1 do 50
		int rndBroj = getRandomNum(50);
		
		Scanner sc = new Scanner(System.in);
		int rezultat;
		
		do {
			System.out.println("Unesite broj: ");
			int broj = sc.nextInt();
			rezultat = checkValue(rndBroj, broj);
			if (rezultat == 0) {
				System.out.println("Neverovatno! Pogodili ste tačan broj!");
			} else if (rezultat == 1) {
				System.out.println("Dobar pokušaj, bili ste jako blizu!");
			} else {
				System.out.println("Više sreće sledeći put...");
			}
		} while (rezultat != 0);
		
		sc.close();
	}

	private static int checkValue(int random, int number) {
		if (random == number) {
			return 0;
		} else if (Math.abs(random - number) <= 5) {
			return 1;
		} else {
			return 2;
		}
	}

	private static int getRandomNum(int limitValue) {
		Random rndGenerator = new Random();
		return rndGenerator.nextInt(limitValue+1);
	}
}
