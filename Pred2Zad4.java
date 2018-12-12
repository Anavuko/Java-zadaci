package Predavanje2;

import java.util.Scanner;

public class Pred2Zad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isOk = true;
		while (isOk) {
			System.out.println("Unesi dva broja: ");
			int first = sc.nextInt();
			int second = sc.nextInt();

			System.out.println("Izaberite operaciju [s, o, m, d]: ");
			char operator = sc.next().charAt(0);
			
			switch (operator) {
				case 's':
					System.out.printf("%d + %d = %d\n", first, second, saberi(first, second));
					break;

				case 'o':
					System.out.printf("%d - %d = %d\n", first, second, oduzmi (first , second));
					break;

				case 'm':
					System.out.printf("%d * %d = %d\n", first, second, pomnozi( first , second));
					break;

				case 'd':
					if (second == 0) {
						System.out.println("Nije dozvoljeno deljenje nulom!!");				
					} else {
						System.out.printf("%d / %d = %.1f\n", first, second, deljenje (first , second));
					}
					break;
				// ako znak nije ni jedanod ponudjenih daj gresku
				default:
					System.out.println("Operator koji ste unekli ne postoji!");
					isOk = false;
					break;
			}
		}
		
		sc.close();
	}

	private static double  deljenje(int first, int second) {
		return (first*1.0) / second;
	}

	private static int pomnozi(int first, int second) {
		return first * second;
	}

	private static int oduzmi(int first, int second) {		
		return first - second;
	}

	private static int saberi(int first, int second) {
		return first + second ;
	}
}
