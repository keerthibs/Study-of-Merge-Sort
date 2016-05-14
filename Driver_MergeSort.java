
/*
Author : Keerthi Bala Sundram
Program : Driver_MergeSort.java
Description : This is the starter class for Merge Sort. An array of any data type can be populated in 
the main method and can be passed to the Sorting class for obtaining a sorted output.


 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Driver_MergeSort {

	/*
	 * The firstTen method prints the first ten numbers of the passed Generic
	 * Array. This method can be used to test whether I/P is sorted or not. This
	 * method displays only the first 10 elements.
	 */
	public static <T> void firstTen(T[] A) {
		int n = Math.min(A.length, 10);
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	/*
	 * The randomString method accepts the number of digits, i.e the length, and
	 * returns a randomly generated string. This method is to test sorting of
	 * Strings.
	 */
	public static String randomString(int len) {
		String ref = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(ref.charAt(new Random().nextInt(ref.length())));
		return sb.toString();
	}

	/*
	 * Inside main(), declare the type of input you want to Sort. You can also
	 * uncomment some of the input types already defined in the code. Make sure
	 * to comment the declaration that you are not using. The input variable n
	 * can be changed depending on the requirement.
	 */
	public static void main(String[] args) throws IOException {
		int n = 10000000;
		Integer[] A = new Integer[n];
		// Long[] A = new Long[n];
	//	 String [] A=new String[n];

		for (int i = 0; i < n; i++) {
			A[i] = new Integer(n - i);
			// A[i]=randomString(12);
			// A[i]=new Random().nextInt();
			// A[i]= new Random().nextLong();
		}

		//firstTen(A);

		// Calculation of running time in nanoseconds
		long startTime = System.nanoTime();
		Sorting.MergeSort(Arrays.asList(A));
		long endTime = System.nanoTime();
		long duration = endTime - startTime;

		System.out.println("Merge Sort with " + n + " entries, takes " + duration / 1000000000.0 + " secs");
		//firstTen(A);

	}

}