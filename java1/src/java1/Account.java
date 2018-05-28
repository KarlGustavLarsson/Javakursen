package java1;

import java.util.ArrayList;

public class Account {
	
	double balance;
	boolean lock;
	public int accountNo;
	public String customerName;
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

	public void removeMoneyFromAccount(double removemoney) {
		
		
		this.balance -= removemoney;
		
	}

	public void addMoneyToAccount(double addmoney) {
		
		this.balance += addmoney;
		
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





}
