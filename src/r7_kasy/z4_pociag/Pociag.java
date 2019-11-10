package r7_kasy.z4_pociag;

public class Pociag {
	static int predkosc = 10;
	static int ilosc_paliwa = 1200;
	static int[] przyspieszamy = { 5, 20, 7, 10, 4 };

	public static void main(String[] args) {
		opis(predkosc, ilosc_paliwa);
		for (int i = 0; i < przyspieszamy.length; i++) {
			// System.out.println("F:" + przyspieszamy[i]);
			przyspiesz(przyspieszamy[i]);
			// System.out.println("F:" + przyspieszamy[i]);
			opis(predkosc, ilosc_paliwa);

		}
	}

	public static void opis(double predkosc, int ilosc_paliwa) {

		System.out.println("Moja predkosc to " + predkosc + "km/h. Mam jeszcze " + ilosc_paliwa + " l paliwa.");
	}

	public static void przyspiesz(int przyspieszamy) {
		int nowa_predkosc = 0;
		int stara_predkosc = Pociag.predkosc;
		int strata_paliwa = 0;

		boolean walidacjaPredkosci = walidacjaPredkosci(predkosc, przyspieszamy);
		boolean walidacjaIlosciPaliwa = walidacjaIlosciPaliwa(ilosc_paliwa);

		// System.out.println("Test: predkosc: " + predkosc + ", przyspieszamy: ," +
		// przyspieszamy + ", ilosc_paliwa: " + ilosc_paliwa);

		if (walidacjaPredkosci && walidacjaIlosciPaliwa) {
			nowa_predkosc = stara_predkosc + przyspieszamy;
			strata_paliwa = (nowa_predkosc - stara_predkosc) * 100;
			// System.out.println("strata_paliwa: " + strata_paliwa);
			Pociag.ilosc_paliwa = Pociag.ilosc_paliwa - strata_paliwa;
			Pociag.predkosc = nowa_predkosc;
			// System.out.println("Test2: predkosc: " + predkosc + ", przyspieszamy: ," +
			// przyspieszamy + ", ilosc_paliwa: " + ilosc_paliwa);
		}

	}

	public static boolean walidacjaPredkosci(double predkosc, int przyspieszamy) {
		if (predkosc * 0.75 >= przyspieszamy) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean walidacjaIlosciPaliwa(int ilosc_paliwa) {
		System.out.println("Ilosc paliwa: " + ilosc_paliwa);
		if (ilosc_paliwa > 0) {
			return true;
		} else {
			return false;
		}
	}

}
