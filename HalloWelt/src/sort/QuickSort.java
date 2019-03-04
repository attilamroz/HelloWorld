package sort;

public class QuickSort {

	static int[] zahlen = { 9, 2, 5, 1, 7, 10, 6, 4, 3 };

	public static void main(String[] args) {
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
		System.out.println();
		quicksort(0, zahlen.length - 1);
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
	}

	public static void quicksort(int links, int rechts) {
		if (links < rechts) {
			int teiler = teile(links, rechts);
			quicksort(links, teiler - 1);
			quicksort(teiler + 1, rechts);

		}
	}

	public static int teile(int links, int rechts) {
		int i = links;
		int j = rechts - 1;
		int pivot = zahlen[rechts];
		do {
			while (i < rechts - 1 && zahlen[i] < pivot) {
				i = i + 1;
			}
			while (j > links && zahlen[j] >= pivot) {
				j = j - 1;
			}
			if (i < j) {
				int tauschvar = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = tauschvar;
			}
		} while (i < j);
		if (zahlen[i] > pivot) {
			int tauschvar = zahlen[i];
			zahlen[i] = pivot;
			zahlen[rechts] = tauschvar;
		}
		return i;
	}

}
