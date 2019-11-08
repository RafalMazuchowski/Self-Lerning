package r7_kasy.z2_listaOgloszen;

import java.util.ArrayList;

import r7_kasy.z1_ogloszenia.OgloszenieMieszkaniowe;

public class Serwis2 {

	public static void main(String[] args) {
		ArrayList<OgloszenieMieszkaniowe> listaMieszkan = new ArrayList<OgloszenieMieszkaniowe>();

		listaMieszkan.add(new OgloszenieMieszkaniowe("Willa", "Sprzedam dom willowy", "hugon@hail.de", 145000,
				"Breslow", 260, 7));
		listaMieszkan.add(
				new OgloszenieMieszkaniowe("Domek", "Sprzedam maly domek", "frodo@bro.pl", 55000, "Tomaszow", 90, 3));
		listaMieszkan.add(new OgloszenieMieszkaniowe("Penthause", "Luksusowy Penthause", "874-465-862", 7400000,
				"San Diego", 730, 12));
		listaMieszkan.add(new OgloszenieMieszkaniowe("Szalas", "Dobre miejsce na impreze", "874-465-862", 7400,
				"San Diego", 10, 1));
		listaMieszkan.add(new OgloszenieMieszkaniowe("Mieszkanie", "Sprzedam mieszkanie", "trusku@gmail.com", 37000,
				"Wroclaw", 330, 4));

		System.out.println("Ogloszenia z przedzialu cenowego 50'000 do 100'000:");
		for (OgloszenieMieszkaniowe str : listaMieszkan) {
			if (str.getCena() > 50000 && str.getCena() <= 100000) {
				System.out.println(str);
			}
		}
		
		System.out.println();
		
		System.out.println("Ogloszenia z San diego z metrarzem +100:");
		for (OgloszenieMieszkaniowe str : listaMieszkan) {
			if (str.getMetraz() >= 100 && str.getMiejscowosc() == "San Diego") {
				System.out.println(str.getTytul() + ", Cena: " + str.getCena());
			}
		}
	}

}
