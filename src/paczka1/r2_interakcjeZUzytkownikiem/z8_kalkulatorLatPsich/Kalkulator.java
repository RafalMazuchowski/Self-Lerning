package paczka1.r2_interakcjeZUzytkownikiem.z8_kalkulatorLatPsich;

import javax.swing.JOptionPane;

public class Kalkulator {

public static void main(String[] args) {

	String imie = JOptionPane.showInputDialog("Podaj imi� psa:");
	Integer wiek = Integer.parseInt(JOptionPane.showInputDialog("Podaj wiek psa: "));
	JOptionPane.showMessageDialog(null,
			"Gdyby " + imie + " by� cz�owiekiem, mia�by " + wiek * 5 + " lat.");
}
}