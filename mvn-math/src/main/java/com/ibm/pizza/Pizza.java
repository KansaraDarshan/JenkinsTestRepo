package com.ibm.pizza;

public class Pizza {
		private int total;
		private int price;
	
	public void order(String size,int toppings) throws tooMuchToppingsException, notValidPizzaTypeException
	{
		if(toppings>5||toppings<2)
		{
			throw new tooMuchToppingsException("Kitna Khayega bhai");
		}
		if(size.equalsIgnoreCase("s"))

		{
			price=100;
		}
		else if(size.equalsIgnoreCase("m"))

		{
			price=200;
		}
		else if(size.equalsIgnoreCase("L"))

		{
			price=300;
		}
		else
			throw new notValidPizzaTypeException("Dusri jage pe jaa khaane!!");
		
		total=price+(toppings*50);
		System.out.print("Total bill is : "+total);
	}
}
