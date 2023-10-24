package com.amdocs.Bank;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(String Account_Id,double Current_Balance)
	{
		super(Account_Id,Current_Balance);
	}

	@Override
	public void deposit(double Amount) {
		// TODO Auto-generated method stub
		super.deposit(Amount);
	}

	@Override
	public void withDraw(double Amount) {
		// TODO Auto-generated method stub
		if(Amount>0 && Current_Balance>=Amount+200)
		{
			super.withDraw(Amount);
			double fee=Amount+200;
			System.out.println("Withdrawn from Current Account : INR " + fee + "Including"
					+ " INR 200 withdrawl fee");
		}
		else
		{
			System.out.println("Invalid withdrawl or Insufficient Balance");
		}
		
	}

	@Override
	public double CheckBalance() {
		// TODO Auto-generated method stub
		Current_Balance=Current_Balance-200;
		return super.CheckBalance();
	}

}
