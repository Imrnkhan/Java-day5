package com.masai;
import java.util.Scanner;

public class AccountDetl {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Account type:");
		 String accountType = sc.nextLine();
		 
		 System.out.println("Enter account id:");
		 int accountId = sc.nextInt();
		 
		 System.out.println("Enter Balance:");
		 int balance = sc.nextInt();
		
		 Account a1 = new Account();
		
		a1.setAccountId(accountId);
		a1.setAccountType(accountType);
		a1.setBalance(balance);
		
		System.out.println("Enter Amount to be withdraw:");
		int amountWithdraw = sc.nextInt();
		
		int withdrawAmount = a1.getWithdrawAmount(amountWithdraw);
		
		if(a1.withdraw(withdrawAmount))
		{
			System.out.println("Balance amount after withdrawal:"+a1.getBalance());
		}
		else
		{
			System.out.println("Sorry!!! No enough balance");
		}
		
		
		
		System.out.println("===========================================");
		System.out.println("-------------Second type input--------------");
		
		   System.out.println("===Manually Entered Details===");
		   
		   System.out.println("Account Id : 2320");
		   System.out.println("Account Type: savings");
		   System.out.println("Entered Balance: -2");
		   System.out.println("Enter blow positive Amount");
		   System.out.println("------------------------------------------------");
		 
	   Account a2 = new Account();
	   
	   Account obj = a2.getAccountDetails(2320,"savings",-2);
	   
	   
	   if(a2.withdraw(200))
		{
		    System.out.println("after withdrawing 200-----------");
			System.out.println("Balance amount:"+a2.getBalance());
		}
		else
		{   
			System.out.println("to withdraw 200------------");
			System.out.println("Sorry!!! No enough balance");
		}
	   
	   
	   
	   
	
		
		 
	sc.close();	
	}

}