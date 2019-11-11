package r7_kasy.z6_zolw;

class Zolw {
	private int x;
	private int y;
	private int kierunek;
	private int local_kierunek;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Zolw(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void idz(int idz) {
		if (kierunek == 0) {
			y = y + idz;
		} else if (kierunek == 180) {
			y = y - idz;
		} else if (kierunek == 90) {
			x = x + idz;
		} else if (kierunek == 270) {
			x = x - idz;
		} else {
			System.out.println("Zolw siê nie ruszyl, ale zrobil kupke");
			kierunek = local_kierunek;
			// kierunek = 0;
		}
		local_kierunek = kierunek;
	}

	public void obrocSie(int obrot) {
		while (obrot >= 360) {
			obrot = obrot - 360;
		}
		if (obrot > 0) {
			kierunek = kierunek + obrot;
		} else {
			kierunek = Math.abs(kierunek + obrot);
		}
	}
}
