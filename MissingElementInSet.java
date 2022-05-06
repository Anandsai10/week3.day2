package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MissingElementInSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		set.addAll(Arrays.asList(1,2,3,4,7,6,8)); //insert values
		

		int size = set.size(); //get size
		
		Integer[] newvalue = set.toArray(new Integer[set.size()]);
		
	
			for(int i = 0 ; i <= size-1 ; i++)
			{
				if (i != newvalue[i] )
				{
					System.out.println("i value is : " +i);
					System.out.println("set value is :" + newvalue[i]);
				
				}
			}
			
		}
	
	}

