package r5_petleITablice.z2_operacjeNaTablicachLiczb;

public class OperacjeNaTablicachLiczb {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 11, 13, 17 };
		int[] b = { 10, 20, 30, 40, 50 };
		int[] c = { 50, 1, 33, 1, 8, 9, 13, 53, 61, 31, 23, 44, 8, 13 };
		int[] d = { 3, -5, 5, -3, 0, 3, -3 };
		int[] e = {};
		int x = 4;

		System.out.println("SUMA:");
		System.out.println(suma(a));
		System.out.println(suma(b));
		System.out.println(suma(c));
		System.out.println(suma(d));
		System.out.println(suma(e));
		System.out.println();

		System.out.println("SREDNIA:");
		System.out.println(srednia(a));
		System.out.println(srednia(b));
		System.out.println(srednia(c));
		System.out.println(srednia(d));
		System.out.println(srednia(e));
		System.out.println();

		System.out.println("MAX:");
		System.out.println(max(a));
		System.out.println(max(b));
		System.out.println(max(c));
		System.out.println(max(d));
		System.out.println(max(e));
		System.out.println();

		System.out.println("MIN:");
		System.out.println(min(a));
		System.out.println(min(b));
		System.out.println(min(c));
		System.out.println(min(d));
		System.out.println(min(e));
		System.out.println();

		System.out.println("ROZNICA MIN-MAX:");
		System.out.println(roznicaMinMax(a));
		System.out.println(roznicaMinMax(b));
		System.out.println(roznicaMinMax(c));
		System.out.println(roznicaMinMax(d));
		System.out.println(roznicaMinMax(e));
		System.out.println();

		System.out.println("WYPISZ WIEKSZE:");
		wypiszWieksze(a, x);
		wypiszWieksze(b, x);
		wypiszWieksze(c, x);
		wypiszWieksze(d, x);
		wypiszWieksze(e, x);
		System.out.println();

		System.out.println("PIERWSZA WIEKSZA:");
		System.out.println(pierwszaWieksza(a, x));
		System.out.println(pierwszaWieksza(b, x));
		System.out.println(pierwszaWieksza(c, x));
		System.out.println(pierwszaWieksza(d, x));
		System.out.println(pierwszaWieksza(e, x));
		System.out.println();

		System.out.println("SUMA WIEKSZA:");
		System.out.println(sumaWiekszych(a, x));
		System.out.println(sumaWiekszych(b, x));
		System.out.println(sumaWiekszych(c, x));
		System.out.println(sumaWiekszych(d, x));
		System.out.println(sumaWiekszych(e, x));
		System.out.println();

		System.out.println("ILE WIEKSZYCH:");
		System.out.println(ileWiekszych(a, x));
		System.out.println(ileWiekszych(b, x));
		System.out.println(ileWiekszych(c, x));
		System.out.println(ileWiekszych(d, x));
		System.out.println(ileWiekszych(e, x));
		System.out.println();

		System.out.println("WYPISZ PODZIELNE:");
		wypiszPodzielne(a, x);
		wypiszPodzielne(b, x);
		wypiszPodzielne(c, x);
		wypiszPodzielne(d, x);
		wypiszPodzielne(e, x);
		System.out.println();

		System.out.println("PIERWSZA PODZIELNA:");
		System.out.println(pierwszaPodzielna(a, x));
		System.out.println(pierwszaPodzielna(b, x));
		System.out.println(pierwszaPodzielna(c, x));
		System.out.println(pierwszaPodzielna(d, x));
		System.out.println(pierwszaPodzielna(e, x));
		System.out.println();

		System.out.println("WSPOLNE ELEMENTY:");
		System.out.println("A, B: " + znajdzWspolny(a, b));
		System.out.println("A, C: " + znajdzWspolny(a, c));
		System.out.println("A, D: " + znajdzWspolny(a, d));
		System.out.println("A, E: " + znajdzWspolny(a, e));
		System.out.println("B, C: " + znajdzWspolny(b, c));
		System.out.println("B, D: " + znajdzWspolny(b, d));
		System.out.println("B, E: " + znajdzWspolny(b, e));
		System.out.println("C, D: " + znajdzWspolny(c, d));
		System.out.println("C, E: " + znajdzWspolny(c, e));
		System.out.println("D, E: " + znajdzWspolny(d, e));
		System.out.println();
	}

	public static int suma(int[] tab) {
		int suma = 0;
		for (int i = 0; i < tab.length; i++) {
			suma += tab[i];
		}
		return suma;
	}

	public static double srednia(int[] tab) {
		double srednia = (double) suma(tab) / (tab.length);
		return srednia;
	}

	public static Integer max(int[] tab) {
		if (tab.length == 0) {
			return null;
		}
		int max = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i]) {
				max = tab[i];
			}
		}
		return max;
	}

	public static Integer min(int[] tab) {
		if (tab.length == 0) {
			return null;
		}

		int min = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (min > tab[i]) {
				min = tab[i];
			}
		}
		return min;
	}

	public static int roznicaMinMax(int[] tab) {
		if (tab.length == 0) {
			return 0;
		}
		int roznicaMinMax = Math.abs(max(tab) - min(tab));

		return roznicaMinMax;
	}

	public static void wypiszWieksze(int[] tab, int x) {
		for (int liczba : tab) {
			if (liczba > x) {
				System.out.print(liczba + " ");
			}
		}
		System.out.println();
	}

	public static Integer pierwszaWieksza(int[] tab, int x) {
		Integer pierwszaWieksza = null;
		for (int liczba : tab) {
			if (liczba > x) {
				return pierwszaWieksza = liczba;
			}
		}
		return pierwszaWieksza;
	}

	public static int sumaWiekszych(int[] tab, int x) {
		int suma = 0;
		for (int liczba : tab) {
			if (liczba > x) {
				suma += liczba;
			}
		}
		return suma;
	}

	public static int ileWiekszych(int[] tab, int x) {
		int i = 0;
		for (int liczba : tab) {
			if (liczba > x) {
				i++;
			}
		}
		return i;
	}

	public static void wypiszPodzielne(int[] tab, int x) {
		boolean czySa = false;
		for (int liczba : tab) {
			if (liczba % x == 0) {
				czySa = true;
				System.out.print(liczba + " ");
			}
		}
		if (czySa == false)
			System.out.print("BRAK");
		System.out.println();
	}

	public static Integer pierwszaPodzielna(int[] tab, int x) {
		Integer pierwszaPodzielna = null;
		for (int liczba : tab) {
			if (liczba % x == 0) {
				return pierwszaPodzielna = liczba;
			}
		}
		return pierwszaPodzielna;
	}

	public static Integer znajdzWspolny(int[] t1, int[] t2) {
		Integer znajdzWspolny = null;
		for (int liczba1 : t1) {
			for (int liczba2 : t2) {
				if (liczba1 == liczba2)
					znajdzWspolny = liczba1;
			}
		}
		return znajdzWspolny;
	}

}
