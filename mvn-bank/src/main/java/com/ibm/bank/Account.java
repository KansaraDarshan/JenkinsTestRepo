package com.ibm.bank;

/**
 * 
 * This class represnts generalized bank account
 * @author ibmjavafsdmr06
 *
 */
abstract public class Account implements Banking {
private int acntNo;
private String holder;
protected double balance;

//aplication constants
public static final int INIT_ACT_NO=1001;
public static final double MIN_SAV_BAL=1000;
public static final double OD_LIMIT=10000;
public static final double INIT_CUR_BAL=5000;
public static final double MIN_CUR_BAL=0;

private static int autogen=INIT_ACT_NO;

protected Transaction[] txns;
protected int idx;



/*this is default construct*/

public Account()
{
	this("NoName",-1);
}
/** This is paramterized constructor*/
public Account(String holder, double balance) {
	
	this.acntNo = autogen++;
	this.holder = holder;
	this.balance = balance;
	
	txns=new Transaction[10];
	txns[idx++]=new Transaction("Opening",balance,balance);
}
public void summary()
{
	System.out.println("Summary: ");
	System.out.println("Account number: "+acntNo);
	System.out.println("Holder Name: "+holder);
	System.out.println("Balance: "+balance);
}
public void deposite(double amt)
{
	this.balance+=amt;
	System.out.println("Amount "+amt+" deposited");
	txns[idx++]=new Transaction("Credit",amt,balance);
}
abstract public void withdraw(double amt) throws BalanceException;
//{
	/*
	 * if(amt>this.balance) {
	 * System.out.println("No Sufficient Balance to withdraw this much amount."); }
	 * else { this.balance-=amt; System.out.println("Amount "+amt+" withdrawed"); }
	 */
//}
   // types this method after ading the transaction class
	public void statement()
	{
		System.out.println("Statement for A/C: "+acntNo);
		for(int i=0;i<idx;i++)
		{
			txns[i].print();
		}
	}
			  
	 
	
}
