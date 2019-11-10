package r2_interakcjeZUzytkownikiem.z2_butyDoSzewca;

import javax.swing.JOptionPane;

public class Zamowienie {

	public static void main(String[] args) {
		String pytanie1 = null;
		Integer dzien = 0;
		do {
			pytanie1 = JOptionPane.showInputDialog("Kiedy buty zostaly przyniesione?");
			dzien = Integer.parseInt(pytanie1);
		} while (dzien > 7);

		String pytanie2 = JOptionPane.showInputDialog("Ile dni potrwa naprawa?");
		Integer dlugosc = Integer.parseInt(pytanie2);

		int naprawa = (dzien + dlugosc % 7);
		while (naprawa > 7) {
			naprawa = naprawa - 7;
		}
		JOptionPane.showMessageDialog(null, "Buty beda gotowe w " + nazwaDniaTygodnia(naprawa));
	}

	public static String nazwaDniaTygodnia(int numer) {
		switch (numer) {
		case 1:
			return "poniedzialek";
		case 2:
			return "wtorek";
		case 3:
			return "sroda";
		case 4:
			return "czwartek";
		case 5:
			return "piatek";
		case 6:
			return "sobota";
		case 0:
		case 7:
			return "niedziela";
		default:
			return "Nieprawidłowy numer dnia tygodnia";
		}
	}
}
