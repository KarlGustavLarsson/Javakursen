package java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class ArrayHandling<integer, index, animal> {
	
	
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
	
	public void addValueToTheEnd(int[] arr, int valuelast) {
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) { 
			lst.add(arr[i]);
		}
		
		System.out.println("Input");
		System.out.println(lst.toString());
		System.out.println("Output after append to end");
		lst.add(valuelast);
		System.out.println(lst.toString());
		
	}
	
	public void removeValueFromBegin(int[] arr, int valuefirst) {
		int n = arr.length-1;
		int[] nyarr = new int[n]; 
		Boolean first = false; 
		for (int i = 1; i < arr.length; i++) { 
			
			if (arr[i] == valuefirst && first==false) {
				first = true;
				
			} else {
				nyarr[i-1] = arr[i];
			}
		}

		System.out.println("Input");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output remove first element");
		System.out.println(Arrays.toString(nyarr));
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
	
	
	public void createMapWithKeys(int[] index, String[] animal) {
		
		
		Map <Integer, String> numAnimal = new LinkedHashMap<>();
		
		for (int i = 0; i < animal.length; i++) { 
			numAnimal.put(index[i], animal[i]);
		}
		
	     
		System.out.println("Input");
		System.out.println(Arrays.toString(index));
		System.out.println(Arrays.toString(animal));
		System.out.println("Output");
		numAnimal.forEach((key,value) -> System.out.println(key+":"+value));
		
	}
	
	public int[] convertListToArray(List<Integer> convertlst) {
		
		 int[] array = new int[convertlst.size()];
		 
		 for (int i = 0; i < convertlst.size(); i++) { 
			 array[i] = convertlst.get(i);
		 }
    	
		 return array ;
	}
	
	         

}
