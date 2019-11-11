package r7_kasy.z5_zbiornik;

public class ZbiornikOgraniczony extends Zbiornik {

	private int pojemnoscZbiornika = 3000;

	private Boolean czySieZmiesci(int nowa_woda) {
		if (nowa_woda <= pojemnoscZbiornika) {
			return true;
		} else
			return false;
	}

	@Override
	protected void dolej(int ile, double temp) {
		super.dolej(ile, temp);
		int nowa_woda = getIlosc_wody() + ile;
		if (czySieZmiesci(nowa_woda)) {
			if (getIlosc_wody() != 0) {
				roznicaTemp(ile, temp, nowa_woda);
			}
			setIlosc_wody(nowa_woda);
		} else
			System.out.println("Pe³ny poejmnik!");
	}

	public static void main(String[] args) {

		ZbiornikOgraniczony zbiornik = new ZbiornikOgraniczony();

		System.out.println(zbiornik);
		System.out.println("Dolewamy: 400, 30");
		zbiornik.dolej(400, 30);
		zbiornik.odlej(500);
		System.out.println(zbiornik);
		System.out.println("Dolewamy: 300, 10");
		zbiornik.dolej(300, 10);
		System.out.println(zbiornik);
		System.out.println("Dolewamy: 300, 10");
		zbiornik.dolej(400, 10);
		System.out.println(zbiornik);
	}
}
