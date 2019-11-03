package r4_interakcjaWPetli.z1_zagadkaMatematyczna;

import java.util.Random;

import javax.swing.JOptionPane;

public class ZagadkaMatematyczna {

	public static void main(String[] args) {
		Random r = new Random();
		int liczba1 = r.nextInt(100);
		int liczba2 = r.nextInt(100);
		int suma = liczba1 + liczba2;
		int zagadka = 0;
		do {
		zagadka = Integer.parseInt(JOptionPane.showInputDialog("Jaka jest suma liczb: " + liczba1 + " i " + liczba2));
		} while (zagadka != suma);
		JOptionPane.showMessageDialog(null, "Dobrze!\n" + liczba1 + "+" + liczba2 + "=" + suma);
	}

}
