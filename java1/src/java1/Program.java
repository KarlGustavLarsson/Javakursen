package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int account=0; 
		int account2=0; 
		double value=0; 
		boolean good = false;
		Bank mybank = new Bank();
		
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
		
		

		while (true) {
			
			 System.out.print("********************************"       +   "\n");
			 System.out.print("          Banken                "       +   "\n");
			 System.out.print("********************************"       +   "\n");
		     System.out.print("                                "       +   "\n");
		     System.out.print(" Skapa bankkonto                (1)  "  +   "\n");
		     System.out.print(" Lista bankkonton               (2)  "  +   "\n");
		     System.out.print(" Lista saldon på bankkontona    (3)  "  +   "\n");
		     System.out.print(" Se saldo på valt bankkonto     (4)  "  +   "\n");
		     System.out.print(" Transaktionshistorik konto     (5)  "  +   "\n");
		     System.out.print(" Sätt in pengar på ett konto    (6)  "  +   "\n");	
		     System.out.print(" Ta ut penar från ett konto     (7)  "  +   "\n");
		     System.out.print(" Flytta penar mellan två konton (8)  "  +   "\n");	
		     System.out.print(" Spärra konto från uttag        (9)  "  +   "\n");	    
		     System.out.print(" För att avsluta           (exit) "     +   "\n");
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
	    		 
	    		 
	    		 Account  myaccount;
	    		 switch (val) {  
	    		    case "1":
	    		    	mybank.addAccount("Kalle Karlsson"); 
	    		    	break;
	    		    case "2":
	    		    	mybank.showAllAcconts(mybank.bankaccounts);
	    		    	break;
	    		    case "3":
	    		    	mybank.showAllAccontSaldo(mybank.bankaccounts);
	    		    	break;
	    		    case "4": 
	    		    	System.out.println("Vilket konto vill du välja: ");
						try {
							account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						}
	    		    	myaccount = mybank.findAccount(account);
	    		    	if (myaccount != null) {  
	    		    	   mybank.showAccountSaldo(myaccount);
	    		    	} else { 
	    		    		System.out.println("Kontnr " + account + " saknas ! ");
	    		    	}
	    		    	break;
	    		    case "5": 
	    		    	System.out.println("Vilket konto vill du se transaktionshistorik för ?: ");
	    		    	try {
							account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	myaccount = mybank.findAccount(account);
	    		    	if (myaccount != null ) {
	    		    	   myaccount.printTransHistory(myaccount.history);
	    		        } else { 
	    		        	System.out.println("Kontnr " + account + " saknas ! ");
	    		        }
	    		    	break;
	    		    case "6": 
	    		    	System.out.println("Vilket konto vill du sätta in pengar till: ");
						try {
							account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	System.out.println("Hur mycket pengar vill du sätta in ?: ");
	    		    	try {
	    		    		value = Double.parseDouble(input.readLine());
	    		    		if (!checkAmount(value)) {  
		    		    		System.out.println("Belopp måste vara större än 0");
		    		    		break;
		    		    	}
	    		   
						} catch (NumberFormatException e) {
							System.out.println("Belopp måste anges med siffror");
							continue;
						
						}
	    		    	myaccount = mybank.findAccount(account);
	    		    	if (myaccount != null ) {
	    		    	   myaccount.addMoneyToAccount(value, myaccount);
	    		    	} else { 
	    		    		System.out.println("Kontnr " + account + " saknas ! ");
	    		    	}
	    		    	break;	
	    		    case "7": 
	    		    	System.out.println("Vilket konto vill du ta ut pengar ifrån ?: ");
	    		    	try {
							account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	System.out.println("Hur mycket pengar vill du ta ut ?: ");
	    		    	try {
	    		    		value = Double.parseDouble(input.readLine());
	    		    		if (!checkAmount(value)) {  
		    		    		System.out.println("Belopp måste vara större än 0");
		    		    		break;
		    		    	}
						} catch (NumberFormatException e) {
							System.out.println("Belopp måste anges med siffror");
							continue;
						
						}
	    		    
	    		    	myaccount = mybank.findAccount(account);
	    		    	if (myaccount != null ) {
	    		    	   myaccount.removeMoneyFromAccount(value, myaccount);
	    		    	} else { 
	    		    		System.out.println("Kontnr " + account + " saknas !");
	    		    	}
	    		    	break;		
	    		    case "8": 	
	    		    	System.out.println("Vilket konto vill du flytta pengar ifrån ?: ");
	    		    	try {
							account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	System.out.println("Vilket konto vill du flytta pengar till ?: ");
	    		    	try {
	    		    		account2 = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	System.out.println("Hur mycket pengar vill flytta ?: ");
	    		    	try {
	    		    		value = Double.parseDouble(input.readLine());
	    		    		if (!checkAmount(value)) {  
		    		    		System.out.println("Belopp måste vara större än 0");
		    		    		break;
		    		    	}
						} catch (NumberFormatException e) {
							System.out.println("Belopp måste anges med siffror");
							continue;
						
						}
	    		    	
	    		    	Account  myaccount1;
	    		    	Account  myaccount2;
	    		    	myaccount1 = mybank.findAccount(account);
	    		    	myaccount2 = mybank.findAccount(account2);
	    		    	if ( myaccount1 != null && myaccount2 != null) {
	    		    	    mybank.moveMoneyBetweenAccounts(myaccount1,myaccount2 ,value);
	    		    	} else if (myaccount1 == null )   {  
	    		    		System.out.println("Kontnr " + account + " saknas !");
	    		    	} else if (myaccount2 == null ) { 
	    		    		System.out.println("Kontnr " + account2 + " saknas !");
	    		    	}
	    		    	break;	
	    		    case "9": 	
	    		    	System.out.println("Vilket konto vill du spårra för uttag ?: ");
	    		    	try {
	    		    		account = Integer.parseInt(input.readLine());
						} catch (NumberFormatException e) {
							System.out.println("Kontnr måste anges med siffror ");
							continue;
						
						}
	    		    	myaccount = mybank.findAccount(account);
	    		      	if (myaccount != null ) {
	    		    	   myaccount.lockAccont(true, myaccount);
	    		      	} else { 
	    		      	   System.out.println("Kontnr " + account + " saknas !");
	    		      	}
	    		    	break;		
	    		 
	    		    default:
	    		    	break;
	    		    	
	    		 }
	    		 
	    		 break;
	    		 
	    		 
	    		 
	    		 
	    	 } /* inre while */
		}    /* yttre while */
		
		
		

	}

	public static boolean checkAmount(double amount) {
		
		if (amount <= 0 ) {
			return false;
		} else return true;
		
	}

}
