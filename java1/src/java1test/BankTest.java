package java1test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java1.Account;
import java1.Bank;

public class BankTest {
	
	
	
	@Test
	public void testCreateNewAccount() {  
		
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		Assert.assertTrue(true == testbank.addAccount("Kalle Olsson"));
		
	}
	
	@Test
	public void testFindAccount() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		Assert.assertTrue(null  != testbank.findAccount(1000)); 
	
	}
	
	@Test
	public void testShowAccountSaldo() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		Account myaccount = testbank.findAccount(1000);
		myaccount.setBalance(1500.50);
		testbank.showAccountSaldo(myaccount);
		Assert.assertTrue(1500.50  == myaccount.getBalance()); 
	
	}
	
	@Test
	public void testMoveMoneybetweenAccounts() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		testbank.addAccount("Kalle Olsson");
		Account myaccount1 = new Account();
		myaccount1 = testbank.findAccount(1000);
		myaccount1.setBalance(1000);
		Account myaccount2 = new Account();
		myaccount2 = testbank.findAccount(1001);
		myaccount2.setBalance(0);
		testbank.moveMoneyBetweenAccounts(myaccount1, myaccount2, 100);
		Assert.assertTrue(900  == myaccount1.getBalance()); 
		Assert.assertTrue(100  == myaccount2.getBalance()); 
		Assert.assertTrue(1000 == myaccount1.getAccountNo()); 
		Assert.assertTrue(1001 == myaccount2.getAccountNo()); 
	
	}
	@Test
	public void testMoveMoneyOtherWay() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		testbank.addAccount("Kalle Olsson");
		Account myaccount1 = new Account();
		myaccount1 = testbank.findAccount(1001);
		myaccount1.setBalance(1000);
		Account myaccount2 = new Account();
		myaccount2 = testbank.findAccount(1000);
		myaccount2.setBalance(0);
		testbank.moveMoneyBetweenAccounts(myaccount1, myaccount2, 100);
		Assert.assertTrue(900  == myaccount1.getBalance()); 
		Assert.assertTrue(100  == myaccount2.getBalance()); 
		Assert.assertTrue(1001 == myaccount1.getAccountNo()); 
		Assert.assertTrue(1000 == myaccount2.getAccountNo()); 
	}
	@Test
	public void testshowSaldoOnAllAccounts() {
		Bank testbank = new Bank();
		testbank.addAccount("Kalle Olsson");
		testbank.addAccount("Kalle Olsson");
		testbank.addAccount("Pelle Persson");
		testbank.addAccount("Nisse Nilsson");
		testbank.addAccount("Hasse Hansson");
		Account myaccount1 = new Account();
		myaccount1 = testbank.findAccount(1000);
		myaccount1.setBalance(1000);
		Account myaccount2 = new Account();
		myaccount2 = testbank.findAccount(1001);
		myaccount2.setBalance(500);
		Account myaccount3 = new Account();
		myaccount3 = testbank.findAccount(1002);
		myaccount3.setBalance(3000);
		Account myaccount4 = new Account();
		myaccount4 = testbank.findAccount(1003);
		myaccount4.setBalance(600);
		Account myaccount5 = new Account();
		myaccount5 = testbank.findAccount(1004);
		myaccount5.setBalance(800);
		testbank.showAllAccontSaldo(testbank.bankaccounts);
		Assert.assertTrue(1000 == myaccount1.getBalance()); 
		Assert.assertTrue(500  == myaccount2.getBalance()); 
		Assert.assertTrue(3000 == myaccount3.getBalance()); 
		Assert.assertTrue(600  == myaccount4.getBalance()); 
		Assert.assertTrue(800  == myaccount5.getBalance()); 
	}
	
	
	
}
