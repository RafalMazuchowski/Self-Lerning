package r2_interakcjeZUzytkownikiem.z6_bilety;

import java.util.Scanner;

public class Bilety {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Podaj sw�j wiek:");
		sc = new Scanner(System.in);
		int wiek = sc.nextInt();
		System.out.println("Ile bilet�w chcesz kupi�?");
		sc = new Scanner(System.in);
		int ilosc = sc.nextInt();
		double cena = 0;
		
		if (wiek < 7) {
			cena = 0;
		} else if (wiek < 18) {
			cena = 2.28 * ilosc;
		} else if (wiek < 65) {
			cena = 3.80 * ilosc;
		} else if (wiek >= 65) {
			cena = 1.90 * ilosc;
		} else System.out.println("Nieprawid�owa warto��");
		
		System.out.println("Cena bilet�w: " + cena + "z�");
	
	}
}
