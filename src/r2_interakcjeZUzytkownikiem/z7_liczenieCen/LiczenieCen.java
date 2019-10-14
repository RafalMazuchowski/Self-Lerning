package r2_interakcjeZUzytkownikiem.z7_liczenieCen;

import java.util.Formatter;

import javax.swing.JOptionPane;

public class LiczenieCen {
	private static Formatter fmt;

	public static void main(String[] args) {

		String produkt = JOptionPane.showInputDialog("Co chcesz kupiæ?");
		Double cena = Double.parseDouble(JOptionPane.showInputDialog("Podaj cenê towaru"));
		Double iloœæ = Double.parseDouble(JOptionPane.showInputDialog("Podaj iloœæ towaru"));
		fmt = new Formatter();
		fmt.format("%.2f", cena * iloœæ);
		JOptionPane.showMessageDialog(null,
				"Za " + produkt + " który chcesz kupiæ, zap³acisz " + (fmt) + " z³");
	}
}
