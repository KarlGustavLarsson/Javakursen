package java1test;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import java1.Account;



public class AccountTest {
	

	@Test
	public void getMoneyFromEmptyAccont() {
		Account testaccount = new Account();
		testaccount.setBalance(0);
		Assert.assertTrue(0 == testaccount.getBalance());
	}
	
	@Test
	public void addOnehundredToaccount() {
		Account testaccount = new Account();
		testaccount.setBalance(0.00);
		testaccount.addMoneyToAccount(100);
		
		Assert.assertTrue(100 == testaccount.getBalance());
		
	}
	
	@Test
	public void setNegativeValueToAccont() {
		Account testaccount = new Account();
		testaccount.setBalance(-1);
		
		Assert.assertTrue(-1 == testaccount.getBalance());
		
	}
	
	
	@Test
	public void removeOnehundredFromAccount() {
		Account testaccount = new Account();
		testaccount.setBalance(100.00);
		testaccount.removeMoneyFromAccount(100.00);
		
		Assert.assertTrue(0 == testaccount.getBalance());
	
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
		Account testaccount = new Account();
		testaccount.setAccountNo(1000);
		testaccount.setBalance(1500);
		testaccount.removeMoneyFromAccount(100);
		testaccount.addToHistory("Uttag: "  +  "100  kr"   );
		testaccount.removeMoneyFromAccount(200);
		testaccount.addToHistory("Uttag: "  +  "200  kr"   );
		Assert.assertTrue(10 == testaccount.history.indexOf(0));
		
	}
	
	
	
	

}
