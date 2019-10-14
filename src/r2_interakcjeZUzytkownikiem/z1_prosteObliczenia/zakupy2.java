package r2_interakcjeZUzytkownikiem.z1_prosteObliczenia;

import javax.swing.JOptionPane;

public class zakupy2 {

	public static void main(String[] args) {
		
		String pytanie1 = JOptionPane.showInputDialog("Ile kosztuje 1kg ziemniakow?");
		String pytanie2 = JOptionPane.showInputDialog("Ile ziemniakow chcesz kupic?");
		Integer a = Integer.parseInt(pytanie1);
		Integer b = Integer.parseInt(pytanie2);
		System.out.println(b + "kg ziemniakow kosztuje: " + a*b);

	}
}
