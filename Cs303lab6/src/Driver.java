import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Driver {
	private static long startTime = System.currentTimeMillis();
	public static void main (String[] args) {
			int[]arr = new int[16];
			int low = 0;
			int high = arr.length-1;
			int maxval = 0;
			int minval = 0;

			try {
				Scanner scan = new Scanner( new File("input_16.txt"));
				int n = 0;
				while(scan.hasNext()){
					arr[n++] = scan.nextInt();
				}		
				scan.close();
				
				ArraySort.sort(arr, low, high, minval, maxval);
				System.out.println ( Arrays.toString(arr));
				
				System.out.println("your small value is:" + arr[low]);
				System.out.println("your largest value is:" + arr[high]);
				
				long endTime = System.currentTimeMillis();
			
				System.out.println("it took " + (endTime - startTime) + " milliseconds");
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}	
		}
}
