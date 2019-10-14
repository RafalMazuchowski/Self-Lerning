package r3_pisanieFunkcji.z2_kilometryIMile;

public class Obliczanie {

	public static double KilometryNaMile(double km) {
		double mile = km * 0.621371192;
		return mile;
	}

	public static double MileNaKilometry(double mile) {
		double km = mile * 1.609344;
		return km;
	}
}
