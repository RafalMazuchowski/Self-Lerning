package r2_interakcjeZUzytkownikiem.z1_prosteObliczenia;

import javax.swing.JOptionPane;

public class zakupy3 {

	public static void main(String[] args) {

		String pytanie_ziemniaki1 = JOptionPane.showInputDialog("Ile kosztuje 1kg ziemniakow?");
		String pytanie_ziemniaki2 = JOptionPane.showInputDialog("Ile ziemniakow chcesz kupic?");
		Integer cenaZ = Integer.parseInt(pytanie_ziemniaki1);
		Integer iloscZ = Integer.parseInt(pytanie_ziemniaki2);

		String pytanie_banany1 = JOptionPane.showInputDialog("Ile kosztuje 1kg bananow?");
		String pytanie_banany2 = JOptionPane.showInputDialog("Ile bananow chcesz kupic?");
		Integer cenaB = Integer.parseInt(pytanie_banany1);
		Integer iloscB = Integer.parseInt(pytanie_banany2);

		int ziemniaki = cenaZ * iloscZ;
		int banany = cenaB * iloscB;
		System.out.println(
				"Za " + iloscZ + "kg ziemniakow i " + iloscB + "kg bananow zaplacisz: " + (ziemniaki + banany) + " zl");
		if (banany > ziemniaki) {
			System.out.println("Wiecej zaplacisz za banany: " + banany + "zl");
		}
		else if (ziemniaki > banany) {
			System.out.println("Wiecej zaplacisz za ziemniaki: " + ziemniaki + "zl");
		} else {
			System.out.println("Za ziemniaki i banany zaplacisz po rowno");
		}

	}
}
