package paczka1.r3_pisanieFunkcji.z1_funkcjeLiczbowe;

import javax.swing.JOptionPane;

public class FunkcjeLiczbowe {
	public static void main(String[] args) {
		int stopy = 100;
		double metry = stopyNaMetry(stopy);
		System.out.println(metry);
		
		double wzrost = 1.75; 
		double masa = 65; 
		System.out.println(bmi(wzrost, masa));
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok A trójk¹ta:"));
		Double b = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok B trójk¹ta:"));
		Double c = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok C trójk¹ta:"));
		JOptionPane.showMessageDialog(null, "Pole trójk¹ta wynosi:\n" + poleTrojkata(a,b,c));

	}

	public static double stopyNaMetry(double stopy) {
		double metry;
		metry = stopy / 3.2808;
		return metry;
	}

	public static double max(double a, double b) {
		double max = 0;
		if (a > b) {
			max = a;
		} else
			max = b;
		return max;
	}
	
	public double srednia(double a, double b) {
		double srednia = a + b / 2;
		return srednia;
	}
	
	public double poleKola (double r) {
		double pole = Math.PI * Math.pow(r, 2);
		return pole;
	}
	
	public static double bmi (double wzrost, double masa) {
		double bmi = masa / Math.pow(wzrost, 2);
		return bmi;
	}
	
	public static double poleTrojkata (double a, double b, double c) {
		double p = (a + b + c)/2;
		double pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));		
		return pole;
	}
}
