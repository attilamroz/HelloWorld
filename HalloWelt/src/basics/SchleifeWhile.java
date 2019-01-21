package basics;

public class SchleifeWhile {

	public static void main(String[] args) {

		int Zahl1 = 120;
		int Zahl2 = Zahl1;
		while (Zahl2 > 0) {
			if ((Zahl1 % Zahl2) == 0) {
				System.out.println(Zahl2);
			}
			Zahl2--;
		}
	}

}
