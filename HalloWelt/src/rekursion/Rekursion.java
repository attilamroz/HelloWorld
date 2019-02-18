package rekursion;

public class Rekursion {

	public static void main(String[] args) {
		ausgabe1(10000);
	}
	
	public static void ausgabe1(int zahl) {
		if (zahl == 0) {
			return;
		}
		zahl = zahl/3;
		System.out.println(zahl);
		//rekursion = aufrufen der methode in der methode
		ausgabe1(zahl);
	}

}
