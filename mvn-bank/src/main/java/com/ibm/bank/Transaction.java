package com.ibm.bank;

public class Transaction {
   private String type;
   private double amount;
   private double balance;
    	public Transaction() {
			// TODO Auto-generated constructor stub
		}
    	public Transaction(String type, double amount,double balance)
    	{
    		this.type=type;
    		this.amount=amount;
    		this.balance=balance;
    	}
    	public void print()
    	{
    		System.out.printf("%-5s\t%.2f\t%.2f\n",type,amount,balance);
    		
    	}
}
