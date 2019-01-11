package basics;

public class Reihe10bis20 {

	public static void main(String[] args) {
		for (int row = 20; row >= 10; row--) {
			System.out.print(row + "er Reihe");
			for (int num = 1; num <= 10; num++) {
				System.out.print("\t" + (row*num));
			}
			System.out.println();
		}
	}
}
