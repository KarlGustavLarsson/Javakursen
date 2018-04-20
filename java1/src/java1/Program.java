package java1;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) throws IOException {
		
		
		List<Integer> convertlst = new ArrayList<Integer>();  // Holds the input integer values in a list
		List<String>  convertlst2 = new ArrayList<String>();  // Holds the input String values in a list
		
		int[] arr;                                           // array of integers to be used in ArrayHandling
		String[] myStringArr;                                // array of Strings to be used in ArrayHandling
		String exit = "";
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		 ArrayHandling myArrHandling = new  ArrayHandling();
		
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
		     
		     
		     /* Initiate different variables */
		     
		     String val = "";     
		     String value="";
		     int valueint=0;
 	    	 int valuelast=0; 
 	    	 int valuefirst=0;  
 	    	 convertlst.clear();
 	    	 convertlst2.clear();
 	    	 
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
		    	    	System.out.println("Mata in ett antal tal med några dubletter avsluta med exit: ");
		    	    	while (!value.equals("exit")) {
		    	    		try {
		    	    	    value  = input.readLine();
		    	    	    valueint = Integer.parseInt(value);
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
		    	    	    convertlst.add(valueint);
		    	    	}
		    	    	arr = myArrHandling.convertListToArray(convertlst);
		    	    	myArrHandling.getDoublesFromArray(arr);
		    	      break;
		    	    case "2":
		    	    	valueint=0;
		    	    	System.out.println("Mata in ett antal tal med några dubletter avsluta med exit: ");
		    	    	while (!value.equals("exit")) {
		    	    		
		    	    		try {
		    	    	    value  = input.readLine();
		    	    	    valueint = Integer.parseInt(value);
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
		    	    	    convertlst.add(valueint);
		    	    	}
		    	    	arr = myArrHandling.convertListToArray(convertlst);
		    	    	myArrHandling.getDoublesUseSet(arr);
			    	   break;
		    	    case "3":
		    	    	valueint=0;
		    	    	valuelast=0;
		    	    	System.out.println("Mata in ett antal tal avsluta med exit: ");
	    	    		while (!value.equals("exit")) {
		    	    		try {
		    	    	       value  = input.readLine();
		    	    	       valueint = Integer.parseInt(value);  
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
		    	    	    convertlst.add(valueint);
		    	    	}
	    	    		value = "";
	    	    		System.out.println("Mata in sista talet avsluta med exit: ");
				    	while (!value.equals("exit")) {
		    	    		try {
		    	    	    value  = input.readLine();
		    	    	    valuelast = Integer.parseInt(value);
		    	    	    
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
			    	    }
		    	    	arr = myArrHandling.convertListToArray(convertlst);
		    	    	myArrHandling.addValueToTheEnd(arr,valuelast);
			    	   break;
			    	case "4":
			    		valueint=0;
		    	    	valuefirst=0;
		    	    	System.out.println("Mata in ett antal tal avsluta med exit: ");
	    	    		while (!value.equals("exit")) {
		    	    		try {
		    	    	       value  = input.readLine();
		    	    	       valueint = Integer.parseInt(value);  
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
		    	    	    convertlst.add(valueint);
		    	    	}
	    	    		value = "";
	    	    		System.out.println("Vilket tal vill ta bort av de inmatade ? avsluta med exit: ");
				    	while (!value.equals("exit")) {
		    	    		try {
		    	    	    value  = input.readLine();
		    	    	    valuefirst = Integer.parseInt(value);
		    	    	    
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
			    	    }
				    	
				    	arr = myArrHandling.convertListToArray(convertlst);
			    	   	myArrHandling.removeValueFromBegin(arr,  valuefirst);
			    	   break;
				      
			    	case "5":
			    		valueint=0;
		    	    	valuefirst=0;
		    	    	System.out.println("Mata in ett antal nycklar: ");
	    	    		while (!value.equals("exit")) {
		    	    		try {
		    	    	       value  = input.readLine();
		    	    	       valueint = Integer.parseInt(value);  
		    	    		} catch (NumberFormatException e) {
		    	    			if (value.equals("exit")) {
		    	    				break;
		    	    			}
		    	    		}
		    	    	    convertlst.add(valueint);
		    	    	}
	    	    		valueint=0;
	    	    		value = "";
		    	    	System.out.println("Mata in ett antal värden : ");
	    	    		while (!value.equals("exit")) {
	    	  
	    	    	       value  = input.readLine();
	    	    			if (value.equals("exit")) {
	    	    				break;
	    	    			}
		    	    	    convertlst2.add(value);
		    	    	}
	    	    		
	    	    	
	    	    		arr = myArrHandling.convertListToArray(convertlst);
	    	    		myStringArr = convertlst2.toArray(new String[convertlst2.size()]);
				    	
			    	    myArrHandling.createMapWithKeys(arr, myStringArr);
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
