package java1;

import java.io.BufferedReader;

public class ShoppingCart  extends  Storage<Item>  {
	
	
   public  Item  serchArticle(int input) {  
	   
	   for (int i = 0; i < this.mylist.size(); i++) { 
 			
 			Item myItem = this.mylist.get(i);
 			if ( myItem.getArtnumber() == input) {
 				
 				 return myItem;
 			}
 		}
            
 	    return null;
       
   }
   
   public  void  checkOutShoppingBasket() { 
	   
	   double sum = 0;
	   System.out.println("**********KVITTO***********");
	   for (int i = 0; i < this.mylist.size(); i++) { 
		   
			
			Item myItem = this.mylist.get(i);
			sum += myItem.getPrice();
			System.out.println(myItem.toString());
		}
	        System.out.println("Summa: " + sum);
		
	   
   }

   public  void  showShoppingBasket() {  
	 
	 for (int i = 0; i < this.mylist.size(); i++) { 
			
			Item myItem = this.mylist.get(i);
			System.out.println(myItem.toString());
			
	 }
	   
   }

}
