import java.awt.List;
import java.util.ArrayList;


public class MergeSort {
	
	public static void mergeSort(ArrayList<Integer> input){
		ArrayList<Integer> left = left(input);
		ArrayList<Integer> right = right(input);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(input, left, right);
	}

	private static ArrayList<Integer> left(ArrayList<Integer> input) {
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		
		for(int i = 0; i < input.size() / 2; i++){
			left.set(i,input.get(i));
		}
		return left;
	}

}
