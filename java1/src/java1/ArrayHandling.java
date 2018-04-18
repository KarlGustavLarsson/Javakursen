package java1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayHandling {
	
	
	public void getDoublesFromArray(int[] arr) {
		
		System.out.println("Input");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output doubles");
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1 ; j < arr.length; j++) {
				 if (arr[i]==arr[j]) {   // got the duplicate element 
					 
					 System.out.println(arr[i]);
				 }
			}  
		}
	}
	
	public void addValueToTheEnd(int[] arr) {
		System.out.println("ADD");
		
	}
	
	public void removeValueFromBegin(int[] arr) {
		
		System.out.println("REMOVE");
		
	}
	
	
	public void getDoublesUseSet(int[] arr) {
		
		Set<Integer>  mySet = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) { 
		   mySet.add(arr[i]);
		   
		}
		System.out.println("Input");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output");
		System.out.println(mySet);
	}
	
	
	public void createMapWithKeys(int[] arr) {
		
		System.out.println("MAP");
		
	}


}
