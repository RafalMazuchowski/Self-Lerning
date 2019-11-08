package r7_kasy.z1_ogloszenia;

public class Ogloszenie {
	String tytul, opis, dane;
	int cena;

	public Ogloszenie(String tytul, String opis, String dane, int cena) {
		super();
		this.tytul = tytul;
		this.opis = opis;
		this.dane = dane;
		this.cena = cena;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getDane() {
		return dane;
	}

	public void setDane(String dane) {
		this.dane = dane;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}


}
