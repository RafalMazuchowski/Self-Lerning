package r5_petleITablice.z1_choinka;

import java.util.Scanner;

public class Choinka2 {
	private static String pins = "*";
	private static String left = "\\";
	private static String right = "/";
	private static Scanner sc;

	public static void main(String[] args) {

		String[][] choinka = choinkaWypelniaie();

		wyswietl(choinka);
	}

	private static String[][] choinkaWypelniaie() {
		System.out.println("Podaj wielkoœæ choinki: ");
		sc = new Scanner(System.in);
		int rzedy = sc.nextInt();
		int kolumny = 2 * (rzedy) + 1;

		String[][] trzon = new String[rzedy][kolumny];
		for (int i = 0; i < rzedy; i++) {
			for (int o = 0; o < kolumny; o++) {
				trzon[i][o] = pins;
			}
			for (int j = rzedy; j > i; j--) {
				trzon[i][j - i - 1] = left;
			}

			for (int k = rzedy; k > i; k--) {
				trzon[i][k + rzedy] = right;
			}

		}
		return trzon;
	}

	private static void wyswietl(String[][] choinka) {
		for (int i = 0; i < choinka.length; i++) {

			for (int j = 0; j < choinka[i].length; j++) {

				System.out.print(choinka[i][j] + " ");
			}
			System.out.println();
		}
	}

}
