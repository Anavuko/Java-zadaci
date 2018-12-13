package Predavanje2;

import java.util.Arrays;
import java.util.Scanner;

public class pred2zad5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite n: ");
		int n = sc.nextInt();

		System.out.println(" Unesite niz celih brojeva: ");
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		System.out.println(" Unesite x koji zelite da nadjete: ");
		int x = sc.nextInt();
		sc.close();
		
		Arrays.sort(niz);
		int index = Arrays.binarySearch(niz, x);
		
		if (index > -1) {
			System.out.println( "X je pronadjen na mestu: " + index);
		} else  {
			System.out.println("Nema trazenog X.");
		}
		
		if (n >= 5){
			for (int i = 1; i <= 5; i++) {
				System.out.println(niz[i]);
			}
		} else  System.out.println("Niz ima manje od 5 elemenata.");
	}
}
