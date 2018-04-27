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
        Item myItem=null;
        boolean artexist = false;
        Item myShoppItem=null;
        int artNum=0;
        double price;
        String myInput="";
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
		     System.out.print(" Sök vara i lager              (5)  "  +   "\n");
		     System.out.print(" Checka ut kundkorg            (6)  "  +   "\n");	     
		     System.out.print(" För att avsluta           (exit) "    +   "\n");
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
	    		    	 System.out.println("Mata in Artikelnr, Pris, Beskrivning för en vara: ");
	    		    	 try {
	    		    	 artNum              = Integer.parseInt(input.readLine());                   
	    		    	 price               = Double.parseDouble(input.readLine());
	    		    	 String description  = input.readLine();
	    		    	 itemStorage.crateItem(artNum, price, description);
	    		    	 } catch(NumberFormatException e) {
	    		    		 System.out.println("Du kan endast ange siffror för Arikelnr och Pris");
			    		     continue;
	    		    	 }
	    		    	break;
	    		    case "2":
	    		    
	    		    	System.out.println("Mata in Artikelnr eller sök med fritext för att visa lager tryck Enter : ");
	    		    	try {
	    		    		myInput = input.readLine();
	    		    		if (myInput.isEmpty()) {
	    		    			itemStorage.showStorage(myInput);
	    		    		}
		    		    	artNum = Integer.parseInt(myInput);
	    		        } catch(NumberFormatException e) {
	    		        	 myShoppItem = itemStorage.moveArticleToBaket(artNum, myInput);
		    		    }
	    		    	myShoppItem = itemStorage.moveArticleToBaket(artNum, myInput);
	    		    	if (myShoppItem!=null) {
	    		    		shoppingCart.addToList(myShoppItem);
	    		    		itemStorage.removefromList(myShoppItem);
	    		    		//System.out.println(shoppingCart.toString());
	    		    	} else {
	    		    		System.out.println("Varan saknas ");
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
		    		    		System.out.println("Varan saknades i kundkorgen");
		    		    	 }
		    		    	
	    		    		 
	    		    	 } catch(NumberFormatException e) {
	    		    		 System.out.println("Du kan endast ange siffror för Arikelnr");
			    		     continue;
	    		    	 }
	    		    	break;
	    		    case "4": 
	    		    	shoppingCart.showShoppingBasket();
	    		    	break;
	    		    case "5": 
	    		    	String myString="";
	    		    	String myNum="";
	    		    	System.out.println("Mata in Artikelnr eller sök med fritext efter varor i lager: ");
	    		        myString = input.readLine();
		    		    myNum    = myString;
	    		    	artexist = itemStorage.serchArticle(myNum, myString);
	    		    	if (artexist==false) {
	    		    		System.out.println("Varan saknas i lager ");
	    		    	} 
	    		    	break;
	    		    case "6": 
	    		    	shoppingCart.checkOutShoppingBasket();
	    		    	shoppingCart.mylist.clear();
	    		    	break;	
	    		 
	    		    default:
	    		    	break;
	    		    	
	    		 }
	    		 
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    	 }
		}    
	}

}
