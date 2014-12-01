import java.util.ArrayList;

public class MergeSort {

	public static void mergeSort(ArrayList<Integer> input) {
		
		
		if (input.size() > 1) {
			
			ArrayList<Integer> left = left(input);
			ArrayList<Integer> right = right(input);
			
			mergeSort(left);
			mergeSort(right);

			merge(input, left, right);
		}
	}

	private static void merge(ArrayList<Integer> input,
			ArrayList<Integer> left, ArrayList<Integer> right) {
		int indexleft = 0;
		int indexright = 0;
		
		for (int i = 0; i < input.size(); i++) {
			if (indexright >= right.size() || indexleft < left.size()
					&& left.get(indexleft) <= right.get(indexright)) {
				input.set(i, left.get(indexleft));
				indexleft++;
			} else {
				input.set(i, right.get(indexright));
				indexright++;
			}
		}

	}

	private static ArrayList<Integer> right(ArrayList<Integer> input) {

		ArrayList<Integer> right = new ArrayList<Integer>();
		int left = input.size() / 2;

		for (int i = 0; i < input.size() - left; i++) {
			right.add(input.get(i + left));
		}

		return right;
	}

	private static ArrayList<Integer> left(ArrayList<Integer> input) {
		
		ArrayList<Integer> left = new ArrayList<Integer>();

		for (int i = 0; i < input.size() / 2; i++) {
			left.add(input.get(i));
		}
		return left;
	}

}
