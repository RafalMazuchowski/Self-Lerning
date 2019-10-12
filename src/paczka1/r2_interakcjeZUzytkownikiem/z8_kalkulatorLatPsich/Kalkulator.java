package paczka1.r2_interakcjeZUzytkownikiem.z8_kalkulatorLatPsich;

import javax.swing.JOptionPane;

public class Kalkulator {

public static void main(String[] args) {

	String imie = JOptionPane.showInputDialog("Podaj imiê psa:");
	Integer wiek = Integer.parseInt(JOptionPane.showInputDialog("Podaj wiek psa: "));
	JOptionPane.showMessageDialog(null,
			"Gdyby " + imie + " by³ cz³owiekiem, mia³by " + wiek * 5 + " lat.");
}
}