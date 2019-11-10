package r7_kasy.z4_pociag;

public class Pociag {
	static int predkosc = 10;
	static int ilosc_paliwa = 1200;
	static int[] przyspieszamy = { 5, 20, 7, 10 };

	public static void main(String[] args) {
		opis(predkosc, ilosc_paliwa);
		for (int i = 0; i < przyspieszamy.length; i++) {
			System.out.println("\tProsba o zwiekszenie predkosci o " + przyspieszamy[i]);
			przyspiesz(przyspieszamy[i]);
			opis(predkosc, ilosc_paliwa);
		}
	}

	public static void opis(double predkosc, int ilosc_paliwa) {

		System.out.println("\n[ Moja predkosc to " + predkosc + "km/h. Mam jeszcze " + ilosc_paliwa + " l paliwa. ]");
	}

	public static void przyspiesz(int przyspieszamy) {
		int nowa_predkosc = 0;
		int stara_predkosc = Pociag.predkosc;
		int zuzycie_paliwa = 0;

		boolean walidacjaPredkosci = walidacjaPredkosci(predkosc, przyspieszamy);
		boolean walidacjaIlosciPaliwa = walidacjaIlosciPaliwa(ilosc_paliwa);

		if (walidacjaPredkosci && walidacjaIlosciPaliwa) {
			System.out.println("\tPrzyspieszamy!");

			nowa_predkosc = stara_predkosc + przyspieszamy;
			zuzycie_paliwa = (nowa_predkosc - stara_predkosc) * 100;

			Pociag.ilosc_paliwa = Pociag.ilosc_paliwa - zuzycie_paliwa;
			Pociag.predkosc = nowa_predkosc;
		} else
			System.out.println("\tDla tej maszyny to zbyt wiele...");

	}

	public static boolean walidacjaPredkosci(double predkosc, int przyspieszamy) {
		if (predkosc * 0.75 >= przyspieszamy) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean walidacjaIlosciPaliwa(int ilosc_paliwa) {
		if (ilosc_paliwa > 0) {
			return true;
		} else {
			return false;
		}
	}

}
