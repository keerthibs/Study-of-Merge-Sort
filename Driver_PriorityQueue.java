
/*
Author : Keerthi Bala Sundram
Program : Driver_MergeSort.java
Description : This is the starter class for Priority Queue. An array of any data type can be populated in 
the main method and can be passed to the PriorityQueue1 for obtaining a sorted output.


 */
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Driver_PriorityQueue {

	/*
	 * Inside main(), declare the type of input you want to Sort. You can also
	 * uncomment some of the input types already defined in the code. Make sure
	 * to comment the declaration that you are not using. The input variable n
	 * can be changed depending on the requirement.
	 */
	public static void main(String[] args) throws IOException {
		int n = 10000000;
		// String [] A=new String[n];
		Integer[] A = new Integer[n];
		// Long[] A=new Long[n];

		for (int i = 0; i < n; i++) {
			A[i] = new Integer(n - i);
			// A[i] = new Random().nextInt();
			// A[i]=new Random().nextLong();
			// A[i]=Driver_MergeSort.randomString(12);
		}

		Driver_MergeSort.firstTen(A);

		// Calculation of running time in nanoseconds
		long startTime = System.nanoTime();
		List output = PriorityQueue1.PQueue(Arrays.asList(A));
		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		System.out.println("Priority Queue poll with " + n + " entries, takes " + duration / 1000000000.0 + " secs");
		Driver_MergeSort.firstTen(A);

	}

}