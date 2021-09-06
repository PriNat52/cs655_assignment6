package edu.bu.met.cs665.hw1.a6;

import java.util.ArrayList;
import java.util.Iterator;

public class Addons extends CondinentDecorator {
    
	AutoBeverage beverage;
	private int milkcount=0;
	private int sugarcount=0;
	ArrayList<Drink> order = new ArrayList<Drink>();
	
	public Addons(AutoBeverage beverage) {
		this.beverage = beverage;
	}
	
	/*
	 * refactoring 3 - Composing Methods
	 * */
    @Override
	public void addMilk() {
		//checking for units and adding to the collection
		
		if(milkcount <= 2) {
		Drink data = new Drink("Milk");
		order.add(data);
		milkcount++;
		}
		
		if(milkcount > 3) {
			milkcount--;
		}
	}

	@Override
	public void addSugar() {
		//checking for units and adding to the collection
		
		if(sugarcount <= 2) {
		Drink data = new Drink("Sugar");
		order.add(data);
		sugarcount++;
		}
		
		if(sugarcount > 3) {
			sugarcount--;
		}
	}

	@Override
	public void createDrink(String beve) {
		beverage.createDrink(beve);
	}

	@Override
	public int getTotalNumberOfCondiments() {
		//calculated the total units added to the customer order
		
		Iterator<Drink> itr = order.iterator();	//creating iterator object
		itr.forEachRemaining(value-> {System.out.print(" "+value);});
		
		int total = sugarcount + milkcount;
		System.out.println(" --> Total Condiments: "+total);
		System.out.println();
		return total;
		}
}