import java.util.ArrayList;

public class HeapSort {

	private static int SIZE;

	public static void heapSort(ArrayList<Integer> input) {
		
		heapify(input);
		for (int i = SIZE; i > 0; i--) {
			swap(input, 0, i);
			SIZE -= 1;
			maxheap(input, 0);
		}
	}

	private static void maxheap(ArrayList<Integer> input, int i) {

		int right = 2 * i + 1;
		int left = 2 * i;
		int max = i;

		if (left <= SIZE && input.get(left) > input.get(i)) {
			max = left;
		}
		if (right <= SIZE && input.get(right) > input.get(max)) {
			max = right;
		}
		if (max != i) {
			swap(input, i, max);
			maxheap(input, max);
		}
	}

	private static void swap(ArrayList<Integer> input, int i, int k) {

		Integer temp = input.get(i);
		input.set(i, input.get(k));
		input.set(k, temp);

	}

	private static void heapify(ArrayList<Integer> input) {
		
		SIZE = input.size() - 1;
		for (int i = SIZE / 2; i >= 0; i--) {
			maxheap(input, i);
		}

	}
}
