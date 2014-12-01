import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static final void main(String[] args) {

		
		long startTime;
		long endTime;
		long runTime;
		ArrayList<Integer> integers;
		
		System.out.println("Would you like to generate a new file of integers?");
		//RandomInteger.createFile();

		try {
			PrintStream out = new PrintStream(
					new FileOutputStream("output.txt"));
			System.setOut(out);

			integers = loadArray();
			startTime = System.currentTimeMillis();
			InsertionSort.insertionSort(integers);
			endTime = System.currentTimeMillis();
			runTime = ((endTime - startTime));
			System.out.println("Runtime for Insertion Sort was: " + runTime);

			integers = loadArray();
			startTime = System.currentTimeMillis();
			QuickSort.quicksort(integers);
			endTime = System.currentTimeMillis();
			runTime = ((endTime - startTime));
			System.out.println("Runtime for Quick Sort was: " + runTime);

			integers = loadArray();
			startTime = System.currentTimeMillis();
			MergeSort.mergeSort(integers);
			endTime = System.currentTimeMillis();
			runTime = ((endTime - startTime));
			System.out.println("Runtime for Merge Sort was: " + runTime);

			integers = loadArray();
			startTime = System.currentTimeMillis();
			HeapSort.heapSort(integers);
			endTime = System.currentTimeMillis();
			runTime = ((endTime - startTime));
			System.out.println("Runtime for Heap Sort was: " + runTime);
			
		} catch (Exception ex) {
			System.out.println("Error -- " + ex);
		}

	}

	public static ArrayList<Integer> loadArray() {

		ArrayList<Integer> integers = new ArrayList<Integer>();

		try {
			FileReader file = new FileReader("random-ints.txt");

			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
				integers.add(sc.nextInt());
			}
			sc.close();

		} catch (Exception ex) {
			System.out.println("Error -- " + ex);
		}
		return integers;
	}

}
