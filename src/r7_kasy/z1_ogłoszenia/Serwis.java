package r7_kasy.z1_og³oszenia;

public class Serwis {

	public static void main(String[] args) {
		Ogloszenie og1 = new OgloszenieSamochodowe("Sprzedam Passata", "Ig³a, finkiel nówka. Niemiec p³aka", "856-985-428", 2575, "VolxWagen", "Passat", 89, 1.6, 305000, 107, "LPG");
		Ogloszenie og2 = new OgloszenieMieszkaniowe("Willa", "Sprzedam dom willowy", "hugon@hail.de", 145000, "Breslow", 260, 7);
		
		System.out.println(og1);
		System.out.println(og2);
	}

}
