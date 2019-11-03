package r7_kasy.z1_og³oszenia;

public class OgloszenieSamochodowe extends Ogloszenie {

	private String model;
	private String marka;
	private String rokProdukcji;
	private int przebieg;
	private double pojemnosc;
	private int moc;
	private String rodzajPaliwa;

	public OgloszenieSamochodowe(String tytul, String opis, String dane, double cena, String model, String marka,
			String rokProdukcji, int przebieg, double pojemnosc, int moc, String rodzajPaliwa) {
		super(tytul, opis, dane, cena);
		this.model = model;
		this.marka = marka;
		this.rokProdukcji = rokProdukcji;
		this.przebieg = przebieg;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
		this.rodzajPaliwa = rodzajPaliwa;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(String rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public double getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}

	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}

}
