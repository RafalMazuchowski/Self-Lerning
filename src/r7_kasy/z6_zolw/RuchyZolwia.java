package r7_kasy.z6_zolw;

public class RuchyZolwia {

	private static void wolajZolwia(Zolw z) {
		System.out.println("X=" + z.getX() + ", Y=" + z.getY());
	}

	public static void main(String[] args) {
		Zolw z = new Zolw(100, 100);
		z.idz(50);

		wolajZolwia(z);

		z.obrocSie(90);
		z.idz(50);

		wolajZolwia(z);

		z.obrocSie(-90);
		z.idz(10);

		wolajZolwia(z);

		z.obrocSie(360);
		z.idz(100);

		wolajZolwia(z);

		z.obrocSie(44); // kierunek: 44
		z.obrocSie(90); // kierunek: 134
		z.idz(50);

		wolajZolwia(z);

		z.idz(50);
		z.obrocSie(90);
		z.idz(50);

		wolajZolwia(z);
	}

}
