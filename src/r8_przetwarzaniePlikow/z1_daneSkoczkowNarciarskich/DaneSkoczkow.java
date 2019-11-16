package r8_przetwarzaniePlikow.z1_daneSkoczkowNarciarskich;

import java.io.File;
import java.util.List;

public class DaneSkoczkow {

	public static List<Skoczek> wczytanieSkoczkow() {
		File plik = new File("zawodnicy.csv");

		System.out.println("Czytam dane...");

		List<Skoczek> skoczkowie = ObslugaCSV_skoczkow.wczytajSkoczkow(plik);

		System.out.println("Wczytalem: " + skoczkowie.size() + " skoczkow\n");
		
		for(Skoczek skoczek : skoczkowie) {
			
			System.out.println(skoczek);
		}
		return skoczkowie;
	}

	public static void main(String[] args) {

		
		wczytanieSkoczkow();

	}

}
