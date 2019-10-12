package paczka1.r2_interakcjeZUzytkownikiem.z5_poleTrojkata;

import javax.swing.JOptionPane;

public class PoleTrojkata {
	public static void main(String[] args) {
		double suma = 0;
		Double a;
		Double b;
		Double c;
		do {
			suma = 0;
			a = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok A trójk¹ta: (cm)"));
			b = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok B trójk¹ta: (cm)"));
			c = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok C trójk¹ta: (cm)"));
			if (a >= b && a >= c) {
				suma = a - (b + c);

			} else if (b >= a && b >= c) {
				suma = b - (a + c);

			} else if (c >= b && c >= a) {
				suma = c - (a + b);
			}
		} while (suma >= 0);
		double p = (a+b+c)/2;
		double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		JOptionPane.showMessageDialog(null,"Pole trójk¹ta wynosi " + pole + "cm^2");
	}
}
