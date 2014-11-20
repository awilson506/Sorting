import java.util.ArrayList;

public class InsertionSort {

	public static void insertionSort(ArrayList<Integer> x) {
		int temp;
		int position;

		for (int k = 1; k < x.size(); k++) {
			temp = x.get(k);
			position = k;
			while (position > 0 && x.get(position - 1) > temp) {
				x.set(position, x.get(position - 1));
				position--;
			}
			x.set(position, temp);
		}
	}

}
