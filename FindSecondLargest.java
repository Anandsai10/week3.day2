package week3.day2.assignments;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.addAll(Arrays.asList(3, 2, 11, 4, 6, 7)); //insert values
		
		int size = set.size(); //get size
		
		Integer[] newvalue = set.toArray(new Integer[set.size()]);  //set values to array to get the index value
		
		System.out.println("Second Largest value is: "+newvalue[size-2]); //printing the output
		
	}
	

}
