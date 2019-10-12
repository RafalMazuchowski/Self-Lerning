package paczka1.r2_interakcjeZUzytkownikiem.z4_oplataHotelowa;

import javax.swing.JOptionPane;

public class OplataHotelowa {
	public static void main(String[] args) {
		Integer wiek = Integer.parseInt(JOptionPane.showInputDialog("Ile masz lat?"));
		Integer dni = Integer.parseInt(JOptionPane.showInputDialog("Ile nocy chcesz spêdziæ w hotelu?"));
		double pobyt = 0;
		if (wiek < 18) {
			pobyt = dni * 100;
		} else if (wiek >= 18) {
			if (dni <= 1) {
				pobyt = dni * 200;
			} else if (dni > 1 && dni < 5) {
				pobyt = dni * 180;
			} else if (dni >= 5){
				pobyt = dni * 150;				
			} else System.out.println("Niew³aœciwe dane");
		} if (wiek >= 65) {
			pobyt = pobyt - (pobyt * 0.1);
		}
		JOptionPane.showMessageDialog(null,"Za pobyt w hotelu zap³acisz: " + pobyt + "z³");
	}

}
