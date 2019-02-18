package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] zahlen = { 3, 6, 1, 9, 2, 5 };

		// zufall
		for (int i = 0; i < zahlen.length; i++) {
			long b = Math.round(Math.random() * 10);
			int v = (int) b;
			zahlen[i] = v;
		}

		// print zahlen
		System.out.println("Unsortiert:");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
		System.out.println("--------------------------------------");

		// Bubblesort
		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					int x = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = x;
				}
			}
		}

		// print zahlen
		System.out.println("Sortiert:");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}
	}

}
