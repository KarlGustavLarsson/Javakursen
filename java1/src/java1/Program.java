package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank mybank = new Bank();
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		

		while (true) {
			
			 System.out.print("********************************"       +   "\n");
			 System.out.print("          Banken                "       +   "\n");
			 System.out.print("********************************"       +   "\n");
		     System.out.print("                                "       +   "\n");
		     System.out.print(" Skapa bankkonto                (1)  "  +   "\n");
		     System.out.print(" Lista bankkonton               (2)  "  +   "\n");
		     System.out.print(" Lista saldon p� bankkontona    (3)  "  +   "\n");
		     System.out.print(" Se saldo p� valt bankkonto     (4)  "  +   "\n");
		     System.out.print(" Transaktionshistorik konto     (5)  "  +   "\n");
		     System.out.print(" S�tt in pengar p� ett konto    (6)  "  +   "\n");	
		     System.out.print(" Ta ut penar fr�n ett konto     (7)  "  +   "\n");
		     System.out.print(" Flytta penar mellan tv� konton (8)  "  +   "\n");	
		     System.out.print(" Sp�rra konto fr�n uttag        (9)  "  +   "\n");	    
		     System.out.print(" F�r att avsluta           (exit) "     +   "\n");
		     System.out.print("********************************"       +   "\n");
		     
		     
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
	    		    	mybank.addAccount("Kalle Karlsson"); 
	    		    	break;
	    		    case "2":
	    		    	break;
	    		    case "3":
	    	
	    		    	break;
	    		    case "4": 
	    		   
	    		    	break;
	    		    case "5": 
	    	
	    		    	break;
	    		    case "6": 
	    		
	    		    	break;	
	    		    case "7": 	
	    		    	
	    		    	break;		
	    		    case "8": 	
	    		    	
	    		    	break;	
	    		    case "9": 	
	    		    	
	    		    	break;		
	    		 
	    		    default:
	    		    	break;
	    		    	
	    		 }
	    		 
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    	 } /* inre while */
		}    /* yttre while */
		
		
		

	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

}
