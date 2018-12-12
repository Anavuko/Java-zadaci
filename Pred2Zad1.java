package Predavanje2;

import java.util.Scanner;

public class Pred2Zad1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a;
		int b; 

		System.out.println(" Unesite dva broja: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();

		while (a <= b) {
			if (a % 2 == 0) {
				System.out.println(a + " ");
			}
			
			a++;
		}
	}
}
