package endava;

import java.util.Scanner;

public class Pred1Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi dva broja: ");

		int first = sc.nextInt();
		int second = sc.nextInt();

		System.out.println("Izaberite operaciju [s, o, m, d]: ");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case 's':
			System.out.printf("%d + %d = %d", first, second, first + second);
			break;

		case 'o':
			System.out.printf("%d - %d = %d", first, second, first - second);
			break;

		case 'm':
			System.out.printf("%d * %d = %d", first, second, first * second);
			break;

		case 'd':
			if (second == 0) {
				System.out.println("Nije dozvoljeno deljenje nulom!!");				
			} else {
				System.out.printf("%d / %d = %.1f\n", first, second, (first*1.0) / second);
				System.out.printf("celobrojno: %d / %d = %d", first, second, first / second);
			}
			break;

		// ako znak nije ni jedanod ponudjenih daj gresku
		default:
			System.out.printf("Operator koji ste unekli ne postoji!");
			break;
		}
		
		sc.close();
	}
}
