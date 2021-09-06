package edu.bu.met.cs665.hw1.a6;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestVendingMachine {

	private static Logger logger = Logger.getLogger(TestVendingMachine.class);
	
	public TestVendingMachine() {}

	/*JUnit Test: for coffee name*/
	@Test
	  public void testCoffeeName() {
		 AutoBeverage myDrink = new Beverage();
		 myDrink.createDrink("Americano");
		 assertEquals("Americano", myDrink.getBeverageName("Americano"));
	  }
	 
	/*JUnit Test: for tea name*/
	 @Test
	  public void testTeaName() {
		 AutoBeverage myDrink = new Beverage();
		 myDrink.createDrink("Black Tea");
		 assertEquals("Black Tea", myDrink.getBeverageName("Black Tea"));
	  }
	 
	 /*JUnit test: when added 0 units of condiments*/
		@Test
		public void testZeroCondimentNumber() {
			AutoBeverage myDrink = new Beverage();
			myDrink.createDrink("Latte Macchiato");
			logger.info("Your Order: "+ myDrink.getBeverageName("Latte Macchiato"));
					 
			 myDrink = new Addons(myDrink);
			 assertEquals(myDrink.getTotalNumberOfCondiments(), 0);
		}
		
		/*JUnit test: when added 0 units of milk and 1 unit of sugar*/
		@Test
		public void testLessCondimentNumber() {
			AutoBeverage myDrink = new Beverage();
			myDrink.createDrink("Americano");
			logger.info("Your Order: "+ myDrink.getBeverageName("Americano"));
			 	
			 //added only sugar
			 myDrink = new Addons(myDrink);
			 myDrink.addSugar();
			 
			 assertEquals(myDrink.getTotalNumberOfCondiments(), 1);
		}
	
	/*JUnit test: when added 4 units of condiments*/
	@Test
	public void testCondimentNumber() {
		AutoBeverage myDrink = new Beverage();
		myDrink.createDrink("Yellow Tea");
		logger.error("Your Order: "+ myDrink.getBeverageName("Yellow Tea"));
		 
		 //added 2 units of milk
		 myDrink = new Addons(myDrink);
		 myDrink.addMilk();
		 myDrink.addMilk();

		 //added 2 unit of sugar and total becomes 4
		 myDrink.addSugar();
		 myDrink.addSugar();
		 
		 assertEquals(myDrink.getTotalNumberOfCondiments(), 4);
	}
	
	/*JUnit test: when added more than 6 units of condiments*/
	@Test
	public void testExceededCondimentNumber() {
		AutoBeverage myDrink = new Beverage();
		myDrink.createDrink("Green Tea");
		logger.info("Your Order: "+ myDrink.getBeverageName("Green Tea"));
		 
		//added 4 units of milk and only 3 units accepted
		 myDrink = new Addons(myDrink);
		 myDrink.addMilk();
		 myDrink.addMilk();
		 myDrink.addMilk();
		 myDrink.addMilk();
			
		//added 4 units of sugar and only 3 units accepted
		 myDrink.addSugar();
		 myDrink.addSugar();
		 myDrink.addSugar();
		 myDrink.addSugar();

		 assertEquals(myDrink.getTotalNumberOfCondiments(), 6);
	}
}