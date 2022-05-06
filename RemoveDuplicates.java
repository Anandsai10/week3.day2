package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	
	 public static void main(String[] args) {
		
	
//	 * a) Use the declared String text as input

	String text1 = "We learn java basics as part of java sessions in java week1";
	String text2 ="";

	String[] split = text1.split(" ");
	
	LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(split));
	
	for (String Word : set) {

		text2 = text2 + Word + " ";
	}
	
	System.out.println(text2);

	 
	 }
}
