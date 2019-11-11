package r7_kasy.z5_zbiornik;

import java.util.Locale;

public class Zbiornik {
	private int ilosc_wody = 1000;
	private double temperatura = 20;

		
	public int getIlosc_wody() {
		return ilosc_wody;
	}

	public void setIlosc_wody(int ilosc_wody) {
		this.ilosc_wody = ilosc_wody;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Zbiornik z " + ilosc_wody + " litrami wody w temp: " + temperatura + "*C";
	}
	
	
	protected void dolej(int ile, double temp) {
		int nowa_woda = getIlosc_wody() + ile;
		if (getIlosc_wody() != 0) {
			roznicaTemp(ile, temp, nowa_woda);
		}
		setIlosc_wody(nowa_woda);
	}

	protected void odlej(int ile) {
		System.out.println("Ile: " + ile + " , ilosc_wody: " + getIlosc_wody());
		if (ile <= getIlosc_wody())
			setIlosc_wody(getIlosc_wody() - ile);
	}

	protected void roznicaTemp(int ile, double temp, int nowa_woda) {
		double temp_koncowa = ((getIlosc_wody() * getTemperatura()) + (ile * temp)) / nowa_woda;
		double localTemperatura = getTemperatura();

		if (localTemperatura < temp_koncowa) {
			temp_koncowa = localTemperatura + (temp_koncowa - localTemperatura);
		} else {
			temp_koncowa = temp_koncowa - (localTemperatura - temp_koncowa);
		}
		String temp_krotki = String.format(Locale.ENGLISH, "%.2f", temp_koncowa);
		setTemperatura(Double.parseDouble(temp_krotki));
		 
	}

	public static void main(String[] args) {

		Zbiornik zbiornik = new Zbiornik();

		System.out.println(zbiornik);
		System.out.println("Dolewamy: 400, 30");
		zbiornik.dolej(400, 30);
		System.out.println(zbiornik);
		System.out.println("Dolewamy: 300, 10");
		zbiornik.dolej(300, 10);
		System.out.println(zbiornik);
		System.out.println("Odlewamy: 100");
		zbiornik.odlej(100);
		System.out.println(zbiornik);
		System.out.println("Odlewamy: 1000");
		zbiornik.odlej(1000);
		System.out.println(zbiornik);
		System.out.println("Dolewamy: 300, 10");
		zbiornik.dolej(300, 10);
		System.out.println(zbiornik);
	}
}
