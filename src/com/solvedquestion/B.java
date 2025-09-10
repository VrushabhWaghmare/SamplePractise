package com.solvedquestion;

public class B extends A {

	@Override
	public void m1(int a, int b) {
		super.m1(a, b);                                       // “Hey, run the version of m1 that belongs to my parent class.”
		System.out.println("I am first overridded method");
		
	m1(5, 6);               // is a recursive call — the method is calling itself.
	m1(a, 25);
	
	}
	
	@Override
	public void m1(int a, String rollNum) {
		super.m1(a, rollNum);
		System.out.println("I am second overridded method");
		this.m1(5, 6);
	}
	
	public void m1() {
       System.out.println("I am simple method");
       this.m1(5, 8);
	}
	

}




/*
 * super.m1(a, b); = “Hey, run the version of m1 that belongs to my parent
 * class.”
 * 
 * ✨ Summary
 * 
 * You override a method to change or enhance behavior.
 * 
 * But super.m1(a, b); lets you still include the original method’s logic from
 * the superclass.
 * 
 * It’s like remixing a song—you keep the original melody but layer new beats
 * over it 🎶
 * 
 */