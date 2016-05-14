/*
Author : Keerthi Bala Sundram
Program : PriorityQueue1.java
Description : This class has a method PQueue, that accepts a List of a Generic Type. 
The List is passed to the constructor of a Priority Queue to initialise it. The elements are removed
from the head of the queue using the poll() method, which performs the sorting, and stores the elements 
in a temporary List. 
Input : An unsorted List of Generic Type
Output : Sorted list  

 */

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static <T> List<T> PQueue(List<T> array) {

		PriorityQueue<T> pq = new PriorityQueue<T>(array);

		int i = 0;
		while (!pq.isEmpty()) {
			array.set(i, pq.poll());
			i++;
		}
		return array;
	}

}
