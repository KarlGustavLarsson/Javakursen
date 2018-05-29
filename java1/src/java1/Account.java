package java1;

import java.util.ArrayList;

public class Account {
	
	double balance;
	boolean lock;
	public int accountNo;
	public String customerName;
	String remove="Uttag: ";
	String add   ="Insättning: ";
	public ArrayList<String> history = new ArrayList<String>(); 

	
	public void addToHistory(String transaction) {
	    history.add(transaction);
	    
	}
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void removeMoneyFromAccount(double removemoney, Account account) {
		
		account.balance -= removemoney;
		
		addToHistory(remove + removemoney + " kr från konto "  + account.getAccountNo());
	}

	public void addMoneyToAccount(double addmoney, Account account) {
		
		this.balance += addmoney;
		
		addToHistory(add + addmoney + " kr till konto "  + account.getAccountNo());
		
	}

	public void lockAccont(boolean lock) {
		this.lock = lock;
		
	}

	public boolean getAccontLock() {
		
		return this.lock;
	}

	public boolean alreeadyLockedAccont() {
		
		if (lock) { 
			return true; 
		} else { 
			return false; 
		}
		 
		
	}
	public void printTransHistory(ArrayList<String> history) {
		
		for (String mystring : history) { 
			System.out.println(mystring);
		}
	}





}
