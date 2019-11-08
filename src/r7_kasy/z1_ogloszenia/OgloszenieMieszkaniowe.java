package r7_kasy.z1_ogloszenia;

public class OgloszenieMieszkaniowe extends Ogloszenie {
	
	private String miejscowosc;
	private double metraz;
	private int liczbaPokoi;

	public OgloszenieMieszkaniowe(String tytul, String opis, String dane, int cena, String miejscowosc,
			double metraz, int liczbaPokoi) {
		super(tytul, opis, dane, cena);
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public double getMetraz() {
		return metraz;
	}

	public void setMetraz(double metraz) {
		this.metraz = metraz;
	}

	public int getLiczbaPokoi() {
		return liczbaPokoi;
	}

	public void setLiczbaPokoi(int liczbaPokoi) {
		this.liczbaPokoi = liczbaPokoi;
	}

	@Override
	public String toString() {
		return "OgloszenieMieszkaniowe [tytul=" + tytul + ", opis=" + opis + ", dane=" + dane + ", cena=" + cena + ", miejscowosc=" + miejscowosc + ", metraz=" + metraz + ", liczbaPokoi="
				+ liczbaPokoi + "]";
	}
	
	

	
	
}