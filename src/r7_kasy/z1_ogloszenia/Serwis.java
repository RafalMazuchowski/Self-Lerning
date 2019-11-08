package r7_kasy.z1_ogloszenia;

public class Serwis {

	public static void main(String[] args) {
		OgloszenieSamochodowe og1 = new OgloszenieSamochodowe("Sprzedam Passata", "Ig³a, finkiel nówka. Niemiec p³aka", "856-985-428", 2575, "VolxWagen", "Passat", 89, 1.6, 305000, 107, "LPG");
		OgloszenieMieszkaniowe og2 = new OgloszenieMieszkaniowe("Willa", "Sprzedam dom willowy", "hugon@hail.de", 145000, "Breslow", 260, 7);
		
		System.out.println(og1.getModel());
		System.out.println(og2.getTytul());
	}

}
