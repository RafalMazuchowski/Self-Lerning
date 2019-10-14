package r2_interakcjeZUzytkownikiem.z3_spolczynnikBMI;

import java.util.Scanner;

public class WersjaA {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Podaj wzrost (cm)");
		double wzrost = sc.nextDouble() / 100;
		System.out.println("Podaj masę (kg)");
		double masa = sc.nextDouble();
		double bmi = masa / Math.pow(wzrost, 2);

		if (bmi < 16) {
			System.out.println("WYGLODZENIE!" + sout(bmi) + "Twoje życie jest zagrożone!");
		} else if (bmi >= 16 && bmi < 17) {
			System.out.println("Wychudzenie!" + sout(bmi) + "Zbyt ciężko pracujesz!");
		} else if (bmi >= 17 && bmi < 18.5) {
			System.out.println("Niedowaga!" + sout(bmi) + "Niewielka utrata masy.");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("WARTOŚĆ PRAWID�?OWA!" + sout(bmi) + "BRAWO!");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Nadwaga" + sout(bmi) + "Blisko ideału ;)");
		} else if (bmi >= 30 && bmi < 35.5) {
			System.out.println("I st. otyłośći" + sout(bmi) + "Pora zacząć biegać");
		} else if (bmi >= 35.5 && bmi < 40) {
			System.out.println("II st. otyłośći" + sout(bmi) + "Nie prowadzisz zdrowego trybu życia!");
		} else {
			System.out.println("SKRAJNA OTY�?OŚĆ" + sout(bmi) + "Kierunek dobry lecz zwrot nie ten...");
		}
	}

	private static String sout(double bmi) {
		String odpowiedz = "\nTwoje BMI wynosi: " + bmi + ".\n";
		return odpowiedz;
	}
}