package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
	
		
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		// ArrayHandling myArrHandling = new  ArrayHandling();
		ItemStorage  itemStorage = new ItemStorage();
        ShoppingCart shoppingCart= new ShoppingCart();
        Item myItem;
        int artNum;
        double price;
	//	 Item myItem = new Item(1,  2,"hej" );
		
	//	itemStorage.addToList(myItem);
		while (true) {
			
			 System.out.print("********************************"      +   "\n");
			 System.out.print("           AFF�R                "      +   "\n");
			 System.out.print("********************************"      +   "\n");
		     System.out.print("                                "      +   "\n");
		     System.out.print(" Fyll p� lagret                (1)  "  +   "\n");
		     System.out.print(" L�gg till i kundkorg          (2)  "  +   "\n");
		     System.out.print(" Ta bort fr�n kundkorg         (3)  "  +   "\n");
		     System.out.print(" Granska kundkorg              (4)  "  +   "\n");
		     System.out.print(" S�k vara i lager              (5)  "  +   "\n");
		     System.out.print(" Checka ut kundkorg            (6)  "  +   "\n");	     
		     System.out.print(" F�r att avsluta           (exit) "    +   "\n");
		     System.out.print("********************************"      +   "\n");
		     
		     
		     /* Initiate different variables */
		     
		     String val = "";  
		   
		     
		     
	    	 
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
	    		    	 System.out.println("Mata in Artikelnr, Pris, Beskrivning f�r en vara: ");
	    		    	 try {
	    		    	 artNum              = Integer.parseInt(input.readLine());                   
	    		    	 price               = Double.parseDouble(input.readLine());
	    		    	 String description  = input.readLine();
	    		    	 itemStorage.crateItem(artNum, price, description);
	    		    	 } catch(NumberFormatException e) {
	    		    		 System.out.println("Du kan endast ange siffror f�r Arikelnr och Pris");
			    		     continue;
	    		    	 }
	    		    	break;
	    		    case "2":
	    		    	System.out.println("Mata in Artikelnr f�r vald vara: ");
	    		    	try {
		    		    	artNum = Integer.parseInt(input.readLine());
		    		    
		    		    	Item myShoppItem = itemStorage.serchArticle(artNum);
		    		    	if (myShoppItem!=null) {
		    		    		shoppingCart.addToList(myShoppItem);
		    		    		itemStorage.removefromList(myShoppItem);
		    		    		//System.out.println(shoppingCart.toString());
		    		    	} else {
		    		    		System.out.println("Varan saknas ");
		    		    	}
		    		    } catch(NumberFormatException e) {
		    		    	System.out.println("Du kan endast ange siffror f�r Arikelnr");
		    		    	continue;
		    		    	
		    		    }
	    		    	break;
	    		    case "3":
	    		    	 System.out.println("Ta bort vara, mata in Artikelnr:  ");
	    		    	 try {
			    		    	
		    		    	 artNum = Integer.parseInt(input.readLine());
		    		    	 myItem = shoppingCart.serchArticle(artNum);
		    		    	 if (myItem!=null) {
		    		    		shoppingCart.removefromList(myItem);
		    		    		itemStorage.addToList(myItem);
		    		    	 } else {
		    		    		System.out.println("Varan bortagen fr�n kundkorg");
		    		    	 }
		    		    	
	    		    		 
	    		    	 } catch(NumberFormatException e) {
	    		    		 System.out.println("Du kan endast ange siffror f�r Arikelnr");
			    		     continue;
	    		    	 }
	    		    	break;
	    		    case "4": 
	    		    	shoppingCart.showShoppingBasket();
	    		    	break;
	    		    case "5": 
	    		    	System.out.println("Mata in Artikelnr f�r varan du s�ker: ");
	    		    	try {  
		    		    	artNum = Integer.parseInt(input.readLine());
		    		    	myItem = itemStorage.serchArticle(artNum);
		    		    	if (myItem!=null) {
		    		    		System.out.println(myItem.toString());
		    		    	} else {
		    		    		System.out.println("Varan saknas ");
		    		    	}
		    		    	
	    		    	}	catch(NumberFormatException e) {
	    		    		System.out.println("Du kan endast ange siffror f�r Arikelnr");
			    		    continue;
	    		    	}
	    		    	break;
	    		    case "6": 
	    		    	shoppingCart.checkOutShoppingBasket();
	    		    	break;	
	    		 
	    		    default:
	    		    	break;
	    		    	
	    		 }
	    		 
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    	 }
		}    
	}

}
