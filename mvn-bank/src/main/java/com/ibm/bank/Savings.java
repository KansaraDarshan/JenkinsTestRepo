package com.ibm.bank;

public class Savings extends Account {
 public  Savings()
 {
	 
 }
 public Savings(String holder)
 {
	 super(holder,MIN_SAV_BAL);//minimum balance is 1000
 }
@Override
public void withdraw(double amt) throws BalanceException {
	// TODO Auto-generated method stub
	if(amt<=balance-MIN_SAV_BAL)
	{
		balance-=amt;
		txns[idx++]=new Transaction("Debit",amt,balance);
	}
	else
	{
		throw new BalanceException("Insuff balance");
	}
}
 
   
}
