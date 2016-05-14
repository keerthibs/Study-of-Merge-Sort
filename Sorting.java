
/*
Author : Keerthi Bala Sundram
Program : Sorting.java
Description : This class has two methods. MergeSort - for splitting the arrays, and Merge - for sorting and 
merging the arrays. This class is of generic type.
Input : An unsorted List of Generic Type
Output : Sorted list  

 */

import java.util.ArrayList;
import java.util.List;

public class Sorting {

	public static <T extends Comparable<? super T>> List<T> MergeSort(List<T> input) {
		int size = input.size();
		if (size > 1) {
			int midpoint = size >>> 1;

			List<T> left = new ArrayList<T>();
			List<T> right = new ArrayList<T>();

			for (int i = 0; i < midpoint; i++) {
				left.add(input.get(i));
			}

			for (int j = 0; j < input.size() - midpoint; j++) {
				right.add(input.get((int) (j + midpoint)));
			}

			MergeSort(left);
			MergeSort(right);
			Merge(input, left, right);
		}
		return input;

	}

	public static <T extends Comparable<? super T>> void Merge(List<T> output, List<T> left, List<T> right) {
		int i = 0, j = 0;

		for (int m = 0; m < output.size(); m++) {

			if (j >= right.size() || (i < left.size() && left.get(i).compareTo(right.get(j))< 0)) {
				output.set(m, left.get(i));
				i++;
			} else {
				output.set(m, right.get(j));
				j++;
			}
		}

	}

}
