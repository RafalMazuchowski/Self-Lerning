package r7_kasy.z5_zbiornik;

public class Zbiornik {
	static int ilosc_wody = 0;

	@Override
	public String toString() {
		return "Zbiornik z " + ilosc_wody + " litrami wody";
	}

	private static int dolej(int ile) {
		ilosc_wody = ilosc_wody + ile;
		return ilosc_wody;
	}

	private static int odlej(int ile) {
		System.out.println("Ile: " + ile + " , ilosc_wody: " + ilosc_wody);
		if (ile <= ilosc_wody)
			ilosc_wody = ilosc_wody - ile;
		return ilosc_wody;
	}

	public static void main(String[] args) {
		
		Zbiornik zbiornik = new Zbiornik();

		System.out.println(zbiornik);
		Zbiornik.dolej(400);
		System.out.println(zbiornik);
		Zbiornik.dolej(300);
		System.out.println(zbiornik);
		Zbiornik.odlej(100);
		System.out.println(zbiornik);
		Zbiornik.odlej(1000);
		System.out.println(zbiornik);
	}
}
