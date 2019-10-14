package r5_petleITablice.z1_choinka;

import java.util.Scanner;

public class Choinka2 {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Podaj wielkoœæ choinki: ");
		sc = new Scanner(System.in);
		int wielkosc = sc.nextInt();
		for (int i = 0; i < wielkosc; i++) {
			for (int j = wielkosc; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
