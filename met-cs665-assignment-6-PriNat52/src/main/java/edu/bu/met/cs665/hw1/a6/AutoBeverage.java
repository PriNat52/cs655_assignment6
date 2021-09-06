package edu.bu.met.cs665.hw1.a6;

import java.util.regex.Pattern;

/*
 * refactoring 2 - removed unwanted code
 * count the items totally added to the order was removed
 * */
class Drink {

	private String beverage;
	
	public Drink(String beverage) {	
		this.beverage = beverage;
	}
	public String toString() {
		return beverage;
    }
}

public abstract class AutoBeverage {
	
	public AutoBeverage(){}
	
	public abstract void createDrink(String beverage);	
	public abstract void addMilk();
	public abstract void addSugar();
	public abstract int getTotalNumberOfCondiments();
	
	public String getBeverageName(String beverage) {
		 //getting beverage name with conditioned to match the product name
		 
		 String regex ="\\BAmericano|Espresso|Latte Macchiato\\B";
			Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);	 // Input pattern to be searched
			
			String regexTea ="\\BBlack Tea|Green Tea|Yellow Tea\\B";
			Pattern patternTea = Pattern.compile(regexTea, Pattern.CASE_INSENSITIVE);	 // Input pattern to be searched
			
			if(!pattern.matcher(beverage).matches()) {
				return beverage;
			}
			
			if(!patternTea.matcher(beverage).matches()) {
				return beverage;
			}
			return null; 
	 }
}