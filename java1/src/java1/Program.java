package java1;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Program {
	
	static int[] arr = new int[]{1,2,3,4,5,5,6,6};
	static String[] myStringArr = new String[]{"katt","hund","björn","älg","fågel","fisk","apa","ren"};
	static int[] myIntArr = new int[]{1,2,3,4,5,6,7,8};
	

	public static void main(String[] args) throws IOException {
		
		
		List<Integer> convertlst = new ArrayList<Integer>();
		int[] arr = new int[];
		
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		while (true) {
			 System.out.print("********************************"      +   "\n");
			 System.out.print("            COLLECTIONS         "      +   "\n");
			 System.out.print("********************************"      +   "\n");
		     System.out.print("                                "      +   "\n");
		     System.out.print(" Plocka ut dubletter Array     (1)  "  +   "\n");
		     System.out.print(" Plocka ut dubletter Set       (2)  "  +   "\n");
		     System.out.print(" Lägg till värde i arrayslut   (3)  "  +   "\n");
		     System.out.print(" Ta bort första värdet i array (4)  "  +   "\n");
		     System.out.print(" Skapa Map med nycklar         (5)  "  +   "\n");	     
		     System.out.print(" För att avsluta           (exit) "    +   "\n");
		     System.out.print("********************************"      +   "\n");
		     
		     String val = "";
		     String value="";
		     
		     ArrayHandling myArrHandling = new  ArrayHandling();
		     
		     try {
		    	 
		        val = input.readLine();
		    	 
		     } catch  (IOException e) {
		    	 
		     }
		     
		     if (val.equals("exit")) {
		    	 break;
		     }
		     
		     while (true) {
		    	 
		    	 switch (val) {  
		    	    case "1":
		    	    	myArrHandling.getDoublesFromArray(arr);
		    	    	
		    	    	while (value != null) {
		    	    	       value  = input.readLine();
		    	    	       int valueint = Integer.parseInt(value);
		    	    	       convertlst.add(valueint);
		    	    	}
		    	    	Integer[] arrs = new Integer[convertlst.size()];
		    	    	convertlst.toArray(arrs);
		    	    
		    	    	
		    	      break;
		    	    case "2":
		    	    	myArrHandling.getDoublesUseSet(arr);
			    	   break;
		    	    case "3":
		    	    	myArrHandling.addValueToTheEnd(arr);
			    	   break;
			    	case "4":
			    	   	myArrHandling.removeValueFromBegin(arr);
				      break;  
			    	case "5":
			    		myArrHandling.createMapWithKeys(myIntArr, myStringArr);
					   break; 
					 default:
					    System.out.println("Felaktikt värde i switch");
					  break;
		    	 }
		    	     break;
		     }  // while 
		     
		
		} // while 

	}

}
