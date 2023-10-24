package com.amdocs.Bank;

public class BankAccount {
   protected String Account_Id;
   protected double Current_Balance;
   public BankAccount(String Account_Id,double Current_Balance)
   {
	  this.Account_Id=Account_Id;
	  this.Current_Balance=Current_Balance;
   }
   public void deposit(double Amount)
   {
	   if(Amount>0)
	   {
		   Current_Balance += Amount;
		   System.out.println("Deposited : INR " +Amount); 
	   }
	   else
	   {
		   System.out.println("Invalid Deposit Amount");
	   }
   }
   public void withDraw(double Amount)
   {
	   if(Amount > 0 && Current_Balance >= Amount)
	   {
		   Current_Balance -= Amount;
		   System.out.println("Withdrawn : INR " +Amount);
	   }
	   else
	   {
		   System.out.println("Insufficient Balance");
	   }
   }
   public double CheckBalance()
   {
	   double Amount=0;
	   double Intrest=Amount*0.03;
	   return Current_Balance + Intrest; 
   }
   public void Transfer(BankAccount targetAccount,double Amount)
   {
	   if(Amount<=this.Current_Balance)
	   {
		   this.withDraw(Amount);
		   targetAccount.deposit(Amount);
		   System.out.println("Transfered INR : " +Amount + " To " +targetAccount.getAccount_Id()+"\n");
	   }
	   else
	   {
		   System.out.println("Invalid Tranfer or Insufficent Balance");
	   }
   }
   public String getAccount_Id()
   {
	   return Account_Id;
   }
}
