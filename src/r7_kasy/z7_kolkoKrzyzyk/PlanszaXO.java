package r7_kasy.z7_kolkoKrzyzyk;

public class PlanszaXO {

	private static boolean pierwszaPrzekatna(char[][] tablica, char aktywnyGracz) {
		for (int i = 0; i < 3; i++) {
			if (tablica[i][i] != aktywnyGracz) {
				return false;
			}
		}
		return true;
	}

	private static boolean drugaPrzekatna(char[][] tablica, char aktywnyGracz) {
		for (int i = 0; i < 3; i++) {
			if (tablica[i][3 - i - 1] != aktywnyGracz) {
				return false;
			}
		}
		return true;
	}

	private static boolean trzyWzdloz(char[][] tablica, char aktywnyGracz) {
		for (int wys = 0; wys < 3; wys++) {
			boolean win = true;
			for (int szer = 0; szer < 3; szer++) {
				if (tablica[szer][wys] != aktywnyGracz) {
					win = false;
					break;
				}
			}
			if (win) {
				return true;
			}
		}
		return false;
	}

	private static boolean trzyWszerz(char[][] tablica, char aktywnyGracz) {
		int dim = tablica.length;
		for (int wys = 0; wys < dim; wys++) {
			boolean win = true;
			for (int szer = 0; szer < 3; szer++) {
				if (tablica[wys][szer] != aktywnyGracz) {
					win = false;
					break;
				}
			}
			if (win) {
				return true;
			}
		}
		return false;
	}

	static void wyswietlXO(char tablica[][]) {
		System.out.print("\t");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		for (int szer = 1; szer <= 3; szer++) {
			System.out.print(szer + ":\t");
			for (int wys = 1; wys <= 3; wys++) {
				System.out.print(tablica[szer-1][wys-1] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println();
	}

	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	static boolean zwyciestwo(char[][] tablica, char aktywnyGracz) {
		return pierwszaPrzekatna(tablica, aktywnyGracz) || drugaPrzekatna(tablica, aktywnyGracz)
				|| trzyWzdloz(tablica, aktywnyGracz) || trzyWszerz(tablica, aktywnyGracz);
	}
	
}
