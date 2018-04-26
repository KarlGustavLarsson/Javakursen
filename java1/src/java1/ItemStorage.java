package java1;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemStorage extends Storage<Item> {


	public void addItem(Item item) {
		
	}
	
    public void crateItem(int artnr, double price, String description) throws IOException {
    	

    	  Item myItem = new Item(artnr, price,description);
    	 
    	   
    	  this.mylist.add(myItem);  
    	 
	}
	
    public  Item  serchArticle(int input, String myInput) {  
 	   
 	   //this.mylist.stream().filter(item -> item.getArtnumber() == input)
    	System.out.println(input);
 		for (int i = 0; i < this.mylist.size(); i++) { 
 			
 			Item myItem = this.mylist.get(i);
 			if ( myItem.getArtnumber() == input || myItem.getDecription().contains(myInput)) {
 				
 				 return myItem;
 			} 
 					
 		}
            
 	    return null;
    }
    
    public  void  showStorage(String myInput) {  
   	     if (myInput.isEmpty()) {
		   	 for (int i = 0; i < this.mylist.size(); i++) { 
		   			
		   			Item myItem = this.mylist.get(i);
		   			System.out.println(myItem.toString());
		   			
		   	 }
   	     } 
   	    	
    }

}
