package java1;


public class Account {
	
	double balance;
	boolean lock;

	

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





}
