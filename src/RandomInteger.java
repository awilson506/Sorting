import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class RandomInteger {

	public static void createFile() {
		try{
			
			PrintWriter writer = new PrintWriter("random-ints.txt", "UTF-8");
			int num;
		    int[] dist = new int[10]; 

		    for (int x = 0; x < 10000; x++) {
		      num = (int) (Math.floor(Math.random() * 10));
		      dist[num]++;
		      writer.println(num);
		    }
			
		}catch(Exception e){
			
		}
	}
}
