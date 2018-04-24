package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
	
		
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		// ArrayHandling myArrHandling = new  ArrayHandling();
		ItemStorage itemStorage = new ItemStorage();
        ShoppingCart ShoppingCart= new ShoppingCart();
          Item myItem;
	//	 Item myItem = new Item(1,  2,"hej" );
		
	//	itemStorage.addToList(myItem);
		while (true) {
			 System.out.print("********************************"      +   "\n");
			 System.out.print("           AFFÄR                "      +   "\n");
			 System.out.print("********************************"      +   "\n");
		     System.out.print("                                "      +   "\n");
		     System.out.print(" Fyll på lagret                (1)  "  +   "\n");
		     System.out.print(" Lägg till i kundkorg          (2)  "  +   "\n");
		     System.out.print(" Ta bort från kundkorg         (3)  "  +   "\n");
		     System.out.print(" Granska kundkorg              (4)  "  +   "\n");
		     System.out.print(" Sök vara                      (5)  "  +   "\n");
		     System.out.print(" Checka ut kundkorg            (6)  "  +   "\n");	     
		     System.out.print(" För att avsluta           (exit) "    +   "\n");
		     System.out.print("********************************"      +   "\n");
		     
		     
		     /* Initiate different variables */
		     
		     String val = "";     
		     String value="";
		     int valueint=0;
	    	 int valuelast=0; 
	    	 int valuefirst=0;  
	    	 
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
	    		    	 myItem = itemStorage.crateItem(input);
	    		    	if (myItem!=null) {
	    		    	   itemStorage.addToList(myItem);
	    		    	}
	    		    	break;
	    		    case "2":
	    		    	
	    		    	Item myShoppItem = ShoppingCart.serchArticle();
	    		    	if (myShoppItem!=null) {
	    		    		ShoppingCart.addToList(myShoppItem);
	    		    		itemStorage.removefromList(myShoppItem);
	    		    	}
	    		    	
	    		    	break;
	    		    case "3":
	    		    	
	    		    	break;
	    		    case "4": 
	    		    	
	    		    	break;
	    		    case "5": 
	    		    	
	    		    	break;
	    		    case "6": 
	    		    	
	    		    	break;	
	    		 
	    		    default:
	    		    	break;
	    		    	
	    		 }
	    		 
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    	 }
		}    
	}

}
