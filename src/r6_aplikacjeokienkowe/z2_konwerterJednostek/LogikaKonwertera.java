package r6_aplikacjeokienkowe.z2_konwerterJednostek;

public class LogikaKonwertera {
    
    public static double oblicz(String operacja){
        
        double wynik = 0.0;
        
        switch (operacja) {
            case "cm":
                wynik = 0.01;
                break;
            case "m":
                wynik = 1;
                break;
            case "km":
                wynik = 1000;
                break;
            case "Cale":
                wynik = 0.0254;
                break;
            case "Stopy":
                wynik = 0.3048;
                break;
            case "Mile":
                wynik = 1609.344;
                break;    
        }
        
        return wynik;
    }
    
}
