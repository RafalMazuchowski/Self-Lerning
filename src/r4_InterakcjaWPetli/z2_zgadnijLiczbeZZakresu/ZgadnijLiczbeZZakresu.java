package r4_interakcjaWPetli.z2_zgadnijLiczbeZZakresu;

import java.util.Random;

import javax.swing.JOptionPane;

public class ZgadnijLiczbeZZakresu {

	public static void main(String[] args) {
		Random r = new Random();
		int liczba = r.nextInt(1000);
		System.out.println(liczba);
		int wpisana = Integer.parseInt(JOptionPane.showInputDialog("Zgadnij liczbê z przedzia³u 0-999"));
		int i = 1;

		for (; liczba != wpisana; i++) {
			if (wpisana > liczba) {
				JOptionPane.showMessageDialog(null, "Szykana liczba jest mniejsza");
			} else if (wpisana < liczba) {
				JOptionPane.showMessageDialog(null, "Szykana liczba jest wiêksza");
			}
			wpisana = Integer.parseInt(JOptionPane.showInputDialog("Zgaduj dalej..."));
		}
		JOptionPane.showMessageDialog(null,
				"BRAWO!\n" + liczba + "\nUda³o Ci siê zgadn¹æ liczbê za " + i + " podejœciem");
	}

}
