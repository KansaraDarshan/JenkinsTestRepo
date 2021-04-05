package com.ibm.bank;

public class Current extends Account {
	protected double overdraft=10000; 
   public Current() {
	// TODO Auto-generated constructor stub
}
   public Current(String holder)
   {
	   super(holder,5000);
	   
   }
@Override
public void deposite(double amt) {
	// TODO Auto-generated method stub
	if(overdraft+amt>10000)
	{
		
		balance=overdraft+amt-10000;
		overdraft=10000;
	}
	else
	{
		overdraft+=amt;
	}
}
@Override
public void withdraw(double amt) throws BalanceException {
	// TODO Auto-generated method stub
	if(amt<=(balance+overdraft)) {
	if(amt>balance)
	{  
		overdraft=balance+overdraft-amt;
		balance=0;
	}
	else
	{
		balance-=amt;
	}
	}
	else
	{
		throw new BalanceException("insuff balance");
	}
}
public void showDetails()
{
	System.out.println("Balnce is "+balance+" Overdraft: "+overdraft);
}
   
}
