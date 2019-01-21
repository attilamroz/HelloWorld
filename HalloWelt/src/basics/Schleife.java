package basics;

public class Schleife {

	public static void main(String[] args) {
		// 1. Variablendekleration und Zuweisung, 2. Bedingung; 3. Increment/Decrement
		for (int i = 0; i < 10; i++) {
			System.out.println("1.Zahl: " + i);
		}
		System.out.println(" ");
		//
		int j = 0;
		for (; j < 10;) {
			System.out.println("2.Zahl: " + j);
			j += 1;
		}
		System.out.println(" ");
	}

}
