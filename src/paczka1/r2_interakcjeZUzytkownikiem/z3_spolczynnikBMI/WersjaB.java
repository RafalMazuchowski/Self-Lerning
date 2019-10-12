package paczka1.r2_interakcjeZUzytkownikiem.z3_spolczynnikBMI;

import javax.swing.JOptionPane;

public class WersjaB {

	public static void main(String[] args) {

		Double wzrost = Double.parseDouble(JOptionPane.showInputDialog("Podaj wzrost (cm)")) / 100;
		Double masa = Double.parseDouble(JOptionPane.showInputDialog("Podaj masę (kg)"));
		double bmi = masa / Math.pow(wzrost, 2);

		if (bmi < 16) {
			JOptionPane.showMessageDialog(null, "WYGLODZENIE!" + sout(bmi) + "Twoje życie jest zagrożone!");
		} else if (bmi >= 16 && bmi < 17) {
			JOptionPane.showMessageDialog(null, "Wychudzenie!" + sout(bmi) + "Zbyt ciężko pracujesz!");
		} else if (bmi >= 17 && bmi < 18.5) {
			JOptionPane.showMessageDialog(null, "Niedowaga!" + sout(bmi) + "Niewielka utrata masy.");
		} else if (bmi >= 18.5 && bmi < 25) {
			JOptionPane.showMessageDialog(null, "WARTOŚĆ PRAWIDŁOWA!" + sout(bmi) + "BRAWO!");
		} else if (bmi >= 25 && bmi < 30) {
			JOptionPane.showMessageDialog(null, "Nadwaga" + sout(bmi) + "Blisko ideału ;)");
		} else if (bmi >= 30 && bmi < 35.5) {
			JOptionPane.showMessageDialog(null, "I st. otyłośći" + sout(bmi) + "Pora zacząć biegać");
		} else if (bmi >= 35.5 && bmi < 40) {
			JOptionPane.showMessageDialog(null, "II st. otyłośći" + sout(bmi) + "Nie prowadzisz zdrowego trybu życia!");
		} else {
			JOptionPane.showMessageDialog(null, "SKRAJNA OTYŁOŚĆ" + sout(bmi) + "Kierunek dobry lecz zwrot nie ten...");
		}
	}

	private static String sout(double bmi) {
		String odpowiedz = "\nTwoje BMI wynosi: " + bmi + ".\n";
		return odpowiedz;
	}

}