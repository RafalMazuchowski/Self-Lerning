package r2_interakcjeZUzytkownikiem.z1_prosteObliczenia;

import javax.swing.JOptionPane;

public class zakupy1 {

	public static void main(String[] args) {
		
		String pytanie = JOptionPane.showInputDialog("Ile kosztuje 5kg ziemniakow?");
		Integer a = Integer.parseInt(pytanie);
		System.out.println("5kg ziemniakow kosztuje: " + 5 * a);

	}
}
