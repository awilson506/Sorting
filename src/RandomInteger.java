import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public final class RandomInteger {

	public static void createFile() {
		try{
			PrintStream writer = new PrintStream(
					new FileOutputStream("random-ints.txt"));
			System.setOut(writer);
			ArrayList<Integer> integers = new ArrayList<Integer>();
		    for (Integer i = 0; i < 10000; i++) {
		        integers.add(i);
		    }
		    Collections.shuffle(integers);
		    for (Object token : integers) {
		    	System.out.println(token);
		    }
		    
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
