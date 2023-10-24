package com.amdocs.Bank;

public class SavingsAccount extends BankAccount {
      
	protected double Intrest;
	public SavingsAccount(String Account_Id,double Current_Balance,double Intrest)
	{
		super(Account_Id,Current_Balance);
		this.Intrest=Intrest;
	}
	@Override
	public void deposit(double Amount) {
		// TODO Auto-generated method stub
	    double Intrest = Amount*0.03;
		super.deposit(Amount);
		Current_Balance=Amount+Intrest;
		System.out.println("Intrest of INR " +Intrest + " added to Savings Account");
		System.out.println("Total Balance after Adding Intrest : " + (Current_Balance));
	}
	@Override
	public void withDraw(double Amount) {
		// TODO Auto-generated method stub
		super.withDraw(Amount);
		
	}
	@Override
	public void Transfer(BankAccount targetAccount, double Amount) {
		// TODO Auto-generated method stub
		super.Transfer(targetAccount, Amount);
		//System.out.println("Transferred INR :" + Amount + "To" +targetAccount.getAccount_Id());
	}
	
}
