package com.amdocs.test;

import com.amdocs.Bank.BankAccount;
import com.amdocs.Bank.CurrentAccount;
import com.amdocs.Bank.SavingsAccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount savAccount=new SavingsAccount("SAV001",0,0.03);
       BankAccount curAccount=new CurrentAccount("CUR001",0);
       savAccount.deposit(1500);
       savAccount.withDraw(200);
       System.out.println("Savings Account Balance : INR " +savAccount.CheckBalance()+"\n");
       System.out.println("Transferring from Savings Account to Current Account ");
       savAccount.Transfer(curAccount,300);
       
	   //BankAccount curAccount=new CurrentAccount("CUR001",4000);
       curAccount.deposit(3000);
       curAccount.withDraw(1000);
       System.out.println("Current Account Balance : INR " +curAccount.CheckBalance()+"\n");
       System.out.println("Transferring from Current Account to Savings Account ");
       curAccount.Transfer(savAccount,500);
	}

}
