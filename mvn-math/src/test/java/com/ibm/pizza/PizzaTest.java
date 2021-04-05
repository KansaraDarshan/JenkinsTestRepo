package com.ibm.pizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {
	Pizza p=null;
	@BeforeEach
	public void init()
	{
		p=new Pizza();
	}
	
	@Test
	public void toppingsCheck() throws tooMuchToppingsException, notValidPizzaTypeException
	{
		//write assertEquals insatead of the below
		//like assertEquals(250,p.odrer("m",1);
		p.order("L", 3);
		
	}
	
}
