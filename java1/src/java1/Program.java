package java1;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program {
	
	static int[] arr = new int[]{1,2,3,4,5,5,6,6};
	

	public static void main(String[] args) {
		
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		while (true) {
			 System.out.print("********************************"      +   "\n");
			 System.out.print("            COLLECTIONS         "      +   "\n");
			 System.out.print("********************************"      +   "\n");
		     System.out.print("                                "      +   "\n");
		     System.out.print(" Plocka ut dubletter Array     (1)  "  +   "\n");
		     System.out.print(" Plocka ut dubletter Set       (2)  "  +   "\n");
		     System.out.print(" L�gg till v�rde i arrayslut   (3)  "  +   "\n");
		     System.out.print(" Ta bort f�rsta v�rdet i array (4)  "  +   "\n");
		     System.out.print(" Skapa Map med nycklar         (5)  "  +   "\n");	     
		     System.out.print(" F�r att avsluta           (exit) "    +   "\n");
		     System.out.print("********************************"      +   "\n");
		     
		     String val = "";
		     
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
			    		myArrHandling.createMapWithKeys(arr);
					   break; 
					 default:
					    System.out.println("Felaktikt v�rde i switch");
					  break;
		    	 }
		    	     break;
		     }  // while 
		     
		
		} // while 

	}

}
