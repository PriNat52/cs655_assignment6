package edu.bu.met.cs665.hw1.a6;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Beverage extends AutoBeverage {

	ArrayList<Drink> order = new ArrayList<Drink>();
	
	public void createDrink(String beverage) {
		//using regex for creating tea or coffee and then adding to thecollection

		String regex ="\\BAmericano|Espresso|Latte Macchiato\\B";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);	 // Input pattern to be searched
		
		String regexTea ="\\BBlack Tea|Green Tea|Yellow Tea\\B";
		Pattern patternTea = Pattern.compile(regexTea, Pattern.CASE_INSENSITIVE);	 // Input pattern to be searched
		
		if(!pattern.matcher(beverage).matches()) {	
			Drink data = new Drink(beverage);
			order.add(data);
		}
		
		if(!patternTea.matcher(beverage).matches()) {
			Drink data = new Drink(beverage);
			order.add(data);
		}
	}

	public int getTotalNumberOfCondiments() {
		return 0;
	}
	
	@Override
	public void addMilk() {}

	@Override
	public void addSugar() {}
}