package r8_przetwarzaniePlikow.z1_daneSkoczkowNarciarskich;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaCSV_skoczkow {

	public static final String SEPARATOR = ";";

	public static List<Skoczek> wczytajSkoczkow(File plik) {
		List<Skoczek> skoczkowie = new ArrayList<>();

		try (Scanner sc = new Scanner(plik)) {

			while (sc.hasNext()) {
				String linia = sc.nextLine();

				String[] pola = linia.split(SEPARATOR);

				//LocalDate rokurodzenia = LocalDate.parse(pola[3]);
				int wzrost = Integer.parseInt(pola[4]);
				int waga = Integer.parseInt(pola[5]);

				Skoczek skoczek = new Skoczek(pola[0], pola[1], pola[2], pola[3], wzrost, waga);
				skoczkowie.add(skoczek);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return skoczkowie;
	}

}
