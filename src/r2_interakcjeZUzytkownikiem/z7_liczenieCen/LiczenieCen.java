package r2_interakcjeZUzytkownikiem.z7_liczenieCen;

import java.util.Formatter;

import javax.swing.JOptionPane;

public class LiczenieCen {
	private static Formatter fmt;

	public static void main(String[] args) {

		String produkt = JOptionPane.showInputDialog("Co chcesz kupi�?");
		Double cena = Double.parseDouble(JOptionPane.showInputDialog("Podaj cen� towaru"));
		Double ilo�� = Double.parseDouble(JOptionPane.showInputDialog("Podaj ilo�� towaru"));
		fmt = new Formatter();
		fmt.format("%.2f", cena * ilo��);
		JOptionPane.showMessageDialog(null,
				"Za " + produkt + " kt�ry chcesz kupi�, zap�acisz " + (fmt) + " z�");
	}
}
