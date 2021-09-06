package edu.bu.met.cs665.hw1.a6;

/*
 * Decorator Pattern - Assignment 6
 * Refactoring 1 - Implementing a pattern without changing the functionality
 * */

public abstract class CondinentDecorator extends AutoBeverage {
	
	public CondinentDecorator(){
        super();
    }
	public abstract void addMilk();
	public abstract void addSugar();
	public abstract int getTotalNumberOfCondiments();
}