package java1test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import java1.Account;
import java1.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AccountTest {
	
	private int threadCount = 200;
    private int amount = 1;
	    
	@Test
	public void getMoneyFromEmptyAccont() {
		Account testaccount = new Account();
		testaccount.setBalance(0);
		Assert.assertTrue(0 == testaccount.getBalance());
	}
	
	@Test
	public void addOnehundredToaccount() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson 1");
		Account  myaccount1 = testbank.findAccount(1000);
		myaccount1.setBalance(0.00);
		myaccount1.addMoneyToAccount(100, myaccount1);
		
		Assert.assertTrue(100 == myaccount1.getBalance());
		
	}
	
	@Test
	public void setNegativeValueToAccont() {
		Account testaccount = new Account();
		testaccount.setBalance(-1);
		
		Assert.assertTrue(-1 == testaccount.getBalance());
		
	}
	
	
	@Test
	public void removeOnehundredFromAccount() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson 1");
		Account  myaccount1 = testbank.findAccount(1000);
	
		myaccount1.setBalance(100.00);
		myaccount1.removeMoneyFromAccount(100.00, myaccount1);
		
		Assert.assertTrue(0 == myaccount1.getBalance());
	
	}
	
	@Test
	public void accountIslocked() {
		Account testaccount = new Account();
		testaccount.lockAccont(true);
		
		Assert.assertTrue(true == testaccount.getAccontLock());
		
	}
	@Test
	public void accountIsUnlocked() {
		Account testaccount = new Account();
		testaccount.lockAccont(false);
		
		Assert.assertTrue(false == testaccount.getAccontLock());
	
	}
	
	@Test
	public void lockAlreadyLockedAccont() {
		Account testaccount = new Account();
		testaccount.lockAccont(true);
		testaccount.alreeadyLockedAccont();
		
		Assert.assertTrue(true == testaccount.alreeadyLockedAccont());
	
	}
	@Test
	public void getAccountNoTen() {
		Account testaccount = new Account();
		testaccount.setAccountNo(10);
		Assert.assertTrue(10 == testaccount.getAccountNo());
		
	}
	
	@Test
	public void testAccountHistory() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson 1");
		Account  myaccount1 = testbank.findAccount(1000);
		myaccount1.setBalance(1000); 
		myaccount1.removeMoneyFromAccount(100, myaccount1);
		myaccount1.removeMoneyFromAccount(100, myaccount1);
		myaccount1.addMoneyToAccount(500, myaccount1);
		myaccount1.printTransHistory(myaccount1.history);
		Assert.assertTrue(1300 == myaccount1.getBalance());
		Assert.assertEquals("Uttag: 100.0 kr från konto 1000", myaccount1.history.get(0));
		Assert.assertEquals("Uttag: 100.0 kr från konto 1000", myaccount1.history.get(1));
		Assert.assertEquals("Insättning: 500.0 kr till konto 1000", myaccount1.history.get(2));
		
	}
	
	
	  @Test
	  public void testUpdateBalance() throws Exception {
			Bank testbank = new Bank();
		    testbank.addAccount("Kalle Olsson 1");
			Account  myaccount1 = testbank.findAccount(1000);
			myaccount1.setBalance(1000); 
	       
	        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
	        List<Future<Void>> futures = new ArrayList<Future<Void>>();
	        for (int x = 0; x < threadCount; x++) {
	            Callable<Void> callable = new Callable<Void>() {
	                @Override
	                public Void call() throws Exception {
	                	 myaccount1.addMoneyToAccount(amount, myaccount1);;
	                    return null;
	                }
	            };
	            Future<Void> submit = executorService.submit(callable);
	            futures.add(submit);
	        }
	 
	        List<Exception> exceptions = new ArrayList<Exception>();
	        for (Future<Void> future : futures) {
	            try {
	                future.get();
	            } catch (Exception e) {
	                exceptions.add(e);
	                e.printStackTrace(System.err);
	            }
	        }
	 
	        executorService.shutdown();
	 
	        Assert.assertTrue(1200 == myaccount1.getBalance());
	       
	    }
	

}
