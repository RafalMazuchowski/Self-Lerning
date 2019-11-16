package r8_przetwarzaniePlikow.z1_daneSkoczkowNarciarskich;

public class Skoczek {

	private String imie;
	private String nazwisko;
	private String kraj;
	private String rokurodzenia;
	private int wzrost;
	private int waga;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getRokurodzenia() {
		return rokurodzenia;
	}

	public void setRokurodzenia(String rokurodzenia) {
		this.rokurodzenia = rokurodzenia;
	}

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	public int getWaga() {
		return waga;
	}

	public void setWaga(int waga) {
		this.waga = waga;
	}

	public Skoczek(String imie, String nazwisko, String kraj, String rokurodzenia, int wzrost, int waga) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kraj = kraj;
		this.rokurodzenia = rokurodzenia;
		this.wzrost = wzrost;
		this.waga = waga;
	}

	@Override
	public String toString() {
		return "Skoczek [imie=" + imie + ", nazwisko=" + nazwisko + ", kraj=" + kraj + ", rokurodzenia=" + rokurodzenia
				+ ", wzrost=" + wzrost + ", waga=" + waga + "]";
	}

	
}
