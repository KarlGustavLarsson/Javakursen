package java1;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemStorage extends Storage<Item> {


	public void addItem(Item item) {
		
	}
	
    public Item  crateItem(BufferedReader input) throws IOException {
    	
    	String artnr="";
    	System.out.println("Mata in Artikelnr, Pris, Beskrivning, lagersaldo avlsuta med exit ");
    	while (!artnr.equals("exit")) {
    	
    	  artnr              = input.readLine();
    	  int convartnr      = Integer.parseInt(artnr);                    
    	  String price       = input.readLine();
    	  double convprice   = Double.parseDouble(price);
    	  String description = input.readLine();
    	  //String balance     = input.readLine();
    	  //int convbalance    = Integer.parseInt(balance);
    	 
    	  
    	  Item myItem = new Item(convartnr, convprice,description);
    	
    	
    	  return myItem;
    	  
    	}
    	
    	return null;
    	   
	}
	
	

}
