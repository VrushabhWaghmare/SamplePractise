package com.solvedquestion;

public class A {

	static int result;

	public static void m1(int a, int b, float c, String d, char e) {          // OverLoading of m1 method.

		result = a + b;
		System.out.println("I am m1 method");
		System.out.println(result);
	}
	
	

	public  void m1(int a, int b) {
		System.out.println("I am first m1 method");
	}
	
	
	
	public void m1(int a, String rollNum ) {
        System.out.println("I am another m1 method");
	}
	
	
	

	public static void main(String[] args) {
		A method = new A();
		method.m1(1, 2, 3, "vrushabh", 'c');
        method.m1(5, 6);
	}
}