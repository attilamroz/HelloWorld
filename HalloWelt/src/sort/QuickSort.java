package sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] list = {89,3,6,89,5,23,2,6,8,0,6,4,2,5,7,8,7,4};
		
	}
	
	public static void quicksort(int links, int rechts) {
		if (links<rechts) {
			int teiler = teile(links, rechts);
			quicksort(links, teiler-1);
			quicksort(teiler+1, rechts);
			
		}
	}
	
	public static void teile(int links, int rechts) {
		int i = links;
		int j = rechts-1;
		int pivot = list[rechts];
	}

}
