package sort;

public class QuickSort2 {

	public static void main(String[] args) {
		
		int[] zahlen = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < zahlen.length; i++) {
			int v= 0;
			do {
				long b = Math.round(Math.random() * (zahlen.length -1));
				v = (int) b;
			} while(zahlen[v] != 0);
			zahlen[v] = i;
		}
		
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
		System.out.println();
		quicksort(0, zahlen.length - 1, zahlen);
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
	}

	public static void quicksort(int links, int rechts, int[] zahlen) {
		if (links < rechts) {
			int teiler = teile(links, rechts, zahlen);
			quicksort(links, teiler, zahlen);
			quicksort(teiler + 1, rechts, zahlen);

		}
	}

	public static int teile(int links, int rechts, int[] zahlen) {
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
