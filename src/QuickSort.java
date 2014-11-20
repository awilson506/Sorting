import java.util.ArrayList;

public class QuickSort {

	public static ArrayList<Integer> quicksort(ArrayList<Integer> input) {

		if (input.size() <= 1) {
			return input;
		}

		int middle = (int) Math.ceil((double) input.size() / 2);
		int pivot = input.get(middle);

		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();

		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) <= pivot) {
				if (i == middle) {
					continue;
				}
				less.add(input.get(i));
			} else {
				greater.add(input.get(i));
			}
		}

		return concatenate(quicksort(less), pivot, quicksort(greater));
	}

	private static ArrayList<Integer> concatenate(ArrayList<Integer> less,
			int pivot, ArrayList<Integer> greater) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < less.size(); i++) {
			list.add(less.get(i));
		}

		list.add(pivot);

		for (int i = 0; i < greater.size(); i++) {
			list.add(greater.get(i));
		}

		return list;
	}

}
