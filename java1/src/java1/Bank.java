package java1;

import java.util.ArrayList;

public class Bank {
	
	public ArrayList<Account> bankaccounts = new ArrayList<Account>();
	
	public int accountno=999;

	public double accountSaldo(int accountnumber) {
		   double saldo=0;
		    return saldo;
	}
	

	public boolean addAccount(String name) {
		
	    accountno = accountno + 1;
		Account account = new Account();
		account.setCustomerName(name);
		account.setLock(false);
		account.setBalance(0);
		account.setAccountNo(accountno);
		
		bankaccounts.add(account);
        return true;
        
	}

	public Account findAccount(int accountnr) {
		 
		 for (Account myaccount : bankaccounts) { 	
		   if (myaccount.getAccountNo() == accountnr ) {
			   return  myaccount;
		   }
		  
		 }
		 return null;
	}

	public void showAccountSaldo(Account myaccount) {
		
		System.out.println("Saldot är " + myaccount.getBalance());
	}

	public void moveMoneyBetweenAccounts(Account fromacccount, Account toaccount, double amount) {
		    if (fromacccount.getBalance() >= amount) {  
		    	fromacccount.removeMoneyFromAccount(amount,fromacccount);
		    	toaccount.addMoneyToAccount(amount, toaccount);
		    } else { 
		        System.out.println("Otillräckligt med pengar på kontot " + fromacccount.getAccountNo()) ;	
		    	
		    }
		    
	}

	public void showAllAccontSaldo(ArrayList<Account> bankaccounts) {
		
		for (Account myaccount : bankaccounts) { 
			
			 System.out.println("Kontonr: " + myaccount.getAccountNo() + " Saldo: " + myaccount.getBalance()) ;	
			
		}
	}
	
    public void showAllAcconts(ArrayList<Account> bankaccounts) {
		
		for (Account myaccount : bankaccounts) { 
			
			 System.out.println("Kontonr: " + myaccount.getAccountNo());	
			
		}
	}
		 
		 
}
