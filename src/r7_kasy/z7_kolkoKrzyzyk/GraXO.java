package r7_kasy.z7_kolkoKrzyzyk;

import java.util.Scanner;

public class GraXO {

	public static void main(String[] args) {
		
		PlanszaXO plansza = new PlanszaXO();

		char tablica[][] = new char[3][3];
		int licznikRuchow = 0;
		char aktywnyGracz = 'X';
		boolean wygrana = false;

		while (licznikRuchow < 9 && !wygrana) {
			plansza.wyswietlXO(tablica);

			System.out.println("Kolej " + aktywnyGracz + " , podaj nr wiersza: ( --- )");
			@SuppressWarnings("resource")
			int szer = new Scanner(System.in).nextInt() - 1;
			System.out.println("Kolej " + aktywnyGracz + " , podaj nr kolumny: ( | )");
			@SuppressWarnings("resource")
			int wys = new Scanner(System.in).nextInt() - 1;

			if (tablica[szer][wys] == 0) {
				tablica[szer][wys] = aktywnyGracz;
				licznikRuchow++;
				wygrana = plansza.zwyciestwo(tablica, aktywnyGracz);
				aktywnyGracz = aktywnyGracz == 'X' ? 'O' : 'X';
			} else {
				System.out.println("Ruch niepoprawny, sproboj ponownie");
			}
			PlanszaXO.clearConsole();
		}
		plansza.wyswietlXO(tablica);
		System.out.println("\nWYGRYWA: " + (aktywnyGracz == 'X' ? 'O' : 'X'));
	}

}
