package paczka1.r3_pisanieFunkcji.z2_kilometryIMile;

import javax.swing.JOptionPane;

public class Wywolanie {

	public static void main(String[] args) {
		double i = 0;
		while (!(i <= 2) || !(i >= 1)) {
			i = Double.parseDouble(JOptionPane.showInputDialog("Km ==> Mile: 1\nMile ==> Km: 2"));
		}
		if (i == 1) {
			double km = Double.parseDouble(JOptionPane.showInputDialog("Podaj km:"));
			double mile = Obliczanie.KilometryNaMile(km);

			if (mile == 1) {
				JOptionPane.showMessageDialog(null, km + " km to:   " + mile + " mila");
			} else if (mile > 1 && mile < 5) {
				JOptionPane.showMessageDialog(null, km + " km to:   " + mile + " mile");
			} else {
				JOptionPane.showMessageDialog(null, km + " km to:   " + mile + " mil");
			}

		} else if (i == 2) {
			double mile = Double.parseDouble(JOptionPane.showInputDialog("Podaj mile:"));

			if (mile == 1) {
				JOptionPane.showMessageDialog(null, mile + " mila to:   " + Obliczanie.MileNaKilometry(mile) + " km");
			} else if (mile > 1 && mile < 5) {
				JOptionPane.showMessageDialog(null, mile + " mile to:   " + Obliczanie.MileNaKilometry(mile) + " km");
			} else {
				JOptionPane.showMessageDialog(null, mile + " mil to:   " + Obliczanie.MileNaKilometry(mile) + " km");
			}
		} else
			System.out.println("Error!");

	}

}
