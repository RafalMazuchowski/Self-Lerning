package r7_kasy.z3_odczytOgloszenZPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import r7_kasy.z1_ogloszenia.OgloszenieMieszkaniowe;

public class ObslugaCSV {

	public static final String SEPARATOR = ";";

	public static void zapiszMieszkania(List<OgloszenieMieszkaniowe> listaMieszkan, File plik) {
		try (PrintWriter out = new PrintWriter(plik)) {

			for (OgloszenieMieszkaniowe mieszkanie : listaMieszkan) {
				out.print(mieszkanie.getTytul());
				out.print(SEPARATOR);
				out.print(mieszkanie.getOpis());
				out.print(SEPARATOR);
				out.print(mieszkanie.getDane());
				out.print(SEPARATOR);
				out.print(mieszkanie.getCena());
				out.print(SEPARATOR);
				out.print(mieszkanie.getMiejscowosc());
				out.print(SEPARATOR);
				out.print(mieszkanie.getMetraz());
				out.print(SEPARATOR);
				out.print(mieszkanie.getLiczbaPokoi());
				out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static List<OgloszenieMieszkaniowe> wczytajMieszkania(File plik) {
		List<OgloszenieMieszkaniowe> mieszkania = new ArrayList<>();

		try (Scanner sc = new Scanner(plik)) {

			while (sc.hasNextLine()) {
				String linia = sc.nextLine();

				String[] pola = linia.split(SEPARATOR);

				int cena = Integer.parseInt(pola[3]);
				Double metraz = Double.parseDouble(pola[5]);
				int liczbaPokoi = Integer.parseInt(pola[6]);

				OgloszenieMieszkaniowe mieszkanie = new OgloszenieMieszkaniowe(pola[0], pola[1], pola[2], cena, pola[4], metraz, liczbaPokoi);
				mieszkania.add(mieszkanie);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mieszkania;
	}

}
