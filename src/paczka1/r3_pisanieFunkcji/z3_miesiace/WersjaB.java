package paczka1.r3_pisanieFunkcji.z3_miesiace;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class WersjaB {

	public static void main(String[] args) {
		String miesiac = JOptionPane.showInputDialog("MIESI¥C:");
		String miesiacF = miesiac.substring(0, 1).toUpperCase() + miesiac.toLowerCase().substring(1);
		System.out.println(miesiacF);
		int dni = 0;

		List<String> miesiace31 = mies31();
		List<String> miesiace30 = mies30();

		dni = petle(miesiacF, dni, miesiace31, miesiace30);
		
		if (dni == 1) {
			JOptionPane.showMessageDialog(null, miesiacF + " ma 31 dni");
		} else if (dni == 2) {
			JOptionPane.showMessageDialog(null, miesiacF + " ma 30 dni");
		} else if (dni == 3) {
			JOptionPane.showMessageDialog(null, miesiacF + " ma 28 dni");
		}
	}

	public static int petle(String miesiacF, int dni, List<String> miesiace31, List<String> miesiace30) {
		for (int i = 0; i < miesiace31.size(); i++) {
			if (miesiacF.equals(miesiace31.get(i))) {
				dni = 1;
				break;
			}
		}

		if (dni == 0) {
			for (int i = 0; i < miesiace30.size(); i++) {
				if (miesiacF.equals(miesiace30.get(i))) {
					dni = 2;
					break;
				}
			}
		}

		if ((dni == 0)) {
			if (miesiacF.equals("Luty")) {
				dni = 3;
			} else
				System.out.println("B³¹d!");
		}
		return dni;
	}

	private static List<String> mies30() {
		List<String> miesiace30 = new ArrayList<String>();
		miesiace30.add("Kwiecien");
		miesiace30.add("Czerwiec");
		miesiace30.add("Wrzesien");
		miesiace30.add("Listopad");
		return miesiace30;
	}

	private static List<String> mies31() {
		List<String> miesiace31 = new ArrayList<String>();
		miesiace31.add("Styczeñ");
		miesiace31.add("Marzec");
		miesiace31.add("Maj");
		miesiace31.add("Lipiec");
		miesiace31.add("Sierpieñ");
		miesiace31.add("PaŸdziernik");
		miesiace31.add("Grudzieñ");
		return miesiace31;
	}
}
