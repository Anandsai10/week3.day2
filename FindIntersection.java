package week3.day2.assignments;

import java.util.Arrays;
import java.util.TreeSet;


public class FindIntersection {
	
	
	public static void main(String[] args) {
		

		// create first set
		TreeSet<Integer> set = new TreeSet<Integer>();

		// adding values to first setS
		set.addAll(Arrays.asList(3, 2, 11, 4, 6, 7));

		// create second set
		TreeSet<Integer> set1 = new TreeSet<Integer>();

		// adding values to second set
		set1.addAll(Arrays.asList(1, 2, 8, 4, 9, 7));
		
		for (Integer eachset :set) {  //for each loop
			
			for (Integer secondset : set1)  // to compare the first with second so again loop
			{
				if(eachset == secondset) {  //comparing 
					
					System.out.println(eachset );
				}
			}
		}
	
	}

}
