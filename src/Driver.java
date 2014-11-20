import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static final void main(String... aArgs) {
		
		long startTime;
		long endTime;
		long runTime;
		ArrayList<Integer> integers = new ArrayList<Integer>();
		
		try {
			FileReader file = new FileReader("random-ints.txt");
			
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()){
				integers.add(sc.nextInt());
			}
			sc.close();
		} catch (Exception e) {

		}
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(integers);
		endTime = System.currentTimeMillis();
		runTime = (( endTime - startTime ));
		System.out.println("Runtime for Insertion Sort was: " + runTime);
		
	}

}
