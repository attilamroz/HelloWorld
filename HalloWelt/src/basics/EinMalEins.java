package basics;

public class EinMalEins {

	public static void main(String[] args) {
		for (int row = 1; row <= 10; row++) {
			System.out.printf("%12s", row + "er Reihe:\t");
			for (int num = 1; num <= 10; num++) {
				// System.out.print(row * num + "\t");
				System.out.printf("%4s", row * num + "\t");
			}
			System.out.println();
		}
	}

}
